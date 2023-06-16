package demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/login")
public class login extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        String emailId="snagendrap7@gmail.com";
        String password="112222";
      //  System.out.println(emailId);
       // System.out.println(password);
		
        String reqEmail=req.getParameter("emailId");
        String reqPass=req.getParameter("password");
        
        PrintWriter out=res.getWriter();
        if(reqEmail.equals(emailId)&&reqPass.equals(password)) {
        	out.println("Welcome!!! user");
        }else {
        	out.println("INVALID email or password");
        }
	}

}
