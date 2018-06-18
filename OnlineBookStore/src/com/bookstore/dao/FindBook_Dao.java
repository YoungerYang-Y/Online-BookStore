package com.bookstore.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.bookstore.bean.Book;
import com.bookstore.util.DataMySQL;

/**
 * 查找数据库书籍数据
 * @author Administrator
 *
 */
public class FindBook_Dao {
	/*	模糊查找某本书	*/
	public List<Book> find_Book(String Bookname){
		Connection con = DataMySQL.getConnection();
		String sql = "select * from book where bookname like '%"+Bookname+"%' ";
		PreparedStatement pst = null;
		ResultSet rs 	= null ;
		List<Book> list   = new ArrayList<Book>(); ;
		try {
		pst = con.prepareStatement(sql);
		rs = pst.executeQuery();
		while(rs.next()) {
			Book 	pu	=	new	Book();
			pu.setNumber(rs.getString("number"));
			pu.setBookname(rs.getString("bookname"));
			pu.setAuthor(rs.getString("author"));
			pu.setPrice(rs.getFloat("price"));
			pu.setAuthorinfo(rs.getString("authorinfo"));
			pu.setContentinfo(rs.getString("contentinfo"));
			pu.setCategory(rs.getString("category"));
			pu.setInventory(rs.getInt("inventory"));
			pu.setSales(rs.getInt("sales"));
			pu.setDate(rs.getString("date"));
			pu.setKeyword(rs.getString("keyword"));
			pu.setImg1(rs.getString("img1"));
			pu.setImg2(rs.getString("img2"));
			pu.setImg3(rs.getString("img3"));
			pu.setDelsoft(rs.getInt("delsoft"));
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
	
	/*	模糊查找某作者	*/
	public List<Book> find_Author(String Author){
		Connection con = DataMySQL.getConnection();
		String sql = "select * from book where author like '%"+Author+"%' ";
		PreparedStatement pst = null;
		ResultSet rs 	= null ;
		List<Book> list   = new ArrayList<Book>(); ;
		try {
		pst = con.prepareStatement(sql);
		rs = pst.executeQuery();
		while(rs.next()) {
			Book 	pu	=	new	Book();
			pu.setNumber(rs.getString("number"));
			pu.setBookname(rs.getString("bookname"));
			pu.setAuthor(rs.getString("author"));
			pu.setPrice(rs.getFloat("price"));
			pu.setAuthorinfo(rs.getString("authorinfo"));
			pu.setContentinfo(rs.getString("contentinfo"));
			pu.setCategory(rs.getString("category"));
			pu.setInventory(rs.getInt("inventory"));
			pu.setSales(rs.getInt("sales"));
			pu.setDate(rs.getString("date"));
			pu.setKeyword(rs.getString("keyword"));
			pu.setImg1(rs.getString("img1"));
			pu.setImg2(rs.getString("img2"));
			pu.setImg3(rs.getString("img3"));
			pu.setDelsoft(rs.getInt("delsoft"));
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
	
	/*	模糊查找某类别	*/
	public List<Book> find_Category(String Category){
		Connection con = DataMySQL.getConnection();
		String sql = "select * from book where category like '%"+Category+"%' ";
		PreparedStatement pst = null;
		ResultSet rs 	= null ;
		List<Book> list   = new ArrayList<Book>(); 
		try {
		pst = con.prepareStatement(sql);
		rs = pst.executeQuery();
		while(rs.next()) {
			Book 	pu	=	new	Book();
			pu.setNumber(rs.getString("number"));
			pu.setBookname(rs.getString("bookname"));
			pu.setAuthor(rs.getString("author"));
			pu.setPrice(rs.getFloat("price"));
			pu.setAuthorinfo(rs.getString("authorinfo"));
			pu.setContentinfo(rs.getString("contentinfo"));
			pu.setCategory(rs.getString("category"));
			pu.setInventory(rs.getInt("inventory"));
			pu.setSales(rs.getInt("sales"));
			pu.setDate(rs.getString("date"));
			pu.setKeyword(rs.getString("keyword"));
			pu.setImg1(rs.getString("img1"));
			pu.setImg2(rs.getString("img2"));
			pu.setImg3(rs.getString("img3"));
			pu.setDelsoft(rs.getInt("delsoft"));
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
	
	/*	根据书本序列号查找某本书	*/
	public Book find_SomeBook(String number){
		Connection con = DataMySQL.getConnection();
		String sql = "select * from book where number = '"+number+"' ";
		PreparedStatement pst = null;
		ResultSet rs 	= null ;
		Book 	pu	=	new	Book();
		try {
		pst = con.prepareStatement(sql);
		rs = pst.executeQuery();
		if(rs.next()) {
			pu.setNumber(rs.getString("number"));
			pu.setBookname(rs.getString("bookname"));
			pu.setAuthor(rs.getString("author"));
			pu.setPrice(rs.getFloat("price"));
			pu.setAuthorinfo(rs.getString("authorinfo"));
			pu.setContentinfo(rs.getString("contentinfo"));
			pu.setCategory(rs.getString("category"));
			pu.setInventory(rs.getInt("inventory"));
			pu.setSales(rs.getInt("sales"));
			pu.setDate(rs.getString("date"));
			pu.setKeyword(rs.getString("keyword"));
			pu.setImg1(rs.getString("img1"));
			pu.setImg2(rs.getString("img2"));
			pu.setImg3(rs.getString("img3"));
			pu.setDelsoft(rs.getInt("delsoft"));
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
	
	/*	根据书查找某本书	*/
	public Book find_inventory(String bookname){
		Connection con = DataMySQL.getConnection();
		String sql = "select * from book where bookname = '"+bookname+"' ";
		PreparedStatement pst = null;
		ResultSet rs 	= null ;
		Book 	pu	=	new	Book();
		try {
		pst = con.prepareStatement(sql);
		rs = pst.executeQuery();
		if(rs.next()) {
			pu.setInventory(rs.getInt("inventory"));
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
	
	/*	查询 销售排行榜 	*/
	public List<Book> find_Hotbook(){
		Connection con = DataMySQL.getConnection();
		String sql = "select * from book order by sales DESC";
		PreparedStatement pst = null;
		ResultSet rs 	= null ;
		List<Book> list   = new ArrayList<Book>(); ;
		try {
		pst = con.prepareStatement(sql);
		rs = pst.executeQuery();
		while(rs.next()) {
		Book 	pu	=	new	Book();
		pu.setNumber(rs.getString("number"));
		pu.setBookname(rs.getString("bookname"));
		pu.setAuthor(rs.getString("author"));
		pu.setPrice(rs.getFloat("price"));
		pu.setAuthorinfo(rs.getString("authorinfo"));
		pu.setContentinfo(rs.getString("contentinfo"));
		pu.setCategory(rs.getString("category"));
		pu.setInventory(rs.getInt("inventory"));
		pu.setSales(rs.getInt("sales"));
		pu.setDate(rs.getString("date"));
		pu.setKeyword(rs.getString("keyword"));
		pu.setImg1(rs.getString("img1"));
		pu.setImg2(rs.getString("img2"));
		pu.setImg3(rs.getString("img3"));
		pu.setDelsoft(rs.getInt("delsoft"));
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
		
	/*	查询 最新上架 	*/
	public List<Book> find_Newbook(){
		Connection con = DataMySQL.getConnection();
		String sql = "select * from book order by date DESC";
		PreparedStatement pst = null;
		ResultSet rs 	= null ;
		List<Book> list   = new ArrayList<Book>(); ;
		try {
		pst = con.prepareStatement(sql);
		rs = pst.executeQuery();
		while(rs.next()) {
		Book 	pu	=	new	Book();
		pu.setNumber(rs.getString("number"));
		pu.setBookname(rs.getString("bookname"));
		pu.setAuthor(rs.getString("author"));
		pu.setPrice(rs.getFloat("price"));
		pu.setAuthorinfo(rs.getString("authorinfo"));
		pu.setContentinfo(rs.getString("contentinfo"));
		pu.setCategory(rs.getString("category"));
		pu.setInventory(rs.getInt("inventory"));
		pu.setSales(rs.getInt("sales"));
		pu.setDate(rs.getString("date"));
		pu.setKeyword(rs.getString("keyword"));
		pu.setImg1(rs.getString("img1"));
		pu.setImg2(rs.getString("img2"));
		pu.setImg3(rs.getString("img3"));
		pu.setDelsoft(rs.getInt("delsoft"));
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
		
	/*	查询今日推荐书籍 	*/
	public List<Book> find_Recommendbook(){
		Connection con = DataMySQL.getConnection();
		String sql = "select * from book where keyword='今日推荐'";
		PreparedStatement pst = null;
		ResultSet rs 	= null ;
		List<Book> list   = new ArrayList<Book>(); ;
		try {
		pst = con.prepareStatement(sql);
		rs = pst.executeQuery();
		while(rs.next()) {
		Book 	pu	=	new	Book();
		pu.setNumber(rs.getString("number"));
		pu.setBookname(rs.getString("bookname"));
		pu.setAuthor(rs.getString("author"));
		pu.setPrice(rs.getFloat("price"));
		pu.setAuthorinfo(rs.getString("authorinfo"));
		pu.setContentinfo(rs.getString("contentinfo"));
		pu.setCategory(rs.getString("category"));
		pu.setInventory(rs.getInt("inventory"));
		pu.setSales(rs.getInt("sales"));
		pu.setDate(rs.getString("date"));
		pu.setKeyword(rs.getString("keyword"));
		pu.setImg1(rs.getString("img1"));
		pu.setImg2(rs.getString("img2"));
		pu.setImg3(rs.getString("img3"));
		pu.setDelsoft(rs.getInt("delsoft"));
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
	
	/* 查询特色书籍*/
	public List<Book> find_Characteristicbook(){
		Connection con = DataMySQL.getConnection();
		String sql = "select * from book where keyword='特色书籍'";
		PreparedStatement pst = null;
		ResultSet rs 	= null ;
		List<Book> list   = new ArrayList<Book>(); ;
		try {
		pst = con.prepareStatement(sql);
		rs = pst.executeQuery();
		while(rs.next()) {
		Book 	pu	=	new	Book();
		pu.setNumber(rs.getString("number"));
		pu.setBookname(rs.getString("bookname"));
		pu.setAuthor(rs.getString("author"));
		pu.setPrice(rs.getFloat("price"));
		pu.setAuthorinfo(rs.getString("authorinfo"));
		pu.setContentinfo(rs.getString("contentinfo"));
		pu.setCategory(rs.getString("category"));
		pu.setInventory(rs.getInt("inventory"));
		pu.setSales(rs.getInt("sales"));
		pu.setDate(rs.getString("date"));
		pu.setKeyword(rs.getString("keyword"));
		pu.setImg1(rs.getString("img1"));
		pu.setImg2(rs.getString("img2"));
		pu.setImg3(rs.getString("img3"));
		pu.setDelsoft(rs.getInt("delsoft"));
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
	
	/* 查询畅销书籍*/
	public List<Book> find_Sellingbook(){
		Connection con = DataMySQL.getConnection();
		String sql = "select * from book where keyword='畅销书籍'";
		PreparedStatement pst = null;
		ResultSet rs 	= null ;
		List<Book> list   = new ArrayList<Book>(); ;
		try {
		pst = con.prepareStatement(sql);
		rs = pst.executeQuery();
		while(rs.next()) {
		Book 	pu	=	new	Book();
		pu.setNumber(rs.getString("number"));
		pu.setBookname(rs.getString("bookname"));
		pu.setAuthor(rs.getString("author"));
		pu.setPrice(rs.getFloat("price"));
		pu.setAuthorinfo(rs.getString("authorinfo"));
		pu.setContentinfo(rs.getString("contentinfo"));
		pu.setCategory(rs.getString("category"));
		pu.setInventory(rs.getInt("inventory"));
		pu.setSales(rs.getInt("sales"));
		pu.setDate(rs.getString("date"));
		pu.setKeyword(rs.getString("keyword"));
		pu.setImg1(rs.getString("img1"));
		pu.setImg2(rs.getString("img2"));
		pu.setImg3(rs.getString("img3"));
		pu.setDelsoft(rs.getInt("delsoft"));
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
	
	/* 查询今日热销*/
	public List<Book> find_Mostbook(){
		Connection con = DataMySQL.getConnection();
		String sql = "select * from book where keyword='今日热销'";
		PreparedStatement pst = null;
		ResultSet rs 	= null ;
		List<Book> list   = new ArrayList<Book>(); ;
		try {
		pst = con.prepareStatement(sql);
		rs = pst.executeQuery();
		while(rs.next()) {
		Book 	pu	=	new	Book();
		pu.setNumber(rs.getString("number"));
		pu.setBookname(rs.getString("bookname"));
		pu.setAuthor(rs.getString("author"));
		pu.setPrice(rs.getFloat("price"));
		pu.setAuthorinfo(rs.getString("authorinfo"));
		pu.setContentinfo(rs.getString("contentinfo"));
		pu.setCategory(rs.getString("category"));
		pu.setInventory(rs.getInt("inventory"));
		pu.setSales(rs.getInt("sales"));
		pu.setDate(rs.getString("date"));
		pu.setKeyword(rs.getString("keyword"));
		pu.setImg1(rs.getString("img1"));
		pu.setImg2(rs.getString("img2"));
		pu.setImg3(rs.getString("img3"));
		pu.setDelsoft(rs.getInt("delsoft"));
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
	
	/* 查询 最受好评*/
	public List<Book> find_Praisedbook(){
		Connection con = DataMySQL.getConnection();
		String sql = "select * from book where keyword='最受好评'";
		PreparedStatement pst = null;
		ResultSet rs 	= null ;
		List<Book> list   = new ArrayList<Book>(); ;
		try {
		pst = con.prepareStatement(sql);
		rs = pst.executeQuery();
		while(rs.next()) {
		Book 	pu	=	new	Book();
		pu.setNumber(rs.getString("number"));
		pu.setBookname(rs.getString("bookname"));
		pu.setAuthor(rs.getString("author"));
		pu.setPrice(rs.getFloat("price"));
		pu.setAuthorinfo(rs.getString("authorinfo"));
		pu.setContentinfo(rs.getString("contentinfo"));
		pu.setCategory(rs.getString("category"));
		pu.setInventory(rs.getInt("inventory"));
		pu.setSales(rs.getInt("sales"));
		pu.setDate(rs.getString("date"));
		pu.setKeyword(rs.getString("keyword"));
		pu.setImg1(rs.getString("img1"));
		pu.setImg2(rs.getString("img2"));
		pu.setImg3(rs.getString("img3"));
		pu.setDelsoft(rs.getInt("delsoft"));
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
	
	/* 查询  即将售罄*/
	public List<Book> find_Outsellbook(){
		Connection con = DataMySQL.getConnection();
		String sql = "select * from book where keyword='即将售罄'";
		PreparedStatement pst = null;
		ResultSet rs 	= null ;
		List<Book> list   = new ArrayList<Book>(); ;
		try {
		pst = con.prepareStatement(sql);
		rs = pst.executeQuery();
		while(rs.next()) {
		Book 	pu	=	new	Book();
		pu.setNumber(rs.getString("number"));
		pu.setBookname(rs.getString("bookname"));
		pu.setAuthor(rs.getString("author"));
		pu.setPrice(rs.getFloat("price"));
		pu.setAuthorinfo(rs.getString("authorinfo"));
		pu.setContentinfo(rs.getString("contentinfo"));
		pu.setCategory(rs.getString("category"));
		pu.setInventory(rs.getInt("inventory"));
		pu.setSales(rs.getInt("sales"));
		pu.setDate(rs.getString("date"));
		pu.setKeyword(rs.getString("keyword"));
		pu.setImg1(rs.getString("img1"));
		pu.setImg2(rs.getString("img2"));
		pu.setImg3(rs.getString("img3"));
		pu.setDelsoft(rs.getInt("delsoft"));
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

	/*更新 书本数据	库存-count 销量+count*/
	public void	Updata_Book(String bookname,int count) {
		Connection con = DataMySQL.getConnection();

		String sql = "update book set inventory=(inventory-'"+count+"') , sales=(sales+'"+count+"') where bookname='"+bookname+"'";		//根据 cartserial   软删除这条数据
		try {
			 Statement stmt=con.createStatement();//创建Statement对象
			stmt.executeUpdate(sql);//执行sql语句
			stmt = con.prepareStatement(sql);
			stmt.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
	}
}

