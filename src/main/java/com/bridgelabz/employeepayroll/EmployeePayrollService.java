package com.bridgelabz.employeepayroll;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
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

            String query =
                    "select gender, sum(salary), avg(salary), min(salary), max(salary), count(*) from employee_payroll group by gender";

            ResultSet resultSet = statement.executeQuery(query);

            while(resultSet.next()) {

                String gender = resultSet.getString(1);
                double sum = resultSet.getDouble(2);
                double avg = resultSet.getDouble(3);
                double min = resultSet.getDouble(4);
                double max = resultSet.getDouble(5);
                int count = resultSet.getInt(6);

                System.out.println(
                        gender + " | SUM=" + sum +
                        " | AVG=" + avg +
                        " | MIN=" + min +
                        " | MAX=" + max +
                        " | COUNT=" + count
                );
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
