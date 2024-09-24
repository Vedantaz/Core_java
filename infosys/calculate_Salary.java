class Faculty {
    // Implement your code here
    private String name;
    private float basicSalary;
    private float bonusPercentage = 4;
    private float carAllowancePercentage = 2.5f;

    // Constructor
    public Faculty(String name, float basicSalary) {
        this.name = name;
        this.basicSalary = basicSalary;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(float basicSalary) {
        this.basicSalary = basicSalary;
    }

    public float calculateSalary() {
        float bonus = (bonusPercentage / 100) * basicSalary;
        float carAllowance = (carAllowancePercentage / 100) * basicSalary;
        return basicSalary + bonus + carAllowance;
    }

}

class OfficeStaff {
    // Implement your code here
    private String name;
    private float basicSalary;
    private String designation;

    // Constructor
    public OfficeStaff(String name, float basicSalary, String designation) {
        this.name = name;
        this.basicSalary = basicSalary;
        this.designation = designation;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(float basicSalary) {
        this.basicSalary = basicSalary;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public float calculateSalary() {
        float additionalPay = 0;

        // Additional pay based on designation
        if (designation.equals("Accountant")) {
            additionalPay = 5000;
        } else if (designation.equals("Clerk")) {
            additionalPay = 3000;
        }

        return basicSalary + additionalPay;
    }
}

class Teacher extends Faculty {
    // Implement your code here
    private String qualification;

    // Constructor
    public Teacher(String name, float basicSalary, String qualification) {
        super(name, basicSalary);
        this.qualification = qualification;
    }

    // Getters and Setters
    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    @Override
    public float calculateSalary() {
        float additionalPay = 0;

        // Additional pay based on qualification
        if (qualification.equals("Masters")) {
            additionalPay = 6000;
        } else if (qualification.equals("PhD")) {
            additionalPay = 8000;
        }

        return super.calculateSalary() + additionalPay;
    }
}

public class calculate_Salary {
    public static void main(String[] args) {

        Teacher teacher = new Teacher("Caroline", 30500f, "Masters");
        OfficeStaff officeStaff = new OfficeStaff("James", 24000f, "Accountant");

        System.out.println("Teacher Details\n***************");
        System.out.println("Name: " + teacher.getName());
        System.out.println("Qualification: " + teacher.getQualification());
        System.out.println("Total salary: $" + Math.round(teacher.calculateSalary() * 100) / 100.0);
        System.out.println();

        System.out.println("Office Staff Details\n***************");
        System.out.println("Name: " + officeStaff.getName());
        System.out.println("Designation: " + officeStaff.getDesignation());
        System.out.println("Total salary: $" + Math.round(officeStaff.calculateSalary() * 100) / 100.0);

        // Create more objects for testing your code

    }
}