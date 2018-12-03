package com.internousdev.i1810c.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.i1810c.dao.MCategoryDAO;
import com.internousdev.i1810c.dao.ProductInfoDAO;
import com.internousdev.i1810c.dto.PaginationDTO;
import com.internousdev.i1810c.dto.ProductInfoDTO;
import com.internousdev.i1810c.util.Pagination;
import com.opensymphony.xwork2.ActionSupport;

public class ProductListAction extends ActionSupport implements SessionAware{
	private Map<String, Object> session;
	private String keywords="";
	private int categoryId=1;

	public String execute(){
		session.remove("reserve");
		String result = ERROR;
		if (!(session.containsKey("mCategoryDtoList"))) {
			session.put("mCategoryDtoList", (new MCategoryDAO()).getMCategoryList());
		}
		ProductInfoDAO piDAO = new ProductInfoDAO();
		List<ProductInfoDTO> productInfoDtoList = piDAO.getProductInfoList();
		Pagination pn = new Pagination();
		PaginationDTO pnDTO = pn.initialize(productInfoDtoList, 9);
		session.put("totalPageSize", pnDTO.getTotalPageSize());
		session.put("currentPageNumber", pnDTO.getCurrentPageNo());
		session.put("totalRecordSize", pnDTO.getTotalRecordSize());
		session.put("startRecordNo", pnDTO.getStartRecordNo());
		session.put("endRecordNo", pnDTO.getEndRecordNo());
		session.put("pageNumberList", pnDTO.getPageNumberList());
		session.put("productInfoDtoList", pnDTO.getCurrentProductInfoPage());
		session.put("nextPageNo", pnDTO.getNextPageNo());
		session.put("previousPageNo", pnDTO.getPreviousPageNo());
		if(!session.containsKey("mCategoryList")){
			session.put("mCategoryDtoList", (new MCategoryDAO()).getMCategoryList());
		}
		result = SUCCESS;
		return result;
	}

	public Map<String, Object> getSession() {
		return session;
	}
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getKeywords() {
	    return keywords;
	}
	public void setKeywords(String keywords) {
	    this.keywords = keywords;
	}

	public int getCategoryId() {
	    return categoryId;
	}
	public void setCategoryId(int categoryId) {
	    this.categoryId = categoryId;
	}
}
