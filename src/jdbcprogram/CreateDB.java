package jdbcprogram;

import java.sql.*;

public class CreateDB {

	public static void main(String[] args) throws SQLException
	{
		String url="jdbc:oracal:thin:@localhost:1521:XE";
		String user="Abhi";
		String pass="Abhi@123";
		String Sql_query=" create table employee(enum number,ename varchar(20),esal number,eaddress varchar(20))";
		
		Connection con=DriverManager.getConnection(url,user,pass);
		Statement st=con.createStatement();
		st.executeUpdate(Sql_query);
		System.out.println("table create sucessfully");

		con.close();
	}

}
