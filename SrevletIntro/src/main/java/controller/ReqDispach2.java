package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/reqDis2")
public class ReqDispach2 extends HttpServlet{

	    @Override
	    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	    	System.out.println("this is dopost() fro second servlet");
	    	
	    	String id=req.getParameter("id");
	    	String name=req.getParameter("name");
	    	String email=req.getParameter("email");
	    	String data=(String)req.getAttribute("data");
	    	req.getAttribute("data");//return type is:Object
	    	PrintWriter out=resp.getWriter();
	    	resp.setContentType("text/html");
	    	out.write("<body bgcolor=white>");
	    	
	    	out.println(id);
	    	out.println(name);
	    	out.println(email);
	    	out.println(data);
	    	out.write("</body>");
	    }
}
