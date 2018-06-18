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
 * Servlet implementation class SearchBooKServlet
 */
@WebServlet("/SearchBooKServlet")
public class SearchBooKServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchBooKServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		response.setContentType("text/html;charset=utf-8");
		response.setCharacterEncoding("utf-8");
		String Id	=	(String) request.getSession().getAttribute("Id");
		String massage = request.getParameter("massage");		//类别
		String search = request.getParameter("search");			//搜索内容
		FindBook_Dao dao = new FindBook_Dao();
		//购物车商品详情数据
		List<Cart>	Cart = new ArrayList<Cart>(); 
		ShoppingCart_Dao dao3 = new ShoppingCart_Dao();
		Cart 	= 	dao3.Cart_Find(Id);
		request.setAttribute("Cart", Cart);	
		
		List<Book> book = new ArrayList<Book> ();
		List<Book> Rbook =  dao.find_Recommendbook() ;		//查询今日推荐 书籍
		if(massage.equals("按书名")) {
			
			book =  dao.find_Book(search) ;		//搜索成功
			request.setAttribute("Rbook", Rbook);
			request.setAttribute("Abook", book);
			request.getRequestDispatcher("/shop_grid_full_width.jsp").forward(request, response);
			
		}
		else if(massage.equals("按作者")) {
			
			book =  dao.find_Author(search) ;		//搜索成功
			request.setAttribute("Rbook", Rbook);
			request.setAttribute("Abook", book);
			request.getRequestDispatcher("/shop_grid_full_width.jsp").forward(request, response);
		}
		else if(massage.equals("按类别")) {
			
			book =  dao.find_Category(search) ;		//搜索成功
			request.setAttribute("Rbook", Rbook);
			request.setAttribute("Abook", book);
			request.getRequestDispatcher("/shop_grid_full_width.jsp").forward(request, response);
		}
		else if(massage.equals("销量排行榜")){
			//按销量排序
			book =  dao.find_Hotbook() ;		
			request.setAttribute("Rbook", Rbook);
			request.setAttribute("Abook", book);
			request.getRequestDispatcher("/shop_grid_full_width.jsp").forward(request, response);
		}
		else if(massage.equals("最新上架")){
			//按上架时间
			book =  dao.find_Newbook() ;		
			request.setAttribute("Rbook", Rbook);
			request.setAttribute("Abook", book);
			request.getRequestDispatcher("/shop_grid_full_width.jsp").forward(request, response);
		}
		else {
			// 404
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
