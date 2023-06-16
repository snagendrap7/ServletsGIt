package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/redirect")
public class Redirect extends HttpServlet{
      
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id=req.getParameter("id");
		String fname=req.getParameter("fname");
		String sname=req.getParameter("sname");
		String age=req.getParameter("age");
		String male=req.getParameter("male");
		String female=req.getParameter("female");
		
				
		System.out.println(id);
		System.out.println(fname);
		System.out.println(sname);
		System.out.println(age);
		System.out.println(male);
		System.out.println(female);
		
		
		
		
		}
}
