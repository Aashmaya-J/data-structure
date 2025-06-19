package connect;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class day11_task3 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException  {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/sample";
		String username="root";
		String password ="Kgisl@123";
		Connection con = DriverManager.getConnection(url,username,password);
		Statement stmt = con.createStatement();
		String Query="delete from student where id = 1";
		stmt.executeUpdate(Query);
		System.out.println("Table Create suceessfully");
	}
}