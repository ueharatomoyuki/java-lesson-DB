
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DvExam4 {
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
			String sql = "SELECT * FROM products WHERE product_id = ? OR product_name = ? ";

			// create statement
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, 101);
			stmt.setString(2,"地球儀");

			// execute
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("product_id");
				String name = rs.getString("product_name");
				String price = rs.getString("price");
				
				System.out.print("product_id:");
				System.out.print(id);
				System.out.print(", product_name:");
				System.out.print(name);
				System.out.print(", prince:");
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

