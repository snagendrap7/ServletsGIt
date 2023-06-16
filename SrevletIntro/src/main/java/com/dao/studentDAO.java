package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dto.Student;

public class studentDAO {
	
	private Connection getConnection() {//used to conn to java class todb
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String  url="jdbc:mysql://localhost:3306/studentinfo";
   	    String user="root";
   	    String pass="root";
   	    return DriverManager.getConnection(url,user,pass);
		}catch(Exception e) {
			e.printStackTrace();
	}
		return null;
	}
     public String SaveStudent(Student student)  {//
    	 try {
	    	 Connection connection=getConnection();
			 String query="insert into student values(?,?,?,?)";
			
			PreparedStatement ps=connection.prepareStatement(query);
			ps.setInt(1, student.getId());
			ps.setString(2, student.getName());
			ps.setString(3,student.getEmail());
			ps.setString(4, student.getIdcardno());
			
			int res=ps.executeUpdate();
			connection.close();
			return "no of rows added"+res;
			
		} catch ( SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	 return null;
     }
     
     public Student getStudentByID(int id) {
    	 String query="Select * from student where id='?'";
    	 Connection connection=getConnection();
    	 try {
    	 PreparedStatement ps=connection.prepareStatement(query);
    	 ps.setInt(1, id);
    	 ResultSet resultSet=ps.executeQuery();
    	 Student student=new Student();
    	 if(resultSet.next()) {
    		 student.setId(resultSet.getInt(1));
    		 student.setName(resultSet.getString(2));
    		 student.setEmail(resultSet.getString(3));
    		 student.setIdcardno(resultSet.getString(4));
    	 }
    	 connection.close();
    	 return student;
    	 }
    	 catch(SQLException e) {
    		 e.printStackTrace();
    	 }
    	 return null;
	}
}
