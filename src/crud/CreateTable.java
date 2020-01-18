package crud;
import java.sql.*;
public class CreateTable {

	public static void main(String[] args) throws SQLException {
		
		String url="jdbc:mysql://localhost:3306/jdbc?serverTimezone=UTC";
		
		Connection con=DriverManager.getConnection(url,"root","");
		
		Statement st=con.createStatement();
		
		String que="CREATE TABLE student(Sid INT,Sname VARCHAR(20),StudAdd VARCHAR(20),Salary DOUBLE)";
		
		st.executeUpdate(que);
		
		System.out.println("table created");

		con.close();
	}

}
