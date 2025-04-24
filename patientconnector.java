//package Data-Files;
import java.sql.Connection;
// import java.sql.DriverManager;
// import java.sql.ResultSet;
// import java.sql.SQLException;
// import java.sql.Statement;
// import java.util.Scanner;

 public class patientconnector
 {	

	public static void main (String[]args)
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
	
// 	static final String driverName="com.mysql.cj.jdbc.Driver";
// 	static final String url ="jdbc:mysql://localhost:3306/dentistsdb";
// 	static final String user="root";
// 	static final String password="Jasper20";
// 	public static void main(String a[])
// 	{
// 		try
// 		{       
// 			//Class.forName(driverName);
// 			Connection con = DriverManager.getConnection(url,user,password);
// 			Statement stmt = con.createStatement();
// 			String strSQL="select patient_id, last_name, firstname, date_of_birth from patients order by last_name";
// 			ResultSet rs = stmt.executeQuery(strSQL);
// 			while(rs.next())
// 			{
// 				System.out.print(rs.getInt("patient_id") + ",");
// 				System.out.print(rs.getString("last_name") + ",");
// 				System.out.print(rs.getString("first_name") + ",");
// 				System.out.println(rs.getString("date_of_birth"));
// 			}
			
// 			try (Scanner input = new Scanner(System.in)) {
// 				System.out.print("\nType 'a' to add, 'u' to update, 'd' to delete: ");
// 				String strChoice=String.valueOf(input.next().charAt(0));
				
// 				switch (strChoice)
// 				{
// 					case "a":
// 						System.out.println("===ADD===");
// 						System.out.print("enter last_name: ");
// 						String strLastname=input.next();
						
// 						System.out.print("enter first_name: ");
// 						String strFirstname=input.next();
						
// 						System.out.print("enter date_of_birth: ");
// 						String strDOB=input.next();
						
// 						strSQL="insert into patients values(null, '" + strLastname + "', '" + strFirstname + "', '" + strDOB + "', ";
// 						strSQL=strSQL + "'address', 'city', 'state', 'zipcode', 'phone', 'email')";
// 						System.out.println(strSQL);
// 						stmt.executeUpdate(strSQL);
// 						break;
						
// 					case "u":
// 						System.out.println("===UPDATE===");
// 						System.out.print("enter id of patient to update: ");
// 						int id=input.nextInt();
						
// 						System.out.print("enter new last_name or 'x' to skip: ");
// 						strLastname=input.next();
						
// 						System.out.print("enter new first_name or 'x' to skip: ");
// 						strFirstname=input.next();
						
// 						System.out.print("enter new date_of_birth or 'x' to skip: ");
// 						strDOB=input.next();
						
// 						if (!strLastname.equals("x"))
// 						{
// 							strSQL="update patients set last_name='" + strLastname + "' where patient_id=" + id;
// 							System.out.println(strSQL);
// 							stmt.executeUpdate(strSQL);
// 						}
						
// 						if (!strFirstname.equals("x"))
// 						{
// 							strSQL="update patients set first_name='" + strFirstname + "' where patient_id=" + id;
// 							System.out.println(strSQL);
// 							stmt.executeUpdate(strSQL);
// 						}
						
// 						if (!strDOB.equals("x"))
// 						{
// 							strSQL="update patients set date_of_birth='" + strDOB + "' where patient_id=" + id;
// 							System.out.println(strSQL);
// 							stmt.executeUpdate(strSQL);
// 						}
// 						break;
						
// 					case "d":
// 						System.out.println("===DELETE===");
// 						System.out.print("enter id of patient to delete: ");
// 						id=input.nextInt();
// 						strSQL="delete from patients where patient_id=" + id;
// 						System.out.println(strSQL);
// 						stmt.executeUpdate(strSQL);
// 						break;
						
// 				}
// 			}
// 			rs.close();
// 			con.close();
// 		}
// 		catch (SQLException ex) {ex.printStackTrace();}			// was ClassNotFoundException
// 		catch (Exception e) {e.printStackTrace();}				// was SQLException
// 	}
 }
