package learnDataBaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class DataBaseConnection {
	
		public void database() {
			
			final String JDBC_Driver = "com.mysql.cj.jdbc.Driver";
			final String DB_URL = "jdbc:mysql://localhost:3306";
			
			final String user ="root";
			final String pass ="Java$232";
			
			Connection conn = null;
			Statement stmt = null;
			
			try {
				Class.forName(JDBC_Driver);
				
				
				try {
					conn = DriverManager.getConnection(DB_URL,user,pass);
					
					
					stmt = conn.createStatement();
					
					String sql ="SELECT FIRST_NAME, LAST_NAME FROM OPENTAPS.PERSON WHERE PARTY_ID = 10271";
					ResultSet executeQuery = stmt.executeQuery(sql);
					
					while (executeQuery.next()) {
						String firstName = executeQuery.getString("FIRST_NAME");
						String lastName = executeQuery.getString("LAST_NAME");
						System.out.println("First_Name : " + firstName + " Last_Name : "+ lastName);
					}
					
					executeQuery.close();
					stmt.close();
					conn.close();
					
					
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println(e);
				}
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
			}
			
			
		}
		
		public static void main(String[] args) {
			DataBaseConnection db = new DataBaseConnection();
			db.database();
		}
}
