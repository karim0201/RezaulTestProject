package dbtest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver loaded");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "root", "MiliBou16");
		System.out.println("Connected to DB");
		
	}

}


//import java.sql.Connection;
//import java.sql.DriverManager;
//
//public class Main {
//  public static void main(String[] argv) throws Exception {
//    String driver = "com.mysql.jdbc.Driver";
//    String connection = "jdbc:mysql://localhost:3306/YourDBName";
//    String user = "root";
//    String password = "root";
//    Class.forName(driver);
//    Connection con = DriverManager.getConnection(connection, user, password);
//    if (!con.isClosed()) {
//      con.close();
//    }
//  }
//}
