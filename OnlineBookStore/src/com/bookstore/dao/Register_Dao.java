package com.bookstore.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.bookstore.bean.User;
import com.bookstore.util.DataMySQL;

public class Register_Dao {
	public boolean judge(String id){
		Connection con = DataMySQL.getConnection();
		PreparedStatement pst = null;
		ResultSet rs = null;
		try{
		String sql ="select * from user where id = '"+id+"'";
		pst = con.prepareStatement(sql);
		rs = pst.executeQuery();
		if(rs.next()){
			return false;
		}
		}catch (Exception e) {
			e.printStackTrace();
			try {
				con.rollback();
			}catch(Exception sqlexp) {
				e.printStackTrace();
			}
		}
		return true;
	}
	public boolean insert(User user) {
		Connection con = DataMySQL.getConnection();
		boolean  result = false;
		
		PreparedStatement pst = null;
		try {
			String sql = "insert into user(id,username,PIN,sex,idcard) values(?,?,?,?,?)";
			pst = con.prepareStatement(sql);
			pst.setString(1,user.getId());
			pst.setString(2,user.getUsername());
			pst.setString(3,user.getPIN());
			pst.setString(4,user.getSex());
			pst.setString(5,user.getIdcard());
			if(pst.executeUpdate()>0)
			   result = true;
			else
				result = false;
			pst.close();
			con.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		return result;
		}
}
