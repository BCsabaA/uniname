package com.barab.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.barab.utils.Database;
import com.barab.model.Role;

public class RoleDao implements IRole {
	
	private Connection connection = new Database().createConnection();
	private PreparedStatement pstmt;
	private ResultSet rs;

	@Override
	public List<Role> getAll() {
		List<Role> roles = new ArrayList<>();
		
		try {
			String sql = "SELECT * FROM roles;";
			pstmt = connection.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				roles.add(getObjectFromRs(rs));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return roles;
		
	}

	private Role getObjectFromRs(ResultSet rs) {
		
		Role role = null;
		try {
			role = new Role(
					rs.getLong("id"),
					rs.getString("name")
					);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return role;
		
	}

	@Override
	public Role getById(Long id) {
		Role role = null;
		
		try {
			String sql = "SELECT * FROM roles WHERE id=?;";
			pstmt = connection.prepareStatement(sql);
			pstmt.setLong(1, id);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				role = getObjectFromRs(rs);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return role;
	}

}
