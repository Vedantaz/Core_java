
class Employee {

    // Implement your code here

    // public String toString(){
    // return "Employee\nemployeeId: "+this.getEmployeeId()+"\nemployeeName:
    // "+this.getEmployeeName()+"\nsalary: "+this.getSalary();
    // }

    private int employeeId;
    private String employeeName;
    private double salary;

    // Constructor to initialize employeeId and employeeName
    public Employee(int employeeId, String employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    // Getter and Setter methods for employeeId
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    // Getter and Setter methods for employeeName
    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    // Getter and Setter methods for salary
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Override toString method
    @Override
    public String toString() {
        return "Employee\nemployeeId: " + this.getEmployeeId() + "\nemployeeName: " + this.getEmployeeName()
                + "\nsalary: " + this.getSalary();
    }
}

class PermanentEmployee extends Employee {

    private double basicPay;
    private double hra;
    private float experience;

    // Constructor to initialize PermanentEmployee specific attributes
    public PermanentEmployee(int empId, String name, double basicPay, double hra, float experience) {
        super(empId, name);
        this.basicPay = basicPay;
        this.hra = hra;
        this.experience = experience;
    }

    // Method to calculate and set the monthly salary
    public void calculateMonthlySalary() {
        double variableComponent = 0;

        if (experience < 3) {
            variableComponent = basicPay * 0.05;
        } else if (experience >= 3 && experience < 5) {
            variableComponent = basicPay * 0.07;
        } else if (experience >= 5) {
            variableComponent = basicPay * 0.12;
        }

        double salary = basicPay + hra + variableComponent;
        setSalary(Math.round(salary));
    }

    // Getter and Setter methods for basicPay
    public double getBasicPay() {
        return basicPay;
    }

    public void setBasicPay(double basicPay) {
        this.basicPay = basicPay;
    }

    // Getter and Setter methods for hra
    public double getHra() {
        return hra;
    }

    public void setHra(double hra) {
        this.hra = hra;
    }

    // Getter and Setter methods for experience
    public float getExperience() {
        return experience;
    }

    public void setExperience(float experience) {
        this.experience = experience;
    }

    // Override toString method
    @Override
    public String toString() {
        return "PermanentEmployee\nemployeeId: " + this.getEmployeeId() + "\nemployeeName: " + this.getEmployeeName()
                + "\nsalary: " + this.getSalary() + "\nbasicPay: " + this.getBasicPay() + "\nhra: " + this.getHra()
                + "\nexperience: " + this.getExperience();
    }
}

class ContractEmployee extends Employee {

    private double wage;
    private float hoursWorked;

    // Constructor to initialize ContractEmployee specific attributes
    public ContractEmployee(int empId, String name, double wage, float hoursWorked) {
        super(empId, name);
        this.wage = wage;
        this.hoursWorked = hoursWorked;
    }

    // Method to calculate and set the salary
    public void calculateSalary() {
        double salary = hoursWorked * wage;
        setSalary(salary);
    }

    // Getter and Setter methods for wage
    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    // Getter and Setter methods for hoursWorked
    public float getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(float hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    // Override toString method
    @Override
    public String toString() {
        return "ContractEmployee\nemployeeId: " + this.getEmployeeId() + "\nemployeeName: " + this.getEmployeeName()
                + "\nsalary: " + this.getSalary() + "\nwage: " + this.getWage() + "\nhoursWorked: "
                + this.getHoursWorked();
    }
}

public class employee {

    public static void main(String[] args) {

        PermanentEmployee permanentEmployee = new PermanentEmployee(711211, "Rafael", 1855, 115, 3.5f);
        permanentEmployee.calculateMonthlySalary();
        System.out.println(
                "Hi " + permanentEmployee.getEmployeeName() + ", your salary is $" + permanentEmployee.getSalary());
        ContractEmployee contractEmployee = new ContractEmployee(102, "Jennifer", 16, 90);
        contractEmployee.calculateSalary();
        System.out.println(
                "Hi " + contractEmployee.getEmployeeName() + ", your salary is $" + contractEmployee.getSalary());

    }

}