
class Calculator {

	// Implement your code here
	public double findAverage(double num1, double num2, double num3) {
		double average = (num1 + num2 + num3) / 3.0;
		return Math.round(average * 100.0) / 100.0;
	}
}

public class classCalculator {

	public static void main(String args[]) {
		Calculator calculator = new Calculator();
		double num1 = 65, num2 = 175, num3 = 45;
		double average = calculator.findAverage(num1, num2, num3);
		System.out.println("Average: " + average);
		// Invoke the method findAverage of the Calculator class and display the average
	}
}