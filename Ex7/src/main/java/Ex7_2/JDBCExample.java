package Ex7_2;

import java.sql.*;
import org.springframework.boot.autoconfigure.*;

@SpringBootApplication
public class JDBCExample {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost/spring5fs?" + "characterEncoding=utf-8&serverTimezome=UTC", "spring5",
					"spring5");
			stmt = conn.createStatement();

			String sql = "SELECT * FROM MEMBER";

			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				String email = rs.getString("EMAIL");
				String name = rs.getString("NAME");
				System.out.println("Email: " + email + ", Name: " + name);
			}

			rs.close();
			stmt.close();
			conn.close();
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException sqle) {
				sqle.printStackTrace();
			}

			try {
				if (conn != null)
					conn.close();
			} catch (SQLException sqle) {
				sqle.printStackTrace();
			}
		}
	}
}
