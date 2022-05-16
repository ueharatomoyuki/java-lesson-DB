import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DbDevExam4_SelectSum {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement stmt = null;

		try {
			// load JDBC Driver
			Class.forName("org.postgresql.Driver");

			// confirm
			System.out.println(" --- before connection --- ");

			// database connect
			con = DriverManager.getConnection("jdbc:postgresql:dbconnection", "axizuser", "axiz");

			// confirm
			System.out.println(" --- after connection --- ");

			// SQL query string
			String sql = "SELECT sum(price)price FROM products ";

			// create statement
			stmt = con.prepareStatement(sql);

			// execute
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				int price = rs.getInt("price");

				System.out.print("合計金額：");
				System.out.println(price);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// close
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
