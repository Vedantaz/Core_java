class Teacher {
    private String name;
    private String subject;
    private double salary;

    public Teacher(String name, String subject, double salary) {
        this.name = name;
        this.subject = subject;
        this.salary = salary;
    }

    public double getSalary(double salary) {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getTeacherName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public void displayTeacherDetails() {
        System.out.println("Teacher Name: " + name);
        System.out.println("Teacher Salary: " + salary);
        System.out.println("Teacher Subject: " + subject);
    }

}

public class array {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("John Doe", "Mathematics", 50000.0);
        Teacher teacher2 = new Teacher("Jane Smith", "Science", 45000.0);
        Teacher teacher3 = new Teacher("David Lee", "History", 48000.0);
        Teacher teacher4 = new Teacher("Emily Brown", "English", 52000.0);

        Teacher[] teachers = { teacher1, teacher2, teacher3, teacher4 };

        for (Teacher teacher : teachers) {
            teacher.displayTeacherDetails();
        }
    }
}
