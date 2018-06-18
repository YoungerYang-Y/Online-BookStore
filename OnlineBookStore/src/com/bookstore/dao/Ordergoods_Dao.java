package com.bookstore.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bookstore.bean.Book;
import com.bookstore.bean.Ordergoods;
import com.bookstore.util.DataMySQL;

public class Ordergoods_Dao {
	
	public void insert_ordergoods(String id,String ordernumber,int cartserial,String receiver,String rphone,String address){
			//	插入订单数据到数据库
			Connection con = DataMySQL.getConnection();
			PreparedStatement pst = null;
			try{
				String sql = "insert into ordergoods(id,ordernumber,cartserial,receiver,rphone,address) values(?,?,?,?,?,?)";
				pst = con.prepareStatement(sql);
				pst.setString(1,id);				//用户id
				pst.setString(2,ordernumber);		//订单编号
				pst.setInt(3,cartserial);			//购物车序列号
				pst.setString(4,receiver);			//收件人姓名
				pst.setString(5,rphone);			//电话
				pst.setString(6,address);			//地址
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
	
	/*查询  某个用户id	的订单数据		*/
	public List<Ordergoods> find_Ordergoods(String id){
		Connection con = DataMySQL.getConnection();
		String sql = "select * from ordergoods where id = '"+id+"' ";		//根据用户id进行查询
		PreparedStatement pst = null;
		ResultSet rs 	= null ;
		List<Ordergoods> list   = new ArrayList<Ordergoods>(); ;
		try {
		pst = con.prepareStatement(sql);
		rs = pst.executeQuery();
		while(rs.next()) {
			Ordergoods 	pu	=	new	Ordergoods();
			pu.setSerial(rs.getInt("serial"));
			pu.setId(rs.getString("id"));
			pu.setOrdernumber(rs.getString("ordernumber"));
			pu.setCartserial(rs.getInt("cartserial"));
			pu.setReceiver(rs.getString("receiver"));
			pu.setRphone(rs.getString("rphone"));
			pu.setAddress(rs.getString("address"));
			pu.setTime(rs.getDate("time"));		
			list.add(pu);
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
	return list;
	}
	
	
	
	/*查询  某个订单编号	的订单信息		*/
	public Ordergoods find_OrdergoodsInfo(String number){
		Connection con = DataMySQL.getConnection();
		String sql = "select DISTINCT ordernumber,receiver,rphone,address,time  from ordergoods where ordernumber = '"+number+"'  ";		
		PreparedStatement pst = null;
		ResultSet rs 	= null ;
		Ordergoods 	pu	=	new	Ordergoods();
		try {
		pst = con.prepareStatement(sql);
		rs = pst.executeQuery();
		if(rs.next()) {
			
			pu.setOrdernumber(rs.getString("ordernumber"));
			pu.setReceiver(rs.getString("receiver"));
			pu.setRphone(rs.getString("rphone"));
			pu.setAddress(rs.getString("address"));
			pu.setTime(rs.getDate("time"));		

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
