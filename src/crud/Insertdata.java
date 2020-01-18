package crud;
import java.util.*;


import java.sql.*;

public class Insertdata {

	public static void main(String[] args) throws SQLException {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id:");
		int id=sc.nextInt();
		
		System.out.println("Enter name");
		String name=sc.next();
		
		System.out.println("Enter Address");
		String Address=sc.next();
		
		System.out.println("Enter Salary:");
		Float sal=sc.nextFloat();
		
		
	   String url="jdbc:mysql://localhost:3306/jdbc?serverTimezone=UTC";
		
		Connection con=DriverManager.getConnection(url,"root","");
//		String insert=String.format("INSERT INTO student VALUES(2,'abhishek','karad',10000)"); manually record saved

		String insert="INSERT INTO student values("+id+",'"+name+"','"+Address+"',"+sal+")";
		Statement st=con.createStatement();
		st.executeUpdate(insert);
		
		
		System.out.println("record save sucessfully");
		
		con.close();
		
		
		
	
	
	}
	
}
