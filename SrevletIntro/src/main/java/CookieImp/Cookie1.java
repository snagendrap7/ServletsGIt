package CookieImp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/CookieImp")
public class Cookie1 extends HttpServlet{
   
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		  String id=req.getParameter("id");
	        String name=req.getParameter("name");
	        String email=req.getParameter("email");
	        
	        Cookie c=new Cookie("id",id);
	        Cookie c1=new Cookie("name",name);
	        Cookie c2=new Cookie("email",email);
	        
	        resp.addCookie(c);
	        resp.addCookie(c1);
	        resp.addCookie(c2);
	        
	        resp.sendRedirect("secure12");

	}
      	
}
