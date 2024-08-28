import java.util.*;

class Employee {

    private String employeeId;
    private String employeeName;
    private int salary;
    private int bonus;
    private int jobLevel;

    public Employee() {
        this.bonus = 0;
    }

    public Employee(String employeeId, String employeeName, int salary, int jobLevel) {

        this();
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
        this.jobLevel = jobLevel;

    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public int getSalary() {
        return salary;
    }

    public int getJobLevel() {
        return jobLevel;
    }

    public Employee setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
        return this;
    }

    public Employee setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
        return this;

    }

    public Employee setSalary(int salary) {
        this.salary = salary;
        return this;
    }

    public Employee setJobLevel(int jobLevel) {
        this.jobLevel = jobLevel;
        return this;
    }

    public void calculateSalary() {
        if (this.jobLevel >= 4) {
            this.bonus = 100;
        } else {
            this.bonus = 50;
        }
        this.salary += this.bonus;
    }
}

public class encapsulation {

    public static void main(String args[]) {

        Employee employee = new Employee("C101", "Steve", 654, 4);
        employee.calculateSalary();

        System.out.println("Employee Details");
        System.out.println("Employee Id: " + employee.getEmployeeId());
        System.out.println("Employee Name: " + employee.getEmployeeName());
        System.out.println("Salary: " + employee.getSalary());

    }
}
