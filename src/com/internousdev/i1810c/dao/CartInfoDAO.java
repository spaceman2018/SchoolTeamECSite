package com.internousdev.i1810c.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.i1810c.dto.CartInfoDTO;
import com.internousdev.i1810c.util.DBConnector;

public class CartInfoDAO {
	// ログインユーザーのカートに入っている商品情報をリストとして取得
	public List<CartInfoDTO> getCartInfoDtoList(String loginId) {
		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();
		List<CartInfoDTO> cartInfoDtoList = new ArrayList<CartInfoDTO>();
		String sql = "select" + " ci.id as id," + " ci.user_id as user_id," + " ci.temp_user_id as temp_user_id,"
				+ " ci.product_id as product_id," + " sum(ci.product_count) as product_count," + " pi.price as price,"
				+ " pi.regist_date as regist_date," + " pi.update_date as update_date,"
				+ " pi.product_name as product_name," + " pi.product_name_kana as product_name_kana,"
				+ " pi.product_description as product_description," + " pi.category_id as category_id,"
				+ " pi.image_file_path as image_file_path, " + " pi.image_file_name as image_file_name, "
				+ " pi.release_date as release_date," + " pi.release_company as release_company,"
				+ " pi.status as status," + " (sum(ci.product_count) * pi.price) as subtotal" + " FROM cart_info as ci"
				+ " LEFT JOIN product_info as pi" + " ON ci.product_id = pi.product_id" + " WHERE ci.user_id = ?"
				+ " group by product_id";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, loginId);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				CartInfoDTO cartInfoDTO = new CartInfoDTO();
				cartInfoDTO.setId(resultSet.getInt("id"));
				cartInfoDTO.setUserId(resultSet.getString("user_id"));
				cartInfoDTO.setTempUserId(resultSet.getString("temp_user_id"));
				cartInfoDTO.setProductId(resultSet.getInt("product_id"));
				cartInfoDTO.setProductCount(resultSet.getInt("product_count"));
				cartInfoDTO.setPrice(resultSet.getInt("price"));
				cartInfoDTO.setRegistDate(resultSet.getDate("regist_date"));
				cartInfoDTO.setUpdateDate(resultSet.getDate("update_date"));
				cartInfoDTO.setProductName(resultSet.getString("product_name"));
				cartInfoDTO.setProductNameKana(resultSet.getString("product_name_kana"));
				cartInfoDTO.setProductDescription(resultSet.getString("product_description"));
				cartInfoDTO.setCategoryId(resultSet.getInt("category_id"));
				cartInfoDTO.setImageFilePath(resultSet.getString("image_file_path"));
				cartInfoDTO.setImageFileName(resultSet.getString("image_file_name"));
				cartInfoDTO.setReleaseDate(resultSet.getDate("release_date"));
				cartInfoDTO.setReleaseCompany(resultSet.getString("release_company"));
				cartInfoDTO.setStatus(resultSet.getString("status"));
				cartInfoDTO.setSubtotal(resultSet.getInt("subtotal"));
				cartInfoDtoList.add(cartInfoDTO);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return cartInfoDtoList;
	}
	// 全種類の商品の合計金額を計算
	public int getTotalPrice(String userId) {
		int totalPrice = 0;
		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();
		String sql = "select sum(product_count * price) as total_price from cart_info where user_id=? group by user_id";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, userId);
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				totalPrice = resultSet.getInt("total_price");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return totalPrice;
	}
	// カートに商品を追加
	public int regist(String userId, String tempUserId, int productId, String productCount, int price) {
		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();
		int count = 0;
		String sql = "insert into cart_info(user_id, temp_user_id, product_id, product_count, price, regist_date, update_date)"
				+ " values (?, ?, ?, ?, ?, now(), now())";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, userId);
			preparedStatement.setString(2, tempUserId);
			preparedStatement.setInt(3, productId);
			preparedStatement.setString(4, productCount);
			preparedStatement.setInt(5, price);
			count = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return count;
	}
	// カートから特定の商品を削除
	public int delete(String userId, String productId) {
		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();
		int count = 0;
		String sql = "delete from cart_info where user_id=? and product_id=?";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, userId);
			preparedStatement.setString(2, productId);
			count = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return count;
	}
	// カートから全ての商品を削除
	public int deleteAll(String userId) {
		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();
		int count = 0;
		String sql = "delete from cart_info where user_id=?";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, userId);
			count = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return count;
	}
	// 一時ユーザーのカート情報をログインユーザーのカート情報に書き換え
	public int linkToLoginId(String tempUserId, String loginId) {
		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();
		int count = 0;
		String sql = "update cart_info set user_id=?,temp_user_id=null where temp_user_id=?";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, loginId);
			preparedStatement.setString(2, tempUserId);
			count = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return count;
	}
}
