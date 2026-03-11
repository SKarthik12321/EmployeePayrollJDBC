package com.bridgelabz.employeepayroll;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class EmployeePayrollService {

    public static void main(String[] args) {

        String jdbcURL = "jdbc:mysql://localhost:3306/payroll_service";
        String username = "root";
        String password = "astronaut";

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection =
                    DriverManager.getConnection(jdbcURL, username, password);

            String query =
                    "insert into employee_payroll (name, salary, gender, start) values (?, ?, ?, ?)";

            PreparedStatement preparedStatement =
                    connection.prepareStatement(query);

            preparedStatement.setString(1, "Mark");
            preparedStatement.setDouble(2, 450000);
            preparedStatement.setString(3, "M");
            preparedStatement.setString(4, "2024-01-10");

            int rows = preparedStatement.executeUpdate();

            System.out.println("Employee Inserted: " + rows);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}