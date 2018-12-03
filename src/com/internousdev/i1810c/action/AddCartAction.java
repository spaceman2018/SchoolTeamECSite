package com.internousdev.i1810c.action;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.i1810c.dao.CartInfoDAO;
import com.internousdev.i1810c.dao.MCategoryDAO;
import com.internousdev.i1810c.dao.ProductInfoDAO;
import com.internousdev.i1810c.dto.CartInfoDTO;
import com.internousdev.i1810c.dto.ProductInfoDTO;
import com.internousdev.i1810c.util.CommonUtility;
import com.opensymphony.xwork2.ActionSupport;

public class AddCartAction extends ActionSupport implements SessionAware {
	private Map<String, Object> session;
	private String productCount;
	private String originalToken;

	@SuppressWarnings("unchecked")
	public String execute() {
		String result = ERROR;
		String userId = null;
		String tempUserId = null;
		int index = 0;
		boolean flg = false;

		// ログイン状態で商品詳細画面を開いて別の画面でログアウトされた時の対策
		if (!(session.containsKey("originalTokenList"))) {
			return result;
		}

		// productCountに格納されている個数を意味する文字列(ドロップダウンで選んだ数字が先頭になっている)を分割して配列にして先頭を取得
		productCount = productCount.split(" ,", 0)[0];
		if (Integer.parseInt(productCount) <= 0 || Integer.parseInt(productCount) > 5) {
			return "invalid";
		}

		List<String> originalTokenList = new ArrayList<String>();
		originalTokenList = (List<String>) session.get("originalTokenList");
		Iterator<String> iterator0 = originalTokenList.iterator();
		if (!(iterator0.hasNext())) {
			originalTokenList = null;
		} else {
			for (int i = originalTokenList.size() - 1; i >= 0; i--) {
				if (originalToken.equals(originalTokenList.get(i))) {
					originalTokenList.remove(i);
					index = i;
					flg = true;
					break;
				}
			}
		}
		if (!flg) {
			return result = SUCCESS;
		}

		session.remove("checkListErrorMessageList");
		// ログインユーザーでも一時ユーザーでもない場合にランダムなIDを与えて一時ユーザーにする
		if (!(session.containsKey("loginId")) && !(session.containsKey("tempUserId"))) {
			CommonUtility commonUtility = new CommonUtility();
			session.put("tempUserId", commonUtility.getRandomValue());
		}
		// ログインユーザーの場合
		if (session.containsKey("loginId")) {
			userId = String.valueOf(session.get("loginId"));
		}
		// 一時ユーザーの場合
		if (!(session.containsKey("loginId")) && session.containsKey("tempUserId")) {
			userId = String.valueOf(session.get("tempUserId"));
			tempUserId = String.valueOf(session.get("tempUserId"));
		}
		CartInfoDAO cartInfoDao = new CartInfoDAO();
		// 商品をカートに追加して更新行数を取得
		List<Integer> productIdList = new ArrayList<Integer>();
		productIdList = (List<Integer>) session.get("productIdList");
		int productId = productIdList.get(index);
		productIdList.remove(index);
		ProductInfoDAO piDAO = new ProductInfoDAO();
		ProductInfoDTO piDTO = new ProductInfoDTO();
		piDTO = piDAO.getProductInfo(productId);
		int price = piDTO.getPrice();
		int count = cartInfoDao.regist(userId, tempUserId, productId, productCount, price);
		if (count > 0) {
			result = SUCCESS;
		}
		List<CartInfoDTO> cartInfoDtoList = new ArrayList<CartInfoDTO>();
		cartInfoDtoList = cartInfoDao.getCartInfoDtoList(userId);
		Iterator<CartInfoDTO> iterator = cartInfoDtoList.iterator();
		if (!(iterator.hasNext())) {
			cartInfoDtoList = null;
		}
		if (!(session.containsKey("mCategoryDtoList"))) {
			session.put("mCategoryDtoList", (new MCategoryDAO()).getMCategoryList());
		}
		session.put("cartInfoDtoList", cartInfoDtoList);
		int totalPrice = cartInfoDao.getTotalPrice(userId);
		session.put("totalPrice", totalPrice);
		return result;
	}

	/**
	 * sessionを取得します。
	 *
	 * @return session
	 */
	public Map<String, Object> getSession() {
		return session;
	}

	/**
	 * sessionを設定します。
	 *
	 * @param session
	 *            session
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	/**
	 * productCountを取得します。
	 *
	 * @return productCount
	 */
	public String getProductCount() {
		return productCount;
	}

	/**
	 * productCountを設定します。
	 *
	 * @param productCount
	 *            productCount
	 */
	public void setProductCount(String productCount) {
		this.productCount = productCount;
	}

	/**
	 * originalTokenを取得します。
	 *
	 * @return originalToken
	 */
	public String getOriginalToken() {
		return originalToken;
	}

	/**
	 * originalTokenを設定します。
	 *
	 * @param originalToken
	 *            originalToken
	 */
	public void setOriginalToken(String originalToken) {
		this.originalToken = originalToken;
	}
}
