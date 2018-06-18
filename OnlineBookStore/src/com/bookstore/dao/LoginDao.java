package com.bookstore.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bookstore.bean.User;
import com.bookstore.util.DataMySQL;



/**
 * 
 * @author Administrator
 */

public class LoginDao {
	public User login1(String id){
		Connection con = DataMySQL.getConnection();
		String sql = "select * from user where id=?";
		PreparedStatement pst = null;
		ResultSet rs = null ;
		User pu = null ;
		try {
		pst = con.prepareStatement(sql);
		pst.setString(1, id);
		rs = pst.executeQuery();
		if (rs.next()) {
		pu = new User();
		pu.setId(rs.getString("id"));
		pu.setUsername(rs.getString("username"));
		pu.setPIN(rs.getString("PIN"));
		pu.setSex(rs.getString("sex"));
		pu.setIdcard(rs.getString("idcard"));
		}
	}catch (SQLException e) {
		e.printStackTrace();
	}finally{
		try {
			if(rs!=null) { 
				rs.close();
			}
			if(con!=null) {
				con.close ();
			}
		}catch (Exception e2) {
			e2.printStackTrace() ;
		}
	}
	return pu;
	}
	
	public User login2(String id, String PIN){
		Connection con = DataMySQL.getConnection();
		String sql = "select * from user where id=? and PIN=?";
		PreparedStatement pst = null;
		ResultSet rs = null ;
		User pu = null ;
		try {
		pst = con.prepareStatement(sql);
		pst.setString(1, id);
		pst.setString(2, PIN);
		rs = pst.executeQuery();
		if (rs.next()) {
		pu = new User();
		pu.setId(rs.getString("id"));
		pu.setUsername(rs.getString("username"));
		pu.setPIN(rs.getString("PIN"));
		pu.setSex(rs.getString("sex"));
		pu.setIdcard(rs.getString("idcard"));
		}
	}catch (SQLException e) {
		e.printStackTrace();
	}finally{
		try {
			if(rs!=null) { 
				rs.close();
			}
			if(con!=null) {
				con.close ();
			}
		}catch (Exception e2) {
			e2.printStackTrace() ;
		}
	}
	return pu;
	}
}
