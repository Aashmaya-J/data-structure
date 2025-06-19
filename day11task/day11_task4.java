package connect;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class day11_task4 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException  {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/sample";
		String username="root";
		String password ="Kgisl@123";
		Connection con = DriverManager.getConnection(url,username,password);
		Statement stmt = con.createStatement();
		String Query="select * from student";
		ResultSet rs = stmt.executeQuery(Query);
		
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+"  "+rs.getInt(3));
		}
	}
}