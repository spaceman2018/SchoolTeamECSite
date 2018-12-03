package com.internousdev.i1810c.action;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.i1810c.dao.MCategoryDAO;
import com.internousdev.i1810c.dao.ProductInfoDAO;
import com.internousdev.i1810c.dto.PaginationDTO;
import com.internousdev.i1810c.dto.ProductInfoDTO;
import com.internousdev.i1810c.util.InputChecker;
import com.internousdev.i1810c.util.Pagination;
import com.opensymphony.xwork2.ActionSupport;

public class SearchItemAction extends ActionSupport implements SessionAware{

	private String categoryId;
	private String keywords;
	private String pageNo;
	private Map<String,Object> session;
	private List<String> keywordsErrorMessageList=new ArrayList<String>();

	public String execute(){
		session.remove("reserve");
		String result=ERROR;
		if(!session.containsKey("mCategoryDtoList")){
			session.put("mCategoryDtoList", (new MCategoryDAO()).getMCategoryList());
		}
		if(categoryId==null){
			categoryId="1";
		}
		if(keywords==null){
			keywords="";
		}
		//検索バーに入力した値をInputCheckerで検証
		InputChecker inputChecker=new InputChecker();
		//keywordsをスペース区切りで分割したString型の配列を作成する。
		String[] keywordsList=keywords.replaceAll("[　 ]+"," ").trim().split(" ");
		for(String s:keywordsList){
			if(!s.equals("")){
				keywordsErrorMessageList=inputChecker.doCheck("検索ワード",s,0,16,true,true,true,true,false,true,false);
				if(!keywordsErrorMessageList.isEmpty()){
					break;
				}
			}
		}
		session.put("productInfoDtoList", null);
		if(keywordsErrorMessageList.isEmpty()){
			//検索ワードとプルダウンで選択したカテゴリに該当する商品一覧を取得
			ProductInfoDAO productInfoDao=new ProductInfoDAO();
			List<ProductInfoDTO> productInfoDtoList=new ArrayList<ProductInfoDTO>();
			switch(categoryId){
			case "1":	//全てのカテゴリ
				productInfoDtoList=productInfoDao.getProductInfoListALL(keywordsList);
				break;

			default:	//全てのカテゴリ以外
				productInfoDtoList=productInfoDao.getProductInfoListByKeywords(keywordsList,categoryId);
				break;
			}
			Iterator<ProductInfoDTO> iterator=productInfoDtoList.iterator();
			if(!iterator.hasNext()){
				productInfoDtoList=null;
			}
			//商品一覧のページ設定
			if(productInfoDtoList!=null){
				Pagination pagination=new Pagination();
				PaginationDTO paginationDto=new PaginationDTO();
				if(pageNo==null){
					paginationDto=pagination.initialize(productInfoDtoList, 9);
				}else{
					paginationDto=pagination.getPage(productInfoDtoList, 9, pageNo);
				}
				session.put("productInfoDtoList", paginationDto.getCurrentProductInfoPage());
				session.put("totalPageSize", paginationDto.getTotalPageSize());
				session.put("currentPageNumber", paginationDto.getCurrentPageNo());
				session.put("totalRecordSize", paginationDto.getTotalRecordSize());
				session.put("startRecordNo", paginationDto.getStartRecordNo());
				session.put("endRecordNo", paginationDto.getEndRecordNo());
				session.put("previousPageNo", paginationDto.getPreviousPageNo());
				session.put("nextPageNo", paginationDto.getNextPageNo());
			}
		}
		result=SUCCESS;
		return result;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public String getPageNo() {
		return pageNo;
	}

	public void setPageNo(String pageNo) {
		this.pageNo = pageNo;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public List<String> getKeywordsErrorMessageList() {
		return keywordsErrorMessageList;
	}

	public void setKeywordsErrorMessageList(List<String> keywordsErrorMessageList) {
		this.keywordsErrorMessageList = keywordsErrorMessageList;
	}
}
