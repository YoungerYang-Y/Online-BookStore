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
import com.bookstore.bean.User;
import com.bookstore.dao.FindBook_Dao;
import com.bookstore.dao.LoginDao;
import com.bookstore.dao.ShoppingCart_Dao;

/**
 * Servlet implementation class FindBookServlet
 */
@WebServlet("/FindBookServlet")
public class FindBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FindBookServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		User		user = new User();
		List<Cart>	Cart = new ArrayList<Cart>(); 
		LoginDao usr	=	new	LoginDao();
		FindBook_Dao	dao	=	new	FindBook_Dao();
		ShoppingCart_Dao dao2 = new ShoppingCart_Dao();
		String Id	=	(String) request.getSession().getAttribute("Id");
		//通过用户id查询 购物车信息	
		user	=	usr.login1(Id);	
		Cart 	= 	dao2.Cart_Find(Id);
		List<Book> Rbook =  dao.find_Recommendbook() ;		//查询今日推荐 书籍
		List<Book> Cbook =  dao.find_Characteristicbook() ;	//查询特色书籍 书籍
		List<Book> Sbook =  dao.find_Sellingbook() ;		//查询畅销书籍 书籍
		List<Book> Mbook =  dao.find_Mostbook() ;			//查询今日热销 书籍
		List<Book> Pbook =  dao.find_Praisedbook() ;		//查询最受好评 书籍
		List<Book> Obook =  dao.find_Outsellbook() ;		//查询即将售罄 书籍
		
		request.setAttribute("User", user);
		request.setAttribute("Cart", Cart);					//购物车商品详情数据
		request.setAttribute("Rbook", Rbook);
		request.setAttribute("Cbook", Cbook);
		request.setAttribute("Sbook", Sbook);
		request.setAttribute("Mbook", Mbook);
		request.setAttribute("Pbook", Pbook);
		request.setAttribute("Obook", Obook);
		request.getRequestDispatcher("/index.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
