import java.util.*;

public class loan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Acc number : ");
        int accNumber = sc.nextInt();
        System.out.println(" Acc balance : ");
        int accBalance = sc.nextInt();
        System.out.println(" Salary :");
        int salary = sc.nextInt();
        System.out.println("Loan Type : ");
        sc.nextLine();
        String loanType = sc.nextLine();
        System.out.println("Loan Amount : ");
        int expectedAmt = sc.nextInt();
        System.out.println("Expected EMI : ");
        int expectedEMI = sc.nextInt();

        if (accNumber < 1000)
            System.out.println("Insufficient account balance");

        int eligibleamt = 0;
        int elgibleEMI = 0;

        if (salary > 25000) {
            eligibleamt = 50000;
            elgibleEMI = 36;
        }
        else if (salary > 50000) {
            eligibleamt = 6000000;
            elgibleEMI = 60;
        }
        else if (salary > 75000) {
            eligibleamt = 7500000;
            elgibleEMI = 84;
        }
        else
            System.out.println("Salary is too low for a loan.");

        if (expectedAmt <= eligibleamt && expectedEMI <= elgibleEMI) {
            System.out.println("Loan approved!");
            System.out.println("Account Number: " + accNumber);
            System.out.println("Salary: $" + salary);
            System.out.println("Account Balance: $" + accBalance);
            System.out.println("Loan Type: " + loanType);
            System.out.println("Expected Loan Amount: $" + expectedAmt);
            System.out.println("Expected EMIs: " + expectedEMI);
            System.out.println("Eligible Loan Amount: $" + eligibleamt);
            System.out.println("Eligible EMIs: " + elgibleEMI);
        }
        else {
            System.out.println(
                    "Loan not approved. The expected loan amount or EMIs exceed eligible limits.");
        }

    }
}
