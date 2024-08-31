
class Employee {

    private String employeeId;
    private String employeeName;
    private int salary;
    private int bonus;
    private int jobLevel;

    public Employee(String employeeId, String employeeName, int salary, int jobLevel) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
        this.jobLevel = jobLevel;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getJobLevel() {
        return jobLevel;
    }

    public void setJobLevel(int jobLevel) {
        this.jobLevel = jobLevel;
    }

    public void calculateSalary() {
        bonus = jobLevel >= 4 ? 100 : 50;
        salary += bonus;
    }
}

public class encapsulation {

    public static void main(String args[]) {

        Employee employee = new Employee("C101", "Steve", 650, 4);

        employee.calculateSalary();

        System.out.println("Employee Details");
        System.out.println("Employee Id: " + employee.getEmployeeId());
        System.out.println("Employee Name: " + employee.getEmployeeName());
        System.out.println("Salary: " + employee.getSalary());

    }
}