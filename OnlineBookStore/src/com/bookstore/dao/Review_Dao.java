package com.bookstore.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import com.bookstore.bean.*;
import com.bookstore.util.DataMySQL;

public class Review_Dao {
	/*
	 * 根据书本名字 	从 评论表中读取相关评论
	 */
	public List<Review> select(String bookname){
		Connection con = DataMySQL.getConnection();
		String sql = "select * from review where bookname=?";
		PreparedStatement pst = null;
		ResultSet rs = null ;
		List<Review> review = new ArrayList<Review>();
		Review pu = null ;
		try {
		pst = con.prepareStatement(sql);
		pst.setString(1, bookname);
		rs = pst.executeQuery();
		while (rs.next()) {
			pu = new Review();
			pu.setUsername(rs.getString("username"));
			pu.setBookname(rs.getString("bookname"));
			pu.setRstore(rs.getInt("rstore"));
			pu.setLogistics(rs.getInt("logistics"));
			pu.setRquality(rs.getInt("rquality"));
			pu.setReview(rs.getString("review"));
			pu.setTime(rs.getDate("time"));
			review.add(pu);
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
	return review;
	}
	
	public void insert(Review review){
		 
		/*	插入相关评论	*/
		Connection con = DataMySQL.getConnection();
			PreparedStatement pst = null;
			try{
				String sql = "insert into review(username,bookname,review,rstore,rquality,logistics) values(?,?,?,?,?,?)";
				pst = con.prepareStatement(sql);
				pst.setString(1,review.getUsername());
				pst.setString(2,review.getBookname());
				pst.setString(3,review.getReview());
				pst.setInt(4,review.getRstore());
				pst.setInt(5,review.getRquality());
				pst.setInt(6,review.getLogistics());
				pst.executeUpdate();
				pst.close();
				con.close();
			}catch (Exception e) {
				e.printStackTrace();
				try {
					con.rollback();
				}catch(Exception sqlexp) {
					e.printStackTrace();
				}
			}
	 }
}

