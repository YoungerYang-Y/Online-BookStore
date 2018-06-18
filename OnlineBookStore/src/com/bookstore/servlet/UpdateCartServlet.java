package com.bookstore.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bookstore.bean.Book;
import com.bookstore.dao.FindBook_Dao;
import com.bookstore.dao.ShoppingCart_Dao;

/**
 * Servlet implementation class UpdateCartServlet
 */
@WebServlet("/UpdateCartServlet")
public class UpdateCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateCartServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		String id = (String) request.getSession().getAttribute("Id");
		String bookname = request.getParameter("param1");
		int count = Integer.parseInt(request.getParameter("param2"));
		System.out.println(id);
		System.out.println(bookname);
		System.out.println(count);
		ShoppingCart_Dao	dao	=	new	ShoppingCart_Dao();
		
		FindBook_Dao d = new FindBook_Dao();
		Book book = d.find_inventory(bookname);
		if(count < book.getInventory()) {
		dao.cart_Update(bookname, id, count);
		request.getRequestDispatcher("/ShoppingCartServlet").forward(request, response);
		}else {
			request.getRequestDispatcher("/inverntory.jsp").forward(request, response);
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
