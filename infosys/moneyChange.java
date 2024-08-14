import java.util.Scanner;

public class moneyChange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of $5 notes: ");
        int x = sc.nextInt();
        System.out.print("Enter the number of $1 notes: ");
        int y = sc.nextInt();
        System.out.print("Enter the amount to be paid: ");
        int z = sc.nextInt();

        int maxfives = z / 5;
        int fives = Math.min(maxfives, z);

        int remainingAmt = z - (fives * 5);

        if (remainingAmt <= y) {
            System.out.println("Number of $5 notes used: " + fives);
            System.out.println("Number of $1 notes used: " + remainingAmt);
        }
        else
            System.out.println(-1);
    }
}
