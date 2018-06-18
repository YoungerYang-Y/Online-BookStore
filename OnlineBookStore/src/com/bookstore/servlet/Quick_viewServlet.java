package com.bookstore.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bookstore.bean.Book;
import com.bookstore.dao.FindBook_Dao;

/**
 * Servlet implementation class Quick_viewServlet
 */
@WebServlet("/Quick_viewServlet")
public class Quick_viewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Quick_viewServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String Name	=	request.getParameter("param1");
		FindBook_Dao	dao	=	new	FindBook_Dao();
		List<Book> Abook =  dao.find_Book(Name) ;		//查询指定书籍
		List<Book> Rbook =  dao.find_Recommendbook() ;		//查询今日推荐 书籍
		request.setAttribute("Abook", Abook);
		request.setAttribute("Rbook", Rbook);
		request.getRequestDispatcher("/quick_view.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
