package com.internousdev.i1810c.action;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.i1810c.dao.CartInfoDAO;
import com.internousdev.i1810c.dao.MCategoryDAO;
import com.internousdev.i1810c.dto.CartInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class DeleteCartAction extends ActionSupport implements SessionAware {

	private Map<String, Object> session;
	private Collection<String> checkList;

	public String execute() {
		if (!(session.containsKey("mCategoryDtoList"))) {
			session.put("mCategoryDtoList", (new MCategoryDAO()).getMCategoryList());
		}
		CartInfoDAO cartInfoDAO = new CartInfoDAO();
		int count = 0;
		List<String> checkListErrorMessageList = new ArrayList<String>();
		String userId = null;
		List<CartInfoDTO> cartInfoDtoList = new ArrayList<CartInfoDTO>();
		session.remove("checkListErrorMessageList");
		if (session.containsKey("loginId")) {
			userId = String.valueOf(session.get("loginId"));
		} else if (session.containsKey("tempUserId")) {
			userId = String.valueOf(session.get("tempUserId"));
		}
		// 商品をカートから削除
		if(checkList!=null){
			for (String productId : checkList) {
				count += cartInfoDAO.delete(userId, productId);
			}
		}
		cartInfoDtoList = cartInfoDAO.getCartInfoDtoList(userId);
		// 空のカートを購入・削除された時の対策
		Iterator<CartInfoDTO> iterator = cartInfoDtoList.iterator();
		if (!(iterator.hasNext())) {
			cartInfoDtoList = null;
			session.put("cartInfoDtoList", cartInfoDtoList);
			return ERROR;
		}
		if (count <= 0) {
			// session.checkListErrorMessageListにエラーメッセージを格納
			checkListErrorMessageList.add("チェックされていません。");
			session.put("checkListErrorMessageList", checkListErrorMessageList);
			return ERROR;
		}
		session.put("cartInfoDtoList", cartInfoDtoList);
		int totalPrice = cartInfoDAO.getTotalPrice(userId);
		session.put("totalPrice", totalPrice);
		return SUCCESS;
	}

	public Map<String, Object> getSession() {
		return session;
	}
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public Collection<String> getCheckList() {
		return checkList;
	}

	public void setCheckList(Collection<String> checkList) {
		this.checkList = checkList;
	}
}
