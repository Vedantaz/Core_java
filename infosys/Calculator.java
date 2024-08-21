
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double num3 = sc.nextDouble();

        Avg calculator = new Avg();
        double average = calculator.findAverage(num1, num2, num3);

        System.out.println(
                "The average of " + num1 + ", " + num2 + ", and " + num3 + " is: " + average);

        // sum calculation code ...

        int n = sc.nextInt();
        Sum s = new Sum();
        double sum = s.findSum(n);
        System.out.println(sum);
        sc.close();

    }
}

class Avg {
    public double findAverage(double num1, double num2, double num3) {
        double average = (num1 + num2 + num3) / 3;
        return Math.round(average * 100.0) / 100.0;
    }
}

class Sum {
    public int findSum(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            n /= 10;
        }
        return sum;
    }
}
