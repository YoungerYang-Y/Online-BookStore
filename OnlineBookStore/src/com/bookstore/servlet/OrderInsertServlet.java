package com.bookstore.servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
 * Servlet implementation class OrderInsertServlet
 */
@WebServlet("/OrderInsertServlet")
public class OrderInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OrderInsertServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		request.setCharacterEncoding("UTF-8");
		SimpleDateFormat time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		String date	=	time.format(new Date());											// new Date()为获取当前系统时间
		String id = (String) request.getSession().getAttribute("Id");
		String	ordernumber	=	id+date;						//订单号由  id+date拼接而成
		String	qty	=	request.getParameter("qty");
		int count	=	Integer.parseInt(qty);
		
		Ordergoods_Dao		dao		=	new	Ordergoods_Dao();
		ShoppingCart_Dao	dao2	=	new	ShoppingCart_Dao();
		FindBook_Dao		dao3	=	new FindBook_Dao();
		List <Cart>		Cart = dao2.Cart_Find(id);
		
		
		
		String	receiver	=	request.getParameter("receiver");
		String	rphone	=	request.getParameter("rphone");
		String	address	=	request.getParameter("address");
		for(Cart cart : Cart) {
						
			Book book	=	dao3.find_inventory(cart.getBookname());
			System.out.println("1234");
			System.out.println(count);
			System.out.println(book.getInventory());
			
			if(count>book.getInventory()||book.getInventory()<0) {
				request.getRequestDispatcher("/inverntory.jsp").forward(request, response);	
			}
			else {
				dao.insert_ordergoods( id, ordernumber, cart.getCartserial(), receiver, rphone, address);		//写入订单表
				dao2.Cart_Delete(cart.getCartserial());															//软删除购物车	
				dao3.Updata_Book(cart.getBookname(),cart.getCount()); 											//更新库存
				request.getRequestDispatcher("/MyAccountServlet").forward(request, response);
			}
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
