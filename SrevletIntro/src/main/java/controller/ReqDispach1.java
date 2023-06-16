package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/reqDis1")
public class ReqDispach1 extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	        RequestDispatcher rd=req.getRequestDispatcher("reqDis2");
	        PrintWriter out=resp.getWriter();
	        
	        req.setAttribute("data","qwerty");
	        rd.forward(req,resp);
	}
}
