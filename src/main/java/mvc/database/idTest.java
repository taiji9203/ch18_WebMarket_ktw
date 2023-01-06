package mvc.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class idTest {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			try {

				Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/WebMarketDB", 
						"root","1234");
				System.out.println("success");
				Statement stmt = (Statement) conn.createStatement();

			} catch (SQLException ex) {
				System.out.println("SQLException" + ex);
			}
			
			
			
		}

	}