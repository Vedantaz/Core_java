import java.util.ArrayList;
import java.util.List;

class findNumber {

    public static List<Integer> findNumbers(int num1, int num2) {
        List<Integer> numbers = new ArrayList<>();
        if (num1 >= num2) {
            throw new IllegalArgumentException("num1 must be less than num2");
        }

        for (int i = num1 + 1; i < num2; i++) {
            if (isTwoDigitNumber(i) && sumOfDigits(i) % 3 == 0 && i % 5 == 0) {
                numbers.add(i);
            }
        }
        return numbers;
    }

    private static boolean isTwoDigitNumber(int num) {
        return num >= 10 && num <= 99;
    }

    private static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 30;

        List<Integer> numbers = findNumbers(num1, num2);
        if (numbers.isEmpty()) {
            System.out.println("There is no such number!");
        } else {
            for (int number : numbers) {
                System.out.println(number);
            }
        }
    }
}
