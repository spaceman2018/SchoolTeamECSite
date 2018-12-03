package com.internousdev.i1810c.util;

import java.util.ArrayList;
import java.util.List;

import com.internousdev.i1810c.dto.PaginationDTO;
import com.internousdev.i1810c.dto.ProductInfoDTO;

public class Pagination {
	//1ページ目を設定
	public PaginationDTO initialize(List<ProductInfoDTO> list,int pageSize){
		return getPage(list,pageSize,"1");
	}

	public PaginationDTO getPage(List<ProductInfoDTO> list,int pageSize,String pageNo){
		PaginationDTO paginationDto=new PaginationDTO();
		//ページ数
		paginationDto.setTotalPageSize((int)(Math.ceil((double)(list.size()) / pageSize)));
		//現在のページ番号
		paginationDto.setCurrentPageNo(Integer.parseInt(pageNo));
		//最大レコード番号
		paginationDto.setTotalRecordSize(list.size()-1);
		//現在のページに対する開始レコード番号（オフセット）
		paginationDto.setStartRecordNo(pageSize*(paginationDto.getCurrentPageNo() - 1));
		//現在のページに対する終了レコード番号
		paginationDto.setEndRecordNo(Math.min(paginationDto.getStartRecordNo() + pageSize - 1,list.size()-1));
		//前ページ番号をListに格納
		List<Integer> pageNumberList=new ArrayList<Integer>();
		for(int pageNumber=1;pageNumber <= paginationDto.getTotalPageSize();pageNumber++){
			pageNumberList.add(pageNumber);
		}
		//現在のページに表示するレコード番号をListに格納
		List<ProductInfoDTO> productInfoPages=new ArrayList<ProductInfoDTO>();
		for(int pageNumberOffset=paginationDto.getStartRecordNo();pageNumberOffset <= paginationDto.getEndRecordNo();pageNumberOffset++){
			productInfoPages.add(list.get(pageNumberOffset));
		}
		paginationDto.setCurrentProductInfoPage(productInfoPages);
		//前のページの設定
		if(paginationDto.getStartRecordNo()-1 >= 0){
			paginationDto.setPreviousPageNo(paginationDto.getCurrentPageNo() - 1);
		}
		//次のページの設定
		if(paginationDto.getStartRecordNo() + pageSize < paginationDto.getTotalRecordSize()){
			paginationDto.setNextPageNo(paginationDto.getCurrentPageNo() + 1);
		}
		return paginationDto;
	}

}
