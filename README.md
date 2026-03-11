# EmployeePayrollJDBC

Java JDBC implementation of the Employee Payroll Service learning problem.

This project demonstrates how a Java application connects to a MySQL database using JDBC and performs CRUD operations step-by-step using Git feature branches.

---

# Technologies Used

Java  
JDBC  
MySQL  
Maven  
Git & GitHub  

---

# Project Structure

EmployeePayrollJDBC
│
├── src
│   └── main
│       └── java
│           └── com
│               └── bridgelabz
│                   └── employeepayroll
│                       └── EmployeePayrollService.java

---

# Use Cases

## UC1 – Connect Java Program to Database
Establish connection between Java application and MySQL database using JDBC.

Concepts:
- JDBC Driver
- DriverManager
- Database connection

---

## UC2 – Retrieve Employee Payroll Data
Fetch employee payroll records from the database using SQL SELECT query.

Concepts:
- Statement
- ResultSet
- Reading database records

---

## UC3 – Update Employee Salary
Update the salary of an employee in the database.

SQL example:

UPDATE employee_payroll  
SET salary = 3000000  
WHERE name = 'Terisa';

Concepts:
- executeUpdate()

---

## UC4 – Use PreparedStatement for Updates
Use PreparedStatement instead of Statement to safely update employee salary.

Concepts:
- PreparedStatement
- Parameterized queries

---

## UC5 – Retrieve Employees by Date Range
Fetch employees whose start date falls within a specific range.

SQL example:

SELECT *  
FROM employee_payroll  
WHERE start BETWEEN '2018-01-01' AND '2020-12-31';

Concepts:
- Date filtering
- PreparedStatement parameters

---

## UC6 – Calculate Salary Statistics
Calculate salary statistics grouped by gender.

SQL example:

SELECT gender,  
SUM(salary),  
AVG(salary),  
MIN(salary),  
MAX(salary),  
COUNT(*)  
FROM employee_payroll  
GROUP BY gender;

Concepts:
- Aggregate functions
- Group by

---

## UC7 – Add New Employee
Insert a new employee record into the payroll database.

Concepts:
- INSERT query
- PreparedStatement

---

## UC8 – Update Salary Using PreparedStatement
Update employee salary using PreparedStatement for better security.

Concepts:
- PreparedStatement parameters

---

## UC9 – Retrieve Employees Using Date Condition
Fetch employee records using date conditions in SQL queries.

Concepts:
- ResultSet iteration
- Date filtering

---

## UC10 – Insert Employee with Start Date
Insert employee data including start date into the payroll table.

Concepts:
- Multiple column insert

---

## UC11 – Insert Multiple Employee Fields
Insert employee record including name, gender, salary, and start date.

Concepts:
- PreparedStatement with multiple parameters

---

## UC12 – JDBC Transactions
Demonstrate database transactions using commit and rollback.

Concepts:
- setAutoCommit(false)
- commit()
- rollback()

Example:

connection.setAutoCommit(false);  
connection.commit();  
connection.rollback();

---

# Git Branch Strategy

main  
└── README.md  

develop  
└── src  

feature/uc1  
feature/uc2  
feature/uc3  
feature/uc4  
feature/uc5  
feature/uc6  
feature/uc7  
feature/uc8  
feature/uc9  
feature/uc10  
feature/uc11  
feature/uc12  

Each use case is implemented in a separate feature branch. 
