import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {
	
	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/employees_database";
		int rowsAffected;
		
		try {
			//Establish connection Object
			Connection conn = DriverManager.getConnection(url,"root", "Vig_Sep21*2018");
			
			//Create a statement object to send to the database
			Statement statement = conn.createStatement();
			
			/**
			//Execute the statement object
			ResultSet resultSet = statement.executeQuery("select * from employees_tbl");
						
			//Process the result
			int salaryTotal = 0;
			while(resultSet.next()) {
				System.out.println(resultSet.getString("name"));
				System.out.println(resultSet.getInt("salary"));
				salaryTotal = salaryTotal + resultSet.getInt("salary");
			}
			System.out.println("Salary Total : " + salaryTotal);
			
			**/
			
			/**
			//Insert the data
			rowsAffected = statement.executeUpdate("insert into employees_tbl (id,name,dept,salary) "
					+ "values(900, 'Robert', 'Sales', 4000);");
			
			System.out.println("Executed an Insert statement - Rows affected : " + rowsAffected);
			
			**/
			
			/**
			//Delete the data
			rowsAffected = statement.executeUpdate("delete from employees_tbl");
			
			System.out.println("Executed a delete statement - Rows affected : " + rowsAffected);
			**/
			
			//Update the data
			rowsAffected = statement.executeUpdate("UPDATE employees_tbl SET salary = 5500 WHERE id = 100");
			
			System.out.println("Executed an update statement - Rows affected : " + rowsAffected);
			
		} catch (SQLException e) {
			System.out.println("Error while Insertion");
			//e.printStackTrace();
		}
	}
}
