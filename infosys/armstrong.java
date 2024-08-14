
public class armstrong {
    public static void main(String args[]) {
        int number = 371; // Example input
        int originalNumber = number;
        int sum = 0;
        int n = String.valueOf(number).length(); // Calculate the number of digits

        // Calculate the sum of each digit raised to the power of n
        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, n);
            number /= 10;
        }

        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }

    }
}
