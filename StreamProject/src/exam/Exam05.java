package exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Exam05 {
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		Connection conn = getConnect();
		try {
			String sql = "select salary, first_name from employees";
			ResultSet rs = conn.prepareStatement(sql).executeQuery();
			while (rs.next()) {
				employees.add(new Employee(rs.getInt("salary"), rs.getString("first_name")

				));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		employees.stream().sorted((a, b) -> a.getSalary() - b.getSalary()).filter(t -> t.getSalary() < 5000)
				.peek(s -> System.out.println(s.getSalary() + " - " + s.getFirstName()

				)).map(t -> t.getSalary()).reduce(0, (a, b) -> a + b);
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

class Employee {
	private int salary;
	private String firstName;
	private String lastName;

	public Employee(int salary, String firstName) {
		this.salary = salary;
		this.firstName = firstName;
	}

	public int getSalary() {
		return salary;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

}
