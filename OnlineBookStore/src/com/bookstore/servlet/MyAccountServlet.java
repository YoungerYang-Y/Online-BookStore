package com.bookstore.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bookstore.bean.Book;
import com.bookstore.bean.Cart;
import com.bookstore.bean.Ordergoods;
import com.bookstore.dao.FindBook_Dao;
import com.bookstore.dao.Ordergoods_Dao;
import com.bookstore.dao.ShoppingCart_Dao;

/**
 * Servlet implementation class MyAccountServlet
 */
@WebServlet("/MyAccountServlet")
public class MyAccountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyAccountServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String id = (String) request.getSession().getAttribute("Id");//找到用户id
		if(id==null) {
			request.getRequestDispatcher("/remainlogin.jsp").forward(request, response);
		}
		Ordergoods_Dao		dao		=	new	Ordergoods_Dao();
		ShoppingCart_Dao	dao2	=	new	ShoppingCart_Dao();
		List<Cart> list   = new ArrayList<Cart>();							//Cart 型的list 存储查找到的所有 购物车数据
		List<Ordergoods>		Ordergoods	=	dao.find_Ordergoods(id);	//对应全部订单数据
		List<String>	keyword	=	new	ArrayList<String>();
		for(Ordergoods ordergoods : Ordergoods) {		
			Cart pu = dao2.Cart_Find2(ordergoods.getCartserial());
			pu.setKeyword(ordergoods.getOrdernumber());    					//将订单号作为关键词 放入Cart表中
			keyword.add(ordergoods.getOrdernumber());		 
			list.add(pu);
		}
		
		//提取出订单表中的订单号 去重
		List<String> newList = new  ArrayList<String>();	
        for (String Keyword:keyword) {
           if(!newList.contains(Keyword)){
               newList.add(Keyword);       
           }
        }
        List<Ordergoods>	Ordergoodsinfo	=	new	ArrayList<Ordergoods>();
        for(String Keyword:newList) {
        		Ordergoods	order	=	new	Ordergoods();
        		order	=	dao.find_OrdergoodsInfo(Keyword);
        		Ordergoodsinfo.add(order);
        }
      
      //购物车商品详情数据
        List<Cart>	Cart = new ArrayList<Cart>(); 
      	ShoppingCart_Dao dao3 = new ShoppingCart_Dao();
      	Cart 	= 	dao3.Cart_Find(id);
      	FindBook_Dao	dao4	=	new	FindBook_Dao();
    	List<Book> Rbook =  dao4.find_Recommendbook() ;		//查询今日推荐 书籍	
    		
    		
    		
    	request.setAttribute("Rbook", Rbook);			//导航栏 今日推荐书本数据	
      	request.setAttribute("Cart", Cart);	
		request.setAttribute("ListCart", list);
		request.setAttribute("Ordergoodsinfo", Ordergoodsinfo);
		request.getRequestDispatcher("/myaccount.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
