package demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Register extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	    
		String id=req.getParameter("id");
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String idcardno=req.getParameter("idcardno");
		
        res.setContentType("text/html");

		System.out.println(id);
		System.out.println(name);
		System.out.println(email);
		System.out.println(idcardno);
		
		PrintWriter out=res.getWriter();
		out.write("<body bgcolor=cyan>");
        out.println("<h1>hello"+name+"</h1>");
        
        out.println("<h1>Thankyou for register</h1>");
        out.println("<h1>your id is"+id+"</h1>");
        out.println("<h3> please verify your default</h3>");
        out.println("email"+email);
        out.println("idcardno"+idcardno);
        
        out.write("</body>");
	}
     
}
