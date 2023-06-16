package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/rd2")
public class RdClass2 extends HttpServlet{
     
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	PrintWriter out=resp.getWriter();
	String name=(String)req.getAttribute("name");
	String id=req.getParameter("id");
	String email=req.getParameter("email");
	
	out.println("Hi"+name);
	out.println("your id is  "+id+"   email is  "+email);
	}
}
