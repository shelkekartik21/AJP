import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc {
	
	public static void main(String args[]) {
		String URL = "jdbc:mysql://localhost:3306/jdbcdb";
		String usr = "root";
		String pass = "";
		String q1 = "INSERT INTO studentdata VALUES(1, 304, 'Kartik', 'Shelke', '12345678691')";
		String q2 = "SELECT * FROM studentdata";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(URL,usr,pass);
			Statement stmt = con.createStatement();
			
			System.out.println("Inserting data");
			stmt.execute(q1);
			
			System.out.println("Data after inserting");
			ResultSet rs = stmt.executeQuery(q2);
			
			while(rs.next()) {
				System.out.println(rs.getInt("SrNo") + rs.getInt("RollNo") + rs.getString("First_Name") + rs.getString("Last_Name") + rs.getString("Mobile_no"));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
}
