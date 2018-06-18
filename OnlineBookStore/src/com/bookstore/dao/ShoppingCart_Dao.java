package com.bookstore.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.bookstore.bean.*;
import com.bookstore.util.DataMySQL;

public class ShoppingCart_Dao {
	
	/*	从购物车表中查找数据*/
	public List<Cart> Cart_Find(String id) {
		Connection con = DataMySQL.getConnection();
		String sql = "select * from Shoppingcart where id=? and delsoft=1";		//根据 用户id查找购物车表
		PreparedStatement pst = null;
		ResultSet rs = null ;	
		List<Cart> list   = new ArrayList<Cart>();						//Cart 型的list 存储查找到的所有 购物车数据
		//float total = 0;
		try {
		pst = con.prepareStatement(sql);
		pst.setString(1, id);
		rs = pst.executeQuery();
		while(rs.next()) {
			Cart pu = null ;
			pu = new Cart();
			pu.setCartserial(rs.getInt("cartserial"));		//序号
			pu.setId(rs.getString("id"));					//用户id
			pu.setNumber(rs.getString("number"));			//商品编号
			pu.setBookname(rs.getString("bookname")); 		//商品名字
			pu.setPrice(rs.getFloat("price")); 				//商品价格
			pu.setImg1(rs.getString("img1"));
			pu.setCount(rs.getInt("count"));				//商品数量	
			pu.setTotalprice(rs.getFloat("totalprice"));	//商品总价
			list.add(pu);
		}
			pst.close();
			con.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		return list;
	}
	
	public boolean Cart_Find1(String id, String number) {
		Connection con = DataMySQL.getConnection();
		boolean result = false;
		//Book book = new Book();
		String sql = "select * from Shoppingcart where id='"+id+"' and number='"+number+"' and delsoft=1" ;		//根据 用户id查找购物车表
		PreparedStatement pst = null;
		ResultSet rs = null ;	
		try {
		pst = con.prepareStatement(sql);
		rs = pst.executeQuery();
		Cart c = new 	Cart();
		
		/*book.setBookname(rs.getString("bookname"));
		System.out.println(book.getBookname());*/
		if(rs.next())
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
	
	/*	从购物车表中查找数据*/
	public Cart Cart_Find2(int cartserial) {
		Connection con = DataMySQL.getConnection();
		String sql = "select * from Shoppingcart where cartserial='"+cartserial+"'";		//根据 用户id查找购物车表
		PreparedStatement pst = null;
		ResultSet rs = null ;	
		Cart pu   = new Cart();					
		try {
		pst = con.prepareStatement(sql);
		rs = pst.executeQuery();
		if(rs.next()) {
			pu.setCartserial(rs.getInt("cartserial"));		//序号
			pu.setId(rs.getString("id"));					//用户id
			pu.setNumber(rs.getString("number"));			//商品编号
			pu.setBookname(rs.getString("bookname")); 		//商品名字
			pu.setPrice(rs.getFloat("price")); 				//商品价格
			pu.setImg1(rs.getString("img1"));
			pu.setCount(rs.getInt("count"));				//商品数量	
			pu.setTotalprice(rs.getFloat("totalprice"));	//商品总价
		}
			pst.close();
			con.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		return pu;
	}
	/*
	public Book Cart_Find3(String number) {
		Connection con = DataMySQL.getConnection();
		//boolean result = false;
		Book book = new Book();
		String sql = "select * from Shoppingcart where number='"+number+"'";		//根据 用户id查找购物车表
		PreparedStatement pst = null;
		ResultSet rs = null ;	
		try {
		pst = con.prepareStatement(sql);
		rs = pst.executeQuery();
		book.setBookname(rs.getString("bookname"));
		System.out.println(book.getBookname());
		if(rs.next())
			result = true;
		else
			result = false;
		pst.close();
		con.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return book;
	}
	*/
	
	/*	插入购物车数据	*/
	public void Cart_Insert(String id, String number, int count) {
		Connection con = DataMySQL.getConnection();
		String sql = "select * from book where number=?";		//从book表中查找书本数据
		PreparedStatement pst = null;
		PreparedStatement pstt = null;
		ResultSet rs = null ;
		Book pu = null ;
		float total = 0;
		try {
		pst = con.prepareStatement(sql);
		pst.setString(1, number);
		rs = pst.executeQuery();
		if (rs.next()) {
			pu = new Book();
			pu.setBookname(rs.getString("bookname"));		//书名
			pu.setPrice(rs.getFloat("price"));				//价格
			pu.setImg1(rs.getString("img1"));				//图片
			float price = pu.getPrice();
			total = price*count;							//总价
		}		
		String sqll = "insert into shoppingcart(id,number,bookname,price,img1,count,totalprice) values(?,?,?,?,?,?,?)";
		pstt = con.prepareStatement(sqll);
		pstt.setString(1,id);
		pstt.setString(2,number);
		pstt.setString(3,pu.getBookname());
		pstt.setFloat(4,pu.getPrice());
		pstt.setString(5,pu.getImg1());
		pstt.setInt(6,count);
		pstt.setFloat(7,total);
		pstt.executeUpdate();
			pst.close();
			pstt.close();
			con.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
	}
	
	/*	从购物车表中删除数据*/
	public void Cart_Delete(int cartserial) {
		Connection con = DataMySQL.getConnection();
		String sql = "update shoppingcart set delsoft=0 where cartserial='"+cartserial+"'";		//根据 cartserial   软删除这条数据
		try {
			 Statement stmt=con.createStatement();//创建Statement对象
			stmt.executeUpdate(sql);//执行sql语句
			stmt = con.prepareStatement(sql);
			stmt.close();
			con.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
	}
	
	public void cart_Update(String bookname,String id, int count) {
		Connection con = DataMySQL.getConnection();
		String sql = "select * from book where bookname='"+bookname+"'";		//从book表中查找书本数据
		PreparedStatement pst = null;
		PreparedStatement pstt = null;
		ResultSet rs = null ;
		Book pu = null ;
		float total = 0;
		try {
		pst = con.prepareStatement(sql);
		//pst.setString(1, number);
		rs = pst.executeQuery();
		if (rs.next()) {
			pu = new Book();
			pu.setBookname(rs.getString("bookname"));		//书名
			pu.setPrice(rs.getFloat("price"));				//价格
			pu.setImg1(rs.getString("img1"));//图片
			pu.setNumber(rs.getString("number"));
			float price = pu.getPrice();
			String number = pu.getNumber();
			total = price*count;	//总价
		}
		String sqll = "update shoppingcart set count=?,totalprice=? where bookname='"+bookname+"' and id='"+id+"'";		//根据 cartserial   软删除这条数据
		PreparedStatement psttt = null; 
		psttt = con.prepareStatement(sqll);
		psttt.setInt(1, count);
		psttt.setFloat(2, total);
		psttt.executeUpdate();
		//Statement stmt=con.createStatement();//创建Statement对象
			//stmt.executeUpdate(sqll);//执行sql语句
			//stmt = con.prepareStatement(sql);
			con.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
	}
	
	public void cart_Update1(String number, int count) {
		Connection con = DataMySQL.getConnection();
		String sql = "select * from shoppingcart where number='"+number+"' and delsoft=1";		//从book表中查找书本数据
		PreparedStatement pst = null;
		PreparedStatement pstt = null;
		ResultSet rs = null ;
		Cart pu = null ;
		float total = 0;
		int countt=0;
		try {
		pst = con.prepareStatement(sql);
		//pst.setString(1, number);
		rs = pst.executeQuery();
		if (rs.next()) {
			pu = new Cart();
			pu.setCount(rs.getInt("count"));
			pu.setPrice(rs.getFloat("price"));
			float price = pu.getPrice();
			int co = pu.getCount();
			countt = co +count; 
			total = price*countt;	//总价
		}
		String sqll = "update shoppingcart set count=?,totalprice=? where number='"+number+"' and delsoft=1";		//根据 cartserial   软删除这条数据
		PreparedStatement psttt = null; 
		psttt = con.prepareStatement(sqll);
		
		psttt.setInt(1, countt);
		psttt.setFloat(2, total);
		psttt.executeUpdate();
		//Statement stmt=con.createStatement();//创建Statement对象
			//stmt.executeUpdate(sqll);//执行sql语句
			//stmt = con.prepareStatement(sql);
			con.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
	}
}

