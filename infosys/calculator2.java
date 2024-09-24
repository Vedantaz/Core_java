class Calculator {

    // Implement your code here
    private int num;

    public Calculator(int num) {
        this.num = num;
    }

    public int sumOfDigits() {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

}

public class calculator2 {

    public static void main(String args[]) {

        Calculator calculator = new Calculator(2);
        int sum = calculator.sumOfDigits();
        System.out.println("Sum of digits: " + sum);

    }
};