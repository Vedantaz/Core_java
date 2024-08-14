// import java.util.*;

// public class palindrome {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int number = sc.nextInt();

//         int reversedNumber = 0;
//         int originalNumber = number;

//         while (number > 0) {
//             int remainder = number % 10;
//             reversedNumber = (reversedNumber * 10) + remainder;
//             number /= 10;
//         }

//         if (originalNumber == reversedNumber) {
//             System.out.println(originalNumber + " is a palindrome.");
//         }
//         else {
//             System.out.println(originalNumber + " is not a palindrome.");
//         }
//     }
// }

// new method with functions

public class palindrome {
    public static boolean checkPalindrome(String str) {
        // Implement your code here and change the return value accordingly
        int left = 0;
        int right = str.length() - 1;

        // Loop until the middle of the string
        while (left < right) {
            // Compare characters from both ends
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Return false if characters don't match
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String args[]) {
        String str = "radar";
        if (checkPalindrome(str))
            System.out.println("The string is a palindrome!");
        else
            System.out.println("The string is not a palindrome!");
    }
}