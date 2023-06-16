package demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/logiN")
public class login1 extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String emailId="snagendrap7@gmail.com";
        String password="112222";
        System.out.println(emailId);
        System.out.println(password);
		
        
        String reqEmail=req.getParameter("emailId");
        String reqPass=req.getParameter("password");
        
        PrintWriter out=res.getWriter();
        if(reqEmail.equals(emailId)&&reqPass.equals(password)) {
        	out.println("Welcome!!! user");
        }else {
        	out.println("INVALID email or password");
        }
        out.println("doPost() executed");
	}
     
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String emailId="snagendrap7@gmail.com";
        String password="112222";
        System.out.println(emailId);
        System.out.println(password);
		
        String reqEmail=req.getParameter("emailId");
        String reqPass=req.getParameter("password");
        
        PrintWriter out=res.getWriter();
        if(reqEmail.equals(emailId)&&reqPass.equals(password)) {
        	out.println("Welcome!!! user");
        }else {
        	out.println("INVALID email or password");
        }
        out.println("doGet() executed");
	}

}
