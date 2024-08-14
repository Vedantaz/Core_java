import java.util.*;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        if (a == b) {
            System.out.println("Sum is : " + 2 * a);
        }
        else
            System.out.println("Sum is : " + sum);
    }
}
