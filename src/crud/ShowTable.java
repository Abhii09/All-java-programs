package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ShowTable {

	public static void main(String[] args) throws Exception {
		
						Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?serverTimezone=UTC","root",""); 						
						Statement stmt=con.createStatement();  
	     				ResultSet rs=stmt.executeQuery("select * from Student");  
						while(rs.next())  
						System.out.println(rs.getInt(1)+"  "+rs.getString(2)+","+rs.getString(3)+","+rs.getDouble(4));  
						con.close();  

	}
}
