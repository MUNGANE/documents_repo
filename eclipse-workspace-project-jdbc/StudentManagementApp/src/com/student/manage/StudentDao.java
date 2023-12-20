package com.student.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;



public class StudentDao {
	public static boolean insertStudentToDB(Student st) {
		boolean f=false;
		//jdbc code..
		try {
			Connection con = ConnectionProvider.creatC();
			String q= "insert into students(sname,sphone,scity) value(?,?,?)";
			
			//preparedstatement
			PreparedStatement stmt=con.prepareStatement(q);
			stmt.setString(1, st.getStudentname());
			stmt.setString(2, st.getStudentPhone());
			stmt.setString(3, st.getStudentCity());
			
			//execute
			stmt.executeUpdate();
			f=true;
		}
		catch(Exception e){
			e.printStackTrace();
			
		}
		return f;
		
	}

	public static boolean deleteStudent(int userId) {
		boolean f=false;
		//jdbc code..
		try {
			Connection con = ConnectionProvider.creatC();
			String q= "delete from students where sid=?";
			
			//preparedstatement
			PreparedStatement stmt=con.prepareStatement(q);
			stmt.setInt(1, userId);
			
			//execute
			stmt.executeUpdate();
			f=true;
		}
		catch(Exception e){
			e.printStackTrace();
			
		}
		return f;
		
		
		
	}

	public static boolean showAllStudent() {
		boolean f=false;
		//jdbc code..
		try {
			Connection con = ConnectionProvider.creatC();
			String q= "select * from students";
			
			//statement
			Statement st = con.createStatement();
			
			
			//execute
			ResultSet r=st.executeQuery(q);
			while(r.next()) {
				int id=r.getInt(1);
				String name = r.getString(2);
				String phone =r.getString(3);
				String city=r.getString("scity");
				
				System.out.println("ID"+id);
				System.out.println("Name"+name);
				System.out.println("Phone"+phone);
				System.out.println("City"+city);
				System.out.println("-----------------------------");
			}
			
			
			
			f=true;
		}
		catch(Exception e){
			e.printStackTrace();
			
		}
		return f;
		
	}

}
