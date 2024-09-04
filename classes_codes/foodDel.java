package classes_codes;
import java.util.Scanner;

public class foodDel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ft = sc.next().charAt(0);

        int distance = sc.nextInt();
        int quantity = sc.nextInt(); // type are v - veg and n - Non veg

        // find the bill generated , quantity, distance, food type
        int bill = 0;

        if (distance == 0 || quantity <= 0 || (ft != 'V' && ft != 'N'))
            System.out.println(-1);

        if (ft == 'V')
            bill = 12 * quantity;
        else if (ft == 'N')
            bill = 15 * quantity;

        if (distance <= 3)
            System.out.println(bill);
        else if (distance <= 6)
            bill += 1;
        else
            bill += 2;
        System.out.println(bill);
    }
}
