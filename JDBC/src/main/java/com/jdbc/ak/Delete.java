package com.jdbc.ak;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {
	public static void main(String []ak) {
		Delete();
	}
		public static void Delete() {
		try {
			//1.load driver class 
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2.get connection
			String url = "jdbc:mysql:// localhost : 3306/Anil" ;
			String userName = "root";
			String pass = "root";
			Connection connection = DriverManager.getConnection(url,userName,pass);
			
			//3.create statements
			Statement statement = connection.createStatement();
			
			//4.execute query
			statement.execute("DELETE FROM jdbc WHERE id=2");
			
			//ResultSet rs = statement.executeQuery("SELECT * FROM jdbc");
					//while(rs.next()) {
						//System.out.println("id:" + rs.getInt(1) +"\t" +"name:" + rs.getString(2) +"\t"+ "emailid:" + rs.getString(3));
					//}
			//5.close the connection
			connection.close();
			
		}catch(ClassNotFoundException | SQLException e){
			e.printStackTrace();
			
			
		}
		}
}

