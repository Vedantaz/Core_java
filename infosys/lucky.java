public class lucky {
    public static void main(String[] args) {
        int number = 1623;
        int sumOfSquares = 0;
        int position = 1;

        while (number > 0) {
            int digit = number % 10; // Get the last digit

            // Check if the position is even
            if (position % 2 == 0) {
                sumOfSquares += digit * digit; // Add the square of the digit to the sum
            }

            number /= 10; // Remove the last digit
            position++; // Move to the next position
        }

        // Check if the sum of squares is a multiple of 9
        if (sumOfSquares % 9 == 0) {
            System.out.println("The number is a lucky number.");
        }
        else {
            System.out.println("The number is not a lucky number.");
        }
    }
}
