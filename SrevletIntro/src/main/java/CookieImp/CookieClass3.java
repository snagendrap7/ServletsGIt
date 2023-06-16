package CookieImp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cookie3")
public class CookieClass3 extends HttpServlet{
      
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	     Cookie[] cookie=req.getCookies();
	     System.out.println(cookie.length);//length=7 cookies(6)+JSON(1)   Json is default cookie
	     String id=null;
	     String customerName=null;
	     String product=null;
	     String type=null;
	     String gst=null;
	     String price=null;
	     for(Cookie c:cookie) {
	    	 if(c.getName().equals("id")) {
	    		 id=c.getValue();
	    	 }
	    	 else if(c.getName().equals("name")) {
	    		 customerName=c.getValue();
	    	 }
	    	 else if(c.getName().equals("product")) {
	    		 product=c.getValue();
	    	 }
	    	 else if(c.getName().equals("gst")) {
	    		 gst=c.getValue();
	    	 }
	    	 else if(c.getName().equals("type")) {
	    		 type=c.getValue();
	    	 }
	    	 else if(c.getName().equals("price")) {
	    		 price=c.getValue();
	    	 }
	    	 }
	     PrintWriter out=resp.getWriter();
    	 
    	 out.println(id);
    	 out.println(customerName);
    	 out.println(product);
    	 out.println(gst);
    	 out.println(type);
    	 out.println(price);

	}
	     
	
	     
	
}
