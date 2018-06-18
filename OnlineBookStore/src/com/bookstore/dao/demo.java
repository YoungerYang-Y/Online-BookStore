package com.bookstore.dao;

import java.util.List;

import com.bookstore.bean.Book;
import com.bookstore.bean.Cart;
import com.bookstore.bean.Ordergoods;

public class demo {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
		String id	=	"15574378467";
//		
//		ShoppingCart_Dao	dao	=	new	ShoppingCart_Dao();
//		Cart cart	= dao.Cart_Find2(cartserial);
//		System.out.println(cart.getBookname());
		
		Ordergoods_Dao	dao	= new	Ordergoods_Dao();
		List <Ordergoods>		Ordergoods	=		dao.find_Ordergoods(id);
		for(Ordergoods ordergoods : Ordergoods) {
			System.out.println(ordergoods.getSerial());
			System.out.println(ordergoods.getId());			
			System.out.println(ordergoods.getOrdernumber());
			System.out.println(ordergoods.getCartserial());
			System.out.println(ordergoods.getReceiver());
			System.out.println(ordergoods.getRphone());
			System.out.println("*******");
		}
	}

}
