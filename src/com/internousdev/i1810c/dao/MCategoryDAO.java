package com.internousdev.i1810c.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.internousdev.i1810c.dto.MCategoryDTO;
import com.internousdev.i1810c.util.DBConnector;

public class MCategoryDAO {
//	カテゴリ一覧を取得し、リストに格納
	public List<MCategoryDTO> getMCategoryList(){
		DBConnector dbConnector=new DBConnector();
		Connection connection=dbConnector.getConnection();
		List<MCategoryDTO> mCategoryDtoList=new ArrayList<MCategoryDTO>();
		String sql="select * from m_category";
		try{
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()){
				MCategoryDTO mCategoryDto=new MCategoryDTO();
				mCategoryDto.setId(resultSet.getInt("id"));
				mCategoryDto.setCategoryId(resultSet.getInt("category_id"));
				mCategoryDto.setCategoryName(resultSet.getString("category_name"));
				mCategoryDto.setCategoryDescription(resultSet.getString("category_description"));
				mCategoryDto.setInsertDate(resultSet.getDate("insert_date"));
				mCategoryDto.setUpdateDate(resultSet.getDate("update_date"));
				mCategoryDtoList.add(mCategoryDto);
			}
			Iterator<MCategoryDTO> iterator=mCategoryDtoList.iterator();
			if(!iterator.hasNext()){
				mCategoryDtoList=null;
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		finally{
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return mCategoryDtoList;
	}
}
