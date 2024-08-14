import java.util.*;

public class lcm {
    // public static void main(String[] args) {
    // int rows = 5; // Number of rows for the pattern

    // for (int i = rows; i > 0; i--) {
    // for (int j = 0; j < i; j++) {
    // System.out.print("*");
    // }
    // System.out.println(); // Move to the next line after printing each row
    // }
    // }

    // star code
    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        int num1 = 12, num2 = 15;

        int lcm = (num1 * num2) / gcd(num1, num2);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }
}
