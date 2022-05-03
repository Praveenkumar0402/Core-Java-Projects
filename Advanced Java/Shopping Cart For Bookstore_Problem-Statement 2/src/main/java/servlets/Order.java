package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Book;
import com.BookOrder;
import service.UserException;
import service.UserService;

public class Order extends HttpServlet {
	public Order() {
		super();
	}

	public void destroy() {
		super.destroy();
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html);charset=utf-8");
		HttpSession session=request.getSession();
		String userId=(String) session.getAttribute("userid");
		UserService s=new UserService();
		if(userId==null){
			request.setAttribute("msg", "登录时间超时，请重新登录");
			request.getRequestDispatcher("/login.jsp").forward(request, response);
		}
		else{	
			try {
				List<BookOrder> bookorder=(List<BookOrder>) s.SearchAllOrder(userId);
				request.setAttribute("bookorder", bookorder);
				List<Book> books=(List<Book>) s.SearchAllBookByOrder(bookorder);
				
				request.setAttribute("orderbooks", books);
				
				request.getRequestDispatcher("/cashier.jsp").forward(request, response);
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (UserException e) {
				// TODO Auto-generated catch block
				request.setAttribute("msg", e.getMessage());
				request.getRequestDispatcher("/cashier.jsp").forward(request, response);;
			}
			
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY>");
		out.print("    This is ");
		out.print(this.getClass());
		out.println(", using the POST method");
		out.println("  </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
	}
	public void init() throws ServletException {

	}

}
