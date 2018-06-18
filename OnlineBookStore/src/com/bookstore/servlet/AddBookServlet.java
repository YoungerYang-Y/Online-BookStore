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
 * Servlet implementation class AddBookServlet
 */
@WebServlet("/AddBookServlet")
public class AddBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddBookServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());		
		/**
		 * 添加购物车
		 */
		request.setCharacterEncoding("UTF-8");
		String number=request.getParameter("param1");	//书本编号
		String Id	=	(String) request.getSession().getAttribute("Id");
		if(Id!=null) {
			int count  = 	1;//商品数量
			String qty = 	request.getParameter("qty");	
			if(	qty!=null) {
				count	=	Integer.parseInt(qty);
				
			}
			
				//用户id
			ShoppingCart_Dao	dao	=	new	ShoppingCart_Dao();
			System.out.println(number);
			System.out.println(count);
			//System.out.println(book.getBookname());
			if(dao.Cart_Find1(Id, number)) {
				//Book book = dao.Cart_Find3(number);
				dao.cart_Update1(number, count);
			}else {
				dao.Cart_Insert(Id, number, count);
			}  
							//将商品数据插入购物车数据库
			request.getRequestDispatcher("/ShoppingCartServlet").forward(request, response);
		}else {
			request.getRequestDispatcher("/remainlogin.jsp").forward(request, response);
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
