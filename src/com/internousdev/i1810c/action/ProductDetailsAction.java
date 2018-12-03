package com.internousdev.i1810c.action;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.text.RandomStringGenerator;
import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.i1810c.dao.MCategoryDAO;
import com.internousdev.i1810c.dao.ProductInfoDAO;
import com.internousdev.i1810c.dto.ProductInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ProductDetailsAction extends ActionSupport implements SessionAware {
	private Map<String, Object> session;
	private String categoryId;
	private int productId;
	private String originalToken;

	@SuppressWarnings("unchecked")
	public String execute() {
		String result = ERROR;
		if (!(session.containsKey("mCategoryDtoList"))) {
			session.put("mCategoryDtoList", (new MCategoryDAO()).getMCategoryList());
		}
		ProductInfoDAO piDAO = new ProductInfoDAO();
		ProductInfoDTO piDTO = new ProductInfoDTO();
		piDTO = piDAO.getProductInfo(productId);
		if (piDTO.getId() != 0) {
			session.put("id", piDTO.getId());
			List<Integer> productIdList = new ArrayList<Integer>();
			if (session.containsKey("productIdList")) {
				productIdList = (List<Integer>) session.get("productIdList");
			}
			productIdList.add(piDTO.getProductId());
			session.put("productIdList", productIdList);
			session.put("productName", piDTO.getProductName());
			session.put("productNameKana", piDTO.getProductNameKana());
			session.put("imageFilePath", piDTO.getImageFilePath());
			session.put("imageFileName", piDTO.getImageFileName());
			session.put("price", piDTO.getPrice());
			session.put("releaseCompany", piDTO.getReleaseCompany());
			session.put("releaseDate", piDTO.getReleaseDate());
			session.put("productDescription", piDTO.getProductDescription());
			session.put("registDate", piDTO.getRegistDate());
			session.put("updateDate", piDTO.getUpdateDate());
			session.put("categoryId", piDTO.getCategoryId());
			List<Integer> productCountList = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
			session.put("productCountList", productCountList);
			List<ProductInfoDTO> productInfoDtoList = new ArrayList<ProductInfoDTO>();
			productInfoDtoList = piDAO.getProductInfoListByCategoryId(piDTO.getCategoryId(), piDTO.getProductId(), 0,
					3);
			Iterator<ProductInfoDTO> iterator = productInfoDtoList.iterator();
			if (!(iterator.hasNext())) {
				productCountList = null;
			}
			if (!productInfoDtoList.isEmpty() || productCountList == null) {
				session.put("productInfoDtoList", productInfoDtoList);
				result = SUCCESS;
			}

			originalToken = generateRandomString(32);
			List<String> originalTokenList = new ArrayList<String>();
			if (session.containsKey("originalTokenList")) {
				originalTokenList = (List<String>) session.get("originalTokenList");
			}
			originalTokenList.add(originalToken);
			session.put("originalTokenList", originalTokenList);
		}
		return result;
	}

	// ランダムな文字列を生成する
	public static String generateRandomString(final int length) {
		return new RandomStringGenerator.Builder() // ビルダーを生成
				.withinRange('0', 'z') // 生成する文字の範囲を指定
				.filteredBy(Character::isLetterOrDigit) // 生成される文字を抽出する条件を指定
				.build() // RandomStringGenerator をインスタンス化
				.generate(length); // 指定した長さの文字列を取得
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getOriginalToken() {
		return originalToken;
	}

	public void setOriginalToken(String originalToken) {
		this.originalToken = originalToken;
	}
}
