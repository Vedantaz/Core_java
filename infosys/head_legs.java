import java.util.*;

public class head_legs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the total number of heads: ");
        int totalHeads = sc.nextInt();

        System.out.print("Enter the total number of legs: ");
        int totalLegs = sc.nextInt();

        // Check if the total number of legs is valid
        if (totalLegs % 2 != 0 || totalLegs < 2 * totalHeads || totalLegs > 4 * totalHeads) {
            System.out.println("Invalid input. Please enter valid values for heads and legs.");
            return;
        }

        // Calculate the number of rabbits and chickens
        int rabbits = (totalLegs - 2 * totalHeads) / 2;
        int chickens = totalHeads - rabbits;

        System.out.println("Number of rabbits: " + rabbits);
        System.out.println("Number of chickens: " + chickens);
    }
}
