public class reversedNum {
    public static int findReverse(int num, int temp) {
        // Implement your code here and change the return value accordingly
        int reversedNum = 0;
        while (num != 0) {
            int lastDigit = num % 10;
            reversedNum = reversedNum * 10 + lastDigit;
            num /= 10;
        }
        return reversedNum;
    }

    public static void main(String args[]) {
        int num = 12321;
        int reverseNum = findReverse(num, 0);
        if (num == reverseNum)
            System.out.println(num + " is a palindrome!");
        else
            System.out.println(num + " is not a palindrome!");
    }
}