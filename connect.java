package project;
import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.SQLException;
// adding something
public class connect
{
	public static void main(String[] args)
	{
		Connection conn=null;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			conn=DriverManager.getConnection("jdbc:mysql://localhost/csc315?user=root&password=toor");
			System.out.println("connected...");
		}
		
		catch (Exception ex)
		{
			System.out.println("SQLException: " + ex.getMessage());
		}
	}
}