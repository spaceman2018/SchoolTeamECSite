package com.internousdev.i1810c.dto;

import java.util.ArrayList;
import java.util.List;

public class PaginationDTO {

	//総ページ数
	private int totalPageSize;
	//現在のページ番号
	private int currentPageNo;
	//最大レコード番号
	private int totalRecordSize;
	//開始レコード番号
	private int startRecordNo;
	//終了レコード番号
	private int endRecordNo;
	//表示するページ番号のリスト
	private List<Integer> pageNumberList=new ArrayList<Integer>();
	//現在のページに表示する商品のリスト
	private List<ProductInfoDTO> currentProductInfoPage;
	//次のページ番号
	private int nextPageNo;
	//前のページ番号
	private int previousPageNo;

	public int getTotalPageSize() {
		return totalPageSize;
	}
	public void setTotalPageSize(int totalPageSize) {
		this.totalPageSize = totalPageSize;
	}
	public int getCurrentPageNo() {
		return currentPageNo;
	}
	public void setCurrentPageNo(int currentPageNo) {
		this.currentPageNo = currentPageNo;
	}
	public int getTotalRecordSize() {
		return totalRecordSize;
	}
	public void setTotalRecordSize(int totalRecordSize) {
		this.totalRecordSize = totalRecordSize;
	}
	public int getStartRecordNo() {
		return startRecordNo;
	}
	public void setStartRecordNo(int startRecordNo) {
		this.startRecordNo = startRecordNo;
	}
	public int getEndRecordNo() {
		return endRecordNo;
	}
	public void setEndRecordNo(int endRecordNo) {
		this.endRecordNo = endRecordNo;
	}
	public List<Integer> getPageNumberList() {
		return pageNumberList;
	}
	public void setPageNumberList(List<Integer> pageNumberList) {
		this.pageNumberList = pageNumberList;
	}
	public List<ProductInfoDTO> getCurrentProductInfoPage() {
		return currentProductInfoPage;
	}
	public void setCurrentProductInfoPage(List<ProductInfoDTO> currentProductInfoPage) {
		this.currentProductInfoPage = currentProductInfoPage;
	}
	public int getNextPageNo() {
		return nextPageNo;
	}
	public void setNextPageNo(int nextPageNo) {
		this.nextPageNo = nextPageNo;
	}
	public int getPreviousPageNo() {
		return previousPageNo;
	}
	public void setPreviousPageNo(int previousPageNo) {
		this.previousPageNo = previousPageNo;
	}
}
