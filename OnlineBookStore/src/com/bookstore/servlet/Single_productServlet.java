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
import com.bookstore.bean.Review;
import com.bookstore.dao.FindBook_Dao;
import com.bookstore.dao.Review_Dao;
import com.bookstore.dao.ShoppingCart_Dao;

/**
 * Servlet implementation class Single_productServlet
 */
@WebServlet("/Single_productServlet")
public class Single_productServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Single_productServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String Id	=	(String) request.getSession().getAttribute("Id");
		String Name	=	request.getParameter("param1");
		
		FindBook_Dao	dao	=	new	FindBook_Dao();
		List<Book> Abook =  dao.find_Book(Name) ;			//查询指定书籍
		List<Book> Rbook =  dao.find_Recommendbook() ;		//查询今日推荐 书籍
		
		Review_Dao 		dao2 = 	new Review_Dao();
		List<Review> Review	=	dao2.select(Name);
		
		//购物车商品详情数据
		List<Cart>	Cart = new ArrayList<Cart>(); 
		ShoppingCart_Dao dao3 = new ShoppingCart_Dao();
		Cart 	= 	dao3.Cart_Find(Id);
		
		request.setAttribute("Cart", Cart);				
		request.setAttribute("Review", Review);
		request.setAttribute("Abook", Abook);
		request.setAttribute("Rbook", Rbook);
		request.getRequestDispatcher("/single_product.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
