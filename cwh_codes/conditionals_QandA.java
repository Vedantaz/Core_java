import java.util.Scanner;

class conditionals_QandA {
    public static void main(String args[]) {
        /// Question 1::
        // int a = 10;
        // if (a==11){
        // System.out.println("a is 11");
        // }
        // else{
        // System.out.println("a is not 11");
        // }

        // Question 2 :: to find whether a student is passed or not.

        // byte m1, m2, m3, m4, m5;
        // System.out.println("Enter the marks in DSA");
        // Scanner sc = new Scanner(System.in);
        // m1 = sc.nextByte();
        // System.out.println("Enter the marks in Database");
        // Scanner sc2 = new Scanner(System.in);
        // m2 = sc2.nextByte();

        // System.out.println("Enter the marks in OS");
        // Scanner sc3 = new Scanner(System.in);
        // m3 = sc3.nextByte();
        // System.out.println("Enter the marks in 3D graphics");
        // Scanner sc4 = new Scanner(System.in);
        // m4 = sc4.nextByte();

        // float avg = (m1+m2+m3+m4)/4.0f;
        // System.out.println("Your overall percentage is " + avg);
        // if (avg>40 && m1>12 && m2>12 && m3>12 && m4>12){
        // System.out.println("Congrats , you passed.");
        // }
        // else{
        // System.out.println("Sorry, you're not passed");
        // }
        // Question 3::
        // income tax : tax
        // 2.5L - 5.0L 5%
        // 5.0L - 10.0L 20%
        // Above 10.0L 30%
        // Note : there is no tax below below 2.5L.
        float tax = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the income");

        float income = sc.nextFloat();

        if (income < 2.5) {
            tax = tax + 0;
        }
        else if (income >= 2.5 && income < 5f) {
            tax = tax + ((income - 2.5f) * 0.05f);
        }
        else if (income >= 5f && income < 10f) {
            tax = tax + (((income - 2.5f)) * 0.05f);
            tax = tax + (((income - 2.5f)) * 0.2f);
        }
        else {

            tax = tax + (((5.0f - 2.5f)) * 0.05f);
            tax = tax + (((10.0f - 5f)) * 0.2f);
            tax = tax + (((income - 10.0f)) * 0.3f);
        }
        System.out.println("Total tax paid by the employee : " + tax);
        sc.close();
    }
}
