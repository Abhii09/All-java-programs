package crud;

import java.sql.*;

public class ConnectionDemo {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		try{  
	//			Class.forName("com.mysql.cj.jdbc.Driver");  
				Connection con=DriverManager.getConnection(  
				"jdbc:mysql://localhost:3306/jdbc?serverTimezone=UTC","root","");  
//				"jdbc:mysql://127.0.0.1:3306/test?serverTimezone=UTC", "root", "password")) {

				//here sonoo is database name, root is username and password  
				Statement stmt=con.createStatement();  
				ResultSet rs=stmt.executeQuery("select * from test");  
				while(rs.next())  
				System.out.println(rs.getInt(1)+"  "+rs.getString(2));  
				con.close();  
			}catch(Exception e){
				System.out.println(e);
				}  
			}  
		
	}


