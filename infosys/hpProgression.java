public class hpProgression {
    public static double findHPSum(int num) {
        if (num <= 0) {
            return 0; // Invalid input, return 0
        } else if (num == 1) {
            return 1; // Base case: sum of 1/1 is 1
        } else {
            return 1.0 / num + findHPSum(num - 1);
        }
    }

    public static void main(String args[]) {
        System.out.println(findHPSum(3));
    }
}
