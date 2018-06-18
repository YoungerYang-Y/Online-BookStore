package com.bookstore.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bookstore.bean.User;
import com.bookstore.dao.RegisterDao;



/**
 * Servlet implementation class RegisterServlet
 */
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		String username = request.getParameter("username");
		String PIN 		= request.getParameter("PIN");
		String id 		= request.getParameter("id");
		String sex 		= request.getParameter("sex");
		String idcard 	= request.getParameter("idcard");
		User pu = new User();
		pu.setId(id);
		pu.setUsername(username);
		pu.setPIN(PIN);
		pu.setIdcard(idcard);
		pu.setSex(sex);
		RegisterDao dao = new RegisterDao();

		if(dao.judge(id)){
			if(dao.insert(pu)){
				//注册成功
				request.getRequestDispatcher("account_page.jsp").forward(request, response);
				}
			else
			{
				request.getRequestDispatcher("fail.jsp").forward(request, response);
			}
		}else{
			request.getRequestDispatcher("resist.jsp").forward(request, response);
			
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
