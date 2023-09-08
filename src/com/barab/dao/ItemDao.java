package com.barab.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ItemDao {
	
	private Connection connection = new com.barab.utils.Database().createConnection();
	//private ResultSet rs;
	private PreparedStatement pstmt;


//	@Override
//	public Item getById(int id) {
//		Item item = null;
//		try {
//			String sql = "SELECT * FROM items WHERE id = ?;";
//			pstmt = connection.prepareStatement(sql);
//			pstmt.setInt(1, id);
//			rs = pstmt.executeQuery();
//			if (rs.next()) {
//				item = getObjectFromRs(rs);
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		return item;
//	}
	
	public boolean save(){
		boolean result = true;		
		try {
			String sql = "INSERT INTO users (email, roleId) VALUES (?,?);";
			pstmt = connection.prepareStatement(sql);
			pstmt.setString(1, System.getProperty("user.name"));
			pstmt.setString(2, "2");
			pstmt.executeUpdate();
			System.out.println(System.getProperty("user.name"));
			System.out.println(connection.getSchema());
		} catch (SQLException e) {
			System.out.println("SQL hiba");
			e.printStackTrace();  
			result = false;
		}
		return result;
	}


//	@Override
//	public Item getObjectFromRs(ResultSet rs) {
//		Item item = null;;
//		try {
//			item = new Item(
//					rs.getInt("id"), 
//					rs.getString("name")
//					);
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		return item;
//	}

}
