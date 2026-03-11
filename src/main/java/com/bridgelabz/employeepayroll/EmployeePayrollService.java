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

            String sql = "update employee_payroll set salary=? where name=?";

            PreparedStatement preparedStatement =
                    connection.prepareStatement(sql);

            preparedStatement.setDouble(1, 3500000);
            preparedStatement.setString(2, "Terisa");

            int rows = preparedStatement.executeUpdate();

            System.out.println("Rows Updated: " + rows);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
