package packages;

import java.io.IOException;
import java.io.PrintWriter;
import com.mysql.jdbc.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.PreparedStatement;

public class LoginServlet extends HttpServlet {

	public LoginServlet() {
		super();
	}

	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY>");
		out.print("    This is ");
		out.print(this.getClass());
		out.println(", using the GET method");
		out.println("  </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
           String email=request.getParameter("email");
           String password=request.getParameter("password");
           Connection con;
		try {
			System.out.println("i am here");
			con = (Connection) JdbcUtils.getConnection();
			String sql ="select * from user where email=? and password=? ";
		   	PreparedStatement pstmt =(PreparedStatement) con.prepareStatement(sql);
		   	pstmt.setString(1, email);
		   	pstmt.setString(2,password);
		   	System.out.println(sql);
		   	ResultSet rs=pstmt.executeQuery();
		   	if(rs.next()){
		   		response.sendRedirect("/BookStore/HomePage.jsp");
		   	}
		   	else{
		   		response.sendRedirect("/BookStore/Login.jsp");
		   	}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

	public void init() throws ServletException {
		// Put your code here
	}

}