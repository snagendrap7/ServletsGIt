package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.dao.studentDAO;

import dto.Student;

public class GeTStudentByID extends GenericServlet{

	@Override
	public void service(ServletRequest req,ServletResponse res) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("id"));
//		String name=req.getParameter("name");
//		String email=req.getParameter("email");
//		String idcardno=req.getParameter("idcardno");
		studentDAO dao=new studentDAO();
		Student student =dao.getStudentByID(id);//it returns the value to the form
		PrintWriter out=res.getWriter();
//		out.println(id);
//		//out.println(name);
//		//out.println(email);
//	    out.println(idcardno);
	    out.println(student);
		
    }
 
}
