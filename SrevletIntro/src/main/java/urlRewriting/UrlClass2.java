package urlRewriting;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet
public class UrlClass2 extends HttpServlet{
        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            Cookie[] cookie=req.getCookies();
            
            PrintWriter out =resp.getWriter();
            
            out.println("ID is="+id);
            out.println("NAME is="+name);
            out.println("k Value is="+K);
            
        }
}
