package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/user")
public class login extends HttpServlet{

        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        	  String username="SNAGA";
              int password=121212;
              
              String requsername=req.getParameter("username");
              String reqpass=req.getParameter("pass");
             
              PrintWriter out=resp.getWriter();
              if(requsername.equals(username)&&reqpass.equals(reqpass)) {
            	out.print("valid user..!"); 
            	return;
        }
             RequestDispatcher rd=req.getRequestDispatcher("/invalid"); 
				rd.forward(req, resp);
			
            		
	}
     
}
