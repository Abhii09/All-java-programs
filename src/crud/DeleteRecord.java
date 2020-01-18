package crud;
import java.sql.*;
import java.util.*;

public class DeleteRecord {
	public static void main(String[] args) throws Exception {
		  String url="jdbc:mysql://localhost:3306/jdbc?serverTimezone=UTC";
			
		  System.out.println("enter which id you wont delete");
		  Scanner sc=new Scanner(System.in);
		   int id=sc.nextInt();
				   
		  Connection con=DriverManager.getConnection(url,"root","");
		  Statement st=con.createStatement();
		  String query="delete from student where sid="+id+"";
		  st.executeUpdate(query);
		  con.close();
	}

}
