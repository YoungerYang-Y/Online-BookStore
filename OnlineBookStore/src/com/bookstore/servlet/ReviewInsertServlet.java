package com.bookstore.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bookstore.bean.Book;
import com.bookstore.bean.Review;
import com.bookstore.dao.FindBook_Dao;
import com.bookstore.dao.Review_Dao;

/**
 * Servlet implementation class ReviewInsertServlet
 */
@WebServlet("/ReviewInsertServlet")
public class ReviewInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReviewInsertServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		String bookname = request.getParameter("param1");
		String username = request.getParameter("username");
		String review = request.getParameter("review");
		int rstore = Integer.parseInt(request.getParameter("rstore"));
		int rquality = Integer.parseInt(request.getParameter("rquality"));
		int logistics = Integer.parseInt(request.getParameter("logistics"));
		Review pu = new Review();
		pu.setUsername(username);
		pu.setBookname(bookname);
		pu.setReview(review);
		pu.setLogistics(logistics);
		pu.setRquality(rquality);
		pu.setRstore(rstore);
		Review_Dao dao = new Review_Dao();
		FindBook_Dao	dao2	=	new	FindBook_Dao();
		
		dao.insert(pu);
		
		request.getRequestDispatcher("/Single_productServlet").forward(request, response);		//评论成功跳回详情界面
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
