package controller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.dao.studentDAO;

import dto.Student;

public class SaveStudent extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("id"));
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String idcardno=req.getParameter("idcardno");
		
		System.out.println(id);
		System.out.println(name);
		System.out.println(email);
		System.out.println(idcardno);
		
		Student student=new Student();
		student.setId(id);
		student.setName(name);
		student.setEmail(email);
		student.setIdcardno(idcardno);
		
		studentDAO dao=new studentDAO();
		res.getWriter().write(dao.SaveStudent(student));
	}
   
}
