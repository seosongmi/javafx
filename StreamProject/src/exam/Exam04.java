package exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class Exam04 {
	public static void main(String[] args) {
		List<String> employees = new ArrayList<>();
		Connection conn = getConnect();
		try {
			String sql = "select * from employees";
			ResultSet rs = conn.prepareStatement(sql).executeQuery();
			while(rs.next()) {
				employees.add(rs.getString("first_name"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		long result = employees.stream().filter(s->s.startsWith("S"))
										.sorted()
										.peek(s->System.out.println(s))
										.count();
		System.out.println(result);
	}

	public static Connection getConnect() {
		Connection conn = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, "hr", "hr");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}





