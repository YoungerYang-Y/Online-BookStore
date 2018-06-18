package com.bookstore.bean;

import java.util.Date;

public class Ordergoods {
	private int serial;				//编号
	private String id;				//用户id
	private String ordernumber;		//订单编号
	private int cartserial;			//购物车序号
	private String  receiver;		//收件人	
	private String 	rphone;			//电话
	private String 	address;		//地址
	private Date	time;			//创建时间
	public Ordergoods(int serial,String id, String ordernumber, int cartserial, String receiver, String rphone, String address,Date time) {
		super();
		this.serial = serial;
		this.id		=	id;
		this.ordernumber = ordernumber;
		this.cartserial = cartserial;
		this.receiver = receiver;
		this.rphone = rphone;
		this.address = address;
		this.time = time;
	}
	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}	
	public String getOrdernumber() {
		return ordernumber;
	}

	public void setOrdernumber(String ordernumber) {
		this.ordernumber = ordernumber;
	}

	public int getCartserial() {
		return cartserial;
	}

	public void setCartserial(int cartserial) {
		this.cartserial = cartserial;
	}

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public String getRphone() {
		return rphone;
	}

	public void setRphone(String rphone) {
		this.rphone = rphone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}
	
	public Ordergoods(){
	}


}
