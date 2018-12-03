package com.internousdev.i1810c.action;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.i1810c.dao.CartInfoDAO;
import com.internousdev.i1810c.dao.MCategoryDAO;
import com.internousdev.i1810c.dto.CartInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class CartAction extends ActionSupport implements SessionAware {
	private Map<String, Object> session;

	public String execute() {
		if (!(session.containsKey("mCategoryDtoList"))) {
			session.put("mCategoryDtoList", (new MCategoryDAO()).getMCategoryList());
		}
		session.remove("reserve");
		String result = ERROR;
		String userId = null;
		CartInfoDAO cartInfoDao = new CartInfoDAO();
		List<CartInfoDTO> cartInfoDtoList = new ArrayList<CartInfoDTO>();
		// エラーメッセージが格納されていれば削除
		session.remove("checkListErrorMessageList");
		//カート情報がsessionに入っていた場合はremoveする
		session.remove("purchaseHistoryInfoDtoList");
		// ログインユーザーか一時ユーザーかを判定
		if (session.containsKey("loginId")) {
			userId = String.valueOf(session.get("loginId"));
		} else if (session.containsKey("tempUserId")) {
			userId = String.valueOf(session.get("tempUserId"));
		}
		cartInfoDtoList = cartInfoDao.getCartInfoDtoList(userId);
		// カートに何か入っているかの判定にはIteratorが便利
		Iterator<CartInfoDTO> iterator = cartInfoDtoList.iterator();
		// カートに何も入っていなかったらnullを格納
		if (!(iterator.hasNext())) {
			cartInfoDtoList = null;
		}
		session.put("cartInfoDtoList", cartInfoDtoList);
		int totalPrice = cartInfoDao.getTotalPrice(userId);
		session.put("totalPrice", totalPrice);
		result = SUCCESS;
		return result;
	}

	public Map<String, Object> getSession() {
		return session;
	}
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
