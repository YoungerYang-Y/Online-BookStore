package com.bookstore.bean;


/**
 * �洢�鱾����
 * @author Administrator
 *
 */
public class Book implements java.io.Serializable {
	private	String number;		//
	private	String bookname;		//
	private	String author;		//
	private	float  price;			//
	private	String authorinfo;	//
	private	String contentinfo;	//
	private	String category;		//
	private	int    inventory;		//
	private	int    sales;			//
	private	String date;			//
	private	String keyword;		//
	private	String img1;			//
	private	String img2;			//
	private	String img3;			//
	private	int	   delsoft;		//
	public Book(){
		
	}
	public Book(String number,String bookname,String author,float  price,String authorinfo,String contentinfo,String category,
			int    inventory,int    sales,String date,String keyword,String img1,String img2,String img3,int	   delsoft)
	{
		super();
		this.number		=	number;			
		this.bookname	=	bookname;
		this.author		=	author;
		this.price		=	price;
		this.authorinfo	=	authorinfo;
		this.contentinfo	=	contentinfo;
		this.category	=	category;
		this.inventory	=	inventory;
		this.sales		=	sales;
		this.date		=	date;
		this.keyword	=	keyword;
		this.img1		=	img1;
		this.img2		=	img2;
		this.img3		=	img3;
		this.delsoft	=	delsoft;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getAuthorinfo() {
		return authorinfo;
	}
	public void setAuthorinfo(String authorinfo) {
		this.authorinfo = authorinfo;
	}
	public String getContentinfo() {
		return contentinfo;
	}
	public void setContentinfo(String contentinfo) {
		this.contentinfo = contentinfo;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getInventory() {
		return inventory;
	}
	public void setInventory(int inventory) {
		this.inventory = inventory;
	}
	public int getSales() {
		return sales;
	}
	public void setSales(int sales) {
		this.sales = sales;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public String getImg1() {
		return img1;
	}
	public void setImg1(String img1) {
		this.img1 = img1;
	}
	public String getImg2() {
		return img2;
	}
	public void setImg2(String img2) {
		this.img2 = img2;
	}
	public String getImg3() {
		return img3;
	}
	public void setImg3(String img3) {
		this.img3 = img3;
	}
	public int getDelsoft() {
		return delsoft;
	}
	public void setDelsoft(int delsoft) {
		this.delsoft = delsoft;
	}
	
}
