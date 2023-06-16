package demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Save extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("Hello world");
		
		String id=req.getParameter("id");
		String name=req.getParameter("name");
		String age=req.getParameter("age");
		String email=req.getParameter("email");
	    
		res.setContentType("text/html");//this method is used to modify the content of response by default content type of a response is text
		
		System.out.println(id);
		System.out.println(name);
		System.out.println(age);
		System.out.println(email);
		
		PrintWriter out=res.getWriter();
		out.write("<body bgcolor=cyan>");
		out.println("<h1>"+id+"</h1>");
		
		out.println(id);
		out.println(name);
		out.println(age);
		out.println(email);
		out.write("</body>");
		
		
	}

}
