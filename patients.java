package project;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class patients
{	
	//static final String driverName="com.mysql.jdbc.Driver";
	static final String driverName="com.mysql.cj.jdbc.Driver";
	static final String url ="jdbc:mysql://localhost/csc315";
	static final String user="root";
	static final String password="toor";
	public static void main(String a[])
	{
		try
		{       
			//Class.forName(driverName);
			Connection con = DriverManager.getConnection(url,user,password);
			Statement stmt = con.createStatement();
			String strSQL="select patient_id, lastname, firstname, dob from patients order by lastname";
			ResultSet rs = stmt.executeQuery(strSQL);
			while(rs.next())
			{
				System.out.print(rs.getInt("patient_id") + ",");
				System.out.print(rs.getString("lastname") + ",");
				System.out.print(rs.getString("firstname") + ",");
				System.out.println(rs.getString("dob"));
			}
			
			Scanner input=new Scanner(System.in);
			System.out.print("\nType 'a' to add, 'u' to update, 'd' to delete: ");
			String strChoice=String.valueOf(input.next().charAt(0));
			
			switch (strChoice)
			{
				case "a":
					System.out.println("===ADD===");
					System.out.print("enter lastname: ");
					String strLastname=input.next();
					
					System.out.print("enter firstname: ");
					String strFirstname=input.next();
					
					System.out.print("enter dob: ");
					String strDOB=input.next();
					
					strSQL="insert into patients values(null, '" + strLastname + "', '" + strFirstname + "', '" + strDOB + "', ";
					strSQL=strSQL + "'address', 'city', 'state', 'zip', 'phone', 'email')";
					System.out.println(strSQL);
					stmt.executeUpdate(strSQL);
					break;
					
				case "u":
					System.out.println("===UPDATE===");
					System.out.print("enter id of patient to update: ");
					int id=input.nextInt();
					
					System.out.print("enter new lastname or 'x' to skip: ");
					strLastname=input.next();
					
					System.out.print("enter new firstname or 'x' to skip: ");
					strFirstname=input.next();
					
					System.out.print("enter new dob or 'x' to skip: ");
					strDOB=input.next();
					
					if (!strLastname.equals("x"))
					{
						strSQL="update patients set lastname='" + strLastname + "' where patient_id=" + id;
						System.out.println(strSQL);
						stmt.executeUpdate(strSQL);
					}
					
					if (!strFirstname.equals("x"))
					{
						strSQL="update patients set firstname='" + strFirstname + "' where patient_id=" + id;
						System.out.println(strSQL);
						stmt.executeUpdate(strSQL);
					}
					
					if (!strDOB.equals("x"))
					{
						strSQL="update patients set dob='" + strDOB + "' where patient_id=" + id;
						System.out.println(strSQL);
						stmt.executeUpdate(strSQL);
					}
					break;
					
				case "d":
					System.out.println("===DELETE===");
					System.out.print("enter id of patient to delete: ");
					id=input.nextInt();
					strSQL="delete from patients where patient_id=" + id;
					System.out.println(strSQL);
					stmt.executeUpdate(strSQL);
					break;
					
			}
			rs.close();
			con.close();
		}
		catch (SQLException ex) {ex.printStackTrace();}			// was ClassNotFoundException
		catch (Exception e) {e.printStackTrace();}				// was SQLException
	}
}
