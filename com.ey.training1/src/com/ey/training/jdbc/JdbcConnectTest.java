package com.ey.training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JdbcConnectTest {

	//	1.driver 
	//	2.connection con  => heap
	//	3.statement
	//	4.ResultSet
	//	5.close the connection/external /IO 
	public static void main(String[] args) throws SQLException  {

		String sql = "select * from dblearning.employee ";

		Connection connection = null;
		ResultSet resultSet ;
		List<Employee> empList = new ArrayList<>();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dblearning", "root", "root");

			Statement statement = connection.createStatement();

			resultSet = statement.executeQuery(sql);
			
			while(resultSet.next()) {
				Employee e = new Employee();
				e.setId(resultSet.getInt("id"));
				e.setFirstName(resultSet.getString("emp_First_name"));
				e.setLastName(resultSet.getString("emp_last_name"));
				e.setAddress(resultSet.getString("address"));
				e.setContactNo(resultSet.getInt("contact_number"));
				empList.add(e);
//				System.out.println(resultSet.getInt("id") + " - "+resultSet.getString("emp_First_name")+
//						" - "+resultSet.getString("emp_last_name") +
//						" - "+resultSet.getString("address")+
//						" - "+resultSet.getInt("contact_number"));

			}
			
//			System.out.println("update dblearning.employee set");
//			
//			String updateQuery = "update dblearning.employee set  address = 'CHN' where id =1 ";
//			
//			statement.execute(updateQuery);
//			
//			resultSet = statement.executeQuery(sql);
//			
//			System.out.println("updated dblearning.employee set");
//
//			while(resultSet.next()) {
//				System.out.println(resultSet.getInt("id") + " - "+resultSet.getString("emp_First_name")+
//						" - "+resultSet.getString("emp_last_name") +
//						" - "+resultSet.getString("address")+
//						" - "+resultSet.getInt("contact_number"));
//
//			}
			

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			connection.close();
		}

		empList.forEach(emp ->{
			System.out.println(emp.getId() +"-"+emp.getFirstName() +"-"+emp.getLastName() +"-"+emp.getAddress() +"-"+emp.getContactNo() );
		});
	}

}
