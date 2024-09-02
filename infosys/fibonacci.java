public class fibonacci {

    public static int findFibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return findFibonacci(n - 1) + findFibonacci(n - 2);
        }
    }

    public static void main(String args[]) {
        int n = 7;
        if (n != 0)
            System.out.println(findFibonacci(n));
        else
            System.out.println("Please enter a valid value for n");
    }
}
