package com.bookstore.bean;

public class Cart {
	private int cartserial;
	private String  id;			
	private String 	number;	
	private String  bookname;
	private float	price;
	private String  img1;
	private int 	count;			
	private float 	totalprice;
	private	String	keyword;
	public Cart(){
		
	}
	public Cart(int cartserial, String id, String number, String  bookname,float price,String img1,int count, float totalprice,String	keyword) {
		super();
		this.cartserial = cartserial;
		this.id = id;
		this.number = number;
		this.bookname = bookname;
		this.price = price;
		this.img1  = img1;
		this.count = count;
		this.totalprice = totalprice;
		this.keyword	=	keyword;
	}
	public int getCartserial() {
		return cartserial;
	}
	public void setCartserial(int cartserial) {
		this.cartserial = cartserial;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public void setBookname(String Bookname) {
		this.bookname = Bookname;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getImg1() {
		return img1;
	}
	public void setImg1(String img1) {
		this.img1	=	img1;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public float getTotalprice() {
		return totalprice;
	}
	public void setTotalprice(float f) {
		this.totalprice = f;
	}
	public String getKeyword() {
		return keyword;
	}
	public void	setKeyword(String keyword) {
		this.keyword	=	keyword;
	}
}
