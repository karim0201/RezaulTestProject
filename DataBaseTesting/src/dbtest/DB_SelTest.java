package dbtest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class DB_SelTest {
//	public String url = "jdbc:mysql://localhost:3306/mili";  
//	public  String uname = "root";
//	public String pwd = "MiliBou16";
//    public static Statement stmt;
//    public static ResultSet rs;
//    public static Connection conn;
//	
	
	@Test
	public void dbConnection() throws SQLException
	{
		
		 try {

             // Load the mysql Data Server Driver for JDBC and SQLJ with DriverManager

			 Class.forName("com.mysql.jdbc.Driver");

           } catch (ClassNotFoundException e) {

                e.printStackTrace();
           }

    System.out.println("Driver loaded");

    String url = "jdbc:mysql://localhost:3306/mili";  
    String uname = "root";
    String pwd = "MiliBou16";
    Statement stmt;
    ResultSet rs;
    Connection conn;

    conn = DriverManager.getConnection(url, uname, pwd);

    // Commit changes manually
   conn.setAutoCommit(false);
   System.out.println("Created a JDBC connection to the data source");

   // Create the Statement
   stmt = conn.createStatement();                                         
   System.out.println("Created JDBC Statement object");

   // Execute a query and generate a ResultSet instance
   rs = stmt.executeQuery("SELECT * "
   							+ "FROM mili.info");   
   
   System.out.println("Created JDBC ResultSet object");


   // Print all of the employee numbers to standard output device
   while (rs.next()) 
   {

      String FirstName = rs.getString(1);
      String LastName = rs.getString(2);
      
      System.out.println("Info = " +  FirstName + LastName );
   }

   System.out.println("Fetched all rows from JDBC ResultSet");

   // Close the ResultSet
   rs.close();
   System.out.println("Closed JDBC ResultSet");

   // Close the Statement
   stmt.close();
   System.out.println("Closed JDBC Statement");

   // Connection must be on a unit-of-work boundary to allow close
   conn.commit();
   System.out.println ( "Transaction committed" );

   // Close the connection
   conn.close();                                                            
   System.out.println("Disconnected from data source");
   System.out.println("JDBC Exit from class EzJava - no errors");

	}

}
