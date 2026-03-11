package com.bridgelabz.employeepayroll;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class EmployeePayrollService {

    public static void main(String[] args) {

        String jdbcURL = "jdbc:mysql://localhost:3306/payroll_service";
        String username = "root";
        String password = "astronaut";

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection =
                    DriverManager.getConnection(jdbcURL, username, password);

            Statement statement = connection.createStatement();

            int rowsAffected =
                    statement.executeUpdate(
                            "update employee_payroll set salary = 3000000 where name = 'Terisa'"
                    );

            System.out.println("Rows Updated: " + rowsAffected);

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
