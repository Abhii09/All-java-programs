
package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateAddress {

	public static void main(String[] args) throws Exception {
		
		  String url="jdbc:mysql://localhost:3306/jdbc?serverTimezone=UTC";
			
		  System.out.println("insert id which you wont update");
		  Scanner sc=new Scanner(System.in);
		   String id=sc.next();
		   
		   System.out.println("insert updated address");
		   String Address=sc.next();
		   
				   
		  Connection con=DriverManager.getConnection(url,"root","");
		  
		  Statement st=con.createStatement();
		  
		  String query="update student Set StudAdd='"+Address+"' where Sid="+id+" ";
		  
		  st.executeUpdate(query);
		  
		  System.out.println("updated");
		  con.close();
		  
	}
}
