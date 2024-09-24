// see at infosys springBoard
class Student {
    // Implement your code here
    private String studentName;
    private String section;

    public Student(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getSection() {
        return section;
    }
}

class UndergraduateStudent extends Student {

    private int testResult;
    private int[] testScores; // Declare testScores as an array

    public UndergraduateStudent(String studentName) {
        super(studentName); // Call the parent class constructor
        this.testResult = -1; // Initialize testResult to -1 to indicate no result yet
        this.testScores = new int[4]; // Initialize the testScores array
    }

    public int getTestResult() {
        return testResult;
    }

    public int getTestScore(int index) {
        if (index >= 0 && index < 4) {
            return testScores[index];
        } else {
            System.out.println("Invalid test number. Must be between 0 and 3.");
            return -1;
        }
    }

    public void setTestScore(int testNumber, int testScore) {
        if (testNumber >= 0 && testNumber < 4) {
            this.testScores[testNumber] = testScore;
        } else {
            System.out.println("Invalid test number. Must be between 0 and 3.");
        }
    }

    public void generateResult() {
        int totalScore = testScores[0] + testScores[1] + testScores[2] + testScores[3];
        double averageScore = totalScore / 4.0;

        if (averageScore >= 70) {
            testResult = 1; // Pass
        } else {
            testResult = 0; // Fail
        }
    }

}

class GraduateStudent extends Student {
    // Implment your code here
    private int result;
    private int projectMarks;
    private int thesisDefenseScore;

    public GraduateStudent(String studentName) {
        super(studentName); // Call the parent class constructor
        this.result = -1; // Initialize result to -1 to indicate no result yet
    }

    public int getTestResult() {
        return result;
    }

    public void setTestScore(int testNumber, int testScore) {
        // Handle test scores for graduate students (e.g., project marks, thesis
        // defense)
        if (testNumber == 0) {
            projectMarks = testScore;
        } else if (testNumber == 1) {
            thesisDefenseScore = testScore;
        } else {
            System.out.println("Invalid test number. Must be 0 (for project) or 1 (for thesis defense).");
        }
    }

    public void generateResult() {
        // Calculate result based on graduate student criteria (e.g., project marks,
        // thesis defense)
        int totalScore = projectMarks + thesisDefenseScore;
        double averageScore = totalScore / 2.0;

        if (averageScore >= 70) {
            result = 1; // Pass
        } else {
            result = 0; // Fail
        }
    }
}

public class studentAbstraction {

    public static void main(String[] args) {
        UndergraduateStudent student = new UndergraduateStudent("Philip");
        student.setTestScore(0, 70);
        student.setTestScore(1, 69);
        student.setTestScore(2, 71);
        student.setTestScore(3, 55);

        student.generateResult();

        System.out.println("Student name: " + student.getStudentName());
        System.out.println("Result: " + student.getTestResult());

        System.out.println();

        GraduateStudent graduateStudent = new GraduateStudent("Jerry");
        graduateStudent.setTestScore(0, 70);
        graduateStudent.setTestScore(1, 69);
        graduateStudent.setTestScore(2, 71);
        graduateStudent.setTestScore(3, 55);

        graduateStudent.generateResult();

        System.out.println("Student name: " + graduateStudent.getStudentName());

        System.out.println("Result : " + graduateStudent.getTestResult());

    }
}
