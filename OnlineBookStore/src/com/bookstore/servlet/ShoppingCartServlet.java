package com.bookstore.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bookstore.bean.Book;
import com.bookstore.bean.Cart;
import com.bookstore.dao.*;

/**
 * Servlet implementation class Shoppingcart
 */

public class ShoppingCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShoppingCartServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		/**
		 * 跳转到 购物车详情界面
		 */
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		
		//根据用户id		获取购物车中对应商品数据
		String id = (String) request.getSession().getAttribute("Id");
		ShoppingCart_Dao dao = new ShoppingCart_Dao();
		List <Cart>		Cart = dao.Cart_Find(id); 		

		FindBook_Dao	dao2	=	new	FindBook_Dao();
		List<Book> Rbook =  dao2.find_Recommendbook() ;		//查询今日推荐 书籍	

		request.setAttribute("Rbook", Rbook);			//导航栏 今日推荐书本数据
		request.setAttribute("Cart", Cart);				//购物车商品详情数据
		request.getRequestDispatcher("/shopping_cart.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
