package com.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentList {

	public static void main(String[] args) {
		
		Connection con=Dao.GetConnection();
		
		String sql="select * from student";
		
		try {
			PreparedStatement stmt= con.prepareStatement(sql);
			ResultSet rs= stmt.executeQuery();
			while(rs.next())
			{
				System.out.print(rs.getInt("studentid"));
				System.out.print(rs.getString("studentname"));
				System.out.print(rs.getInt("addressid"));
				System.out.println();
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
