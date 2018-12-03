package com.internousdev.i1810c.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.i1810c.dto.ProductInfoDTO;
import com.internousdev.i1810c.util.DBConnector;;

public class ProductInfoDAO {
	//productInfoDtoListにDBから取得した値を格納するメソッド
	public List<ProductInfoDTO> getProductInfoList(){
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		List<ProductInfoDTO> productInfoDtoList = new ArrayList<ProductInfoDTO>();
		String sql = "select * from product_info where status = 0";
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				ProductInfoDTO piDTO = new ProductInfoDTO();
				piDTO.setId(rs.getInt("id"));
				piDTO.setProductId(rs.getInt("product_id"));
				piDTO.setProductName(rs.getString("product_name"));
				piDTO.setProductNameKana(rs.getString("product_name_kana"));
				piDTO.setProductDescription(rs.getNString("product_description"));
				piDTO.setCategoryId(rs.getInt("category_id"));
				piDTO.setPrice(rs.getInt("price"));
				piDTO.setImageFilePath(rs.getString("image_file_path"));
				piDTO.setImageFileName(rs.getString("image_file_name"));
				piDTO.setReleaseDate(rs.getDate("release_date"));
				piDTO.setReleaseCompany(rs.getString("release_company"));
				piDTO.setStatus(rs.getInt("status"));
				piDTO.setRegistDate(rs.getDate("regist_date"));
				piDTO.setUpdateDate(rs.getDate("update_date"));
				productInfoDtoList.add(piDTO);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return productInfoDtoList;
	}

	//product_idの値を条件にDBの情報を取得するメソッド
	public ProductInfoDTO getProductInfo(int productId){
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		ProductInfoDTO piDTO = new ProductInfoDTO();
		String sql = "select * from product_info where product_id=? and status = 0";
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, productId);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				piDTO.setId(rs.getInt("id"));
				piDTO.setProductId(rs.getInt("product_id"));
				piDTO.setProductName(rs.getString("product_name"));
				piDTO.setProductNameKana(rs.getString("product_name_kana"));
				piDTO.setProductDescription(rs.getNString("product_description"));
				piDTO.setCategoryId(rs.getInt("category_id"));
				piDTO.setPrice(rs.getInt("price"));
				piDTO.setImageFilePath(rs.getString("image_file_path"));
				piDTO.setImageFileName(rs.getString("image_file_name"));
				piDTO.setReleaseDate(rs.getDate("release_date"));
				piDTO.setReleaseCompany(rs.getString("release_company"));
				piDTO.setStatus(rs.getInt("status"));
				piDTO.setRegistDate(rs.getDate("regist_date"));
				piDTO.setUpdateDate(rs.getDate("update_date"));
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return piDTO;
	}

	//カテゴリIDの値を条件にランダムで指定された件数のDB情報を取得し、productInfoDtoListに格納するメソッド。
	public List<ProductInfoDTO> getProductInfoListByCategoryId(int categoryId, int productId, int limitOffset, int limitRowCount){
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		List<ProductInfoDTO> productInfoDtoList = new ArrayList<ProductInfoDTO>();
		String sql = "select * from product_info where status=0 and category_id=? and product_id not in(?) order by rand() limit ?,?";
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, categoryId);
			ps.setInt(2, productId);
			ps.setInt(3, limitOffset);
			ps.setInt(4, limitRowCount);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				ProductInfoDTO piDTO = new ProductInfoDTO();
				piDTO.setId(rs.getInt("id"));
				piDTO.setProductId(rs.getInt("product_id"));
				piDTO.setProductName(rs.getString("product_name"));
				piDTO.setProductNameKana(rs.getString("product_name_kana"));
				piDTO.setProductDescription(rs.getNString("product_description"));
				piDTO.setCategoryId(rs.getInt("category_id"));
				piDTO.setPrice(rs.getInt("price"));
				piDTO.setImageFilePath(rs.getString("image_file_path"));
				piDTO.setImageFileName(rs.getString("image_file_name"));
				piDTO.setReleaseDate(rs.getDate("release_date"));
				piDTO.setReleaseCompany(rs.getString("release_company"));
				piDTO.setStatus(rs.getInt("status"));
				piDTO.setRegistDate(rs.getDate("regist_date"));
				piDTO.setUpdateDate(rs.getDate("update_date"));
				productInfoDtoList.add(piDTO);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return productInfoDtoList;
	}

	//商品名(+ふりがな)のkeywordでDBからデータを取り出すメソッド
	public List<ProductInfoDTO> getProductInfoListALL(String[] keywordsList){
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		List<ProductInfoDTO> productInfoDtoList = new ArrayList<ProductInfoDTO>();
		String sql = "select * from product_info where";
		boolean initializeFlag = true;
		for(String keyword : keywordsList){
			if(initializeFlag){
				sql += " (product_name like '%" + keyword + "%' or product_name_kana like '%" + keyword + "%')";
				initializeFlag = false;
			}else{
				sql += " or (product_name like '%" + keyword + "%' or product_name_kana like '%" + keyword + "%')";
			}
		}
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				ProductInfoDTO piDTO = new ProductInfoDTO();
				piDTO.setId(rs.getInt("id"));
				piDTO.setProductId(rs.getInt("product_id"));
				piDTO.setProductName(rs.getString("product_name"));
				piDTO.setProductNameKana(rs.getString("product_name_kana"));
				piDTO.setProductDescription(rs.getNString("product_description"));
				piDTO.setCategoryId(rs.getInt("category_id"));
				piDTO.setPrice(rs.getInt("price"));
				piDTO.setImageFilePath(rs.getString("image_file_path"));
				piDTO.setImageFileName(rs.getString("image_file_name"));
				piDTO.setReleaseDate(rs.getDate("release_date"));
				piDTO.setReleaseCompany(rs.getString("release_company"));
				piDTO.setStatus(rs.getInt("status"));
				piDTO.setRegistDate(rs.getDate("regist_date"));
				piDTO.setUpdateDate(rs.getDate("update_date"));
				productInfoDtoList.add(piDTO);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return productInfoDtoList;
	}

		//カテゴリIDごとに商品名(+ふりがな)のkeywordでDBからデータを取り出すメソッド
	public List<ProductInfoDTO> getProductInfoListByKeywords(String[] keywordsList, String categoryId){
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		List<ProductInfoDTO> productInfoDtoList = new ArrayList<ProductInfoDTO>();
		String sql = "select * from product_info where";
		boolean initializeFlag = true;
		for(String keyword : keywordsList){
			if(initializeFlag){
				sql += " category_id=" + categoryId + " and ((product_name like '%" + keyword + "%' or product_name_kana like '%" + keyword + "%')";
				initializeFlag = false;
			}else{
				sql += " or (product_name like '%" + keyword + "%' or product_name_kana like '%" + keyword + "%')";
			}
		}
		sql += ")";
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				ProductInfoDTO piDTO = new ProductInfoDTO();
				piDTO.setId(rs.getInt("id"));
				piDTO.setProductId(rs.getInt("product_id"));
				piDTO.setProductName(rs.getString("product_name"));
				piDTO.setProductNameKana(rs.getString("product_name_kana"));
				piDTO.setProductDescription(rs.getNString("product_description"));
				piDTO.setCategoryId(rs.getInt("category_id"));
				piDTO.setPrice(rs.getInt("price"));
				piDTO.setImageFilePath(rs.getString("image_file_path"));
				piDTO.setImageFileName(rs.getString("image_file_name"));
				piDTO.setReleaseDate(rs.getDate("release_date"));
				piDTO.setReleaseCompany(rs.getString("release_company"));
				piDTO.setStatus(rs.getInt("status"));
				piDTO.setRegistDate(rs.getDate("regist_date"));
				piDTO.setUpdateDate(rs.getDate("update_date"));
				productInfoDtoList.add(piDTO);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return productInfoDtoList;
	}
}
