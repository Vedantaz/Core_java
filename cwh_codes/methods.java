import java.util.*;

class methods {
    static int logic(int x, int y) {
        int z;
        if (x < y) {
            z = x + y;
        } else {
            z = x + y + 5;
        }
        return z;
    }

    static void multiplicationTable(int b) {
        for (int i = 1; i <= 10; i++) {

        }
    }

    static void Pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");

        }
    }

    static void Pattern1_rec(int n) {
        if (n > 0) {
            Pattern1_rec(n - 1);

            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.print("\n");

        }
    }

    static int fib(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    static float average(float f) {

        float avg = f / 2.0f;
        return avg;
    };

    static float Fahrenheit(float c) {
        float far = ((9) * c) / 5 + 32;
        return far;
    }

    public static void main(String args[]) { // static method static function la call krte..
        int a = 5;
        int b = 15;
        int c = logic(a, b);
        System.out.println(c);
        int x = (a - b) * 5;
        int y = (a * b) * 5;
        int z = (a % b) * 5;

        // problem no. 1: mul. table of no. n :
        // int n = 9;
        // int mul = 0;
        // int i = 1;
        // while(i<=n+1){
        // mul = n * i;
        // System.out.printf(n + "*" +i + " = " + mul);
        // System.out.print("\n");
        // i++;
        // }

        // Pattern1(5);
        // int result = fib(2);
        // System.out.println(result);

        // float ans = fib(4);
        // float v = average(ans);

        // System.out.println(v);

        // problem no. 8 : repeat 2 in recursion
        // Pattern1_rec(5);
        System.out.println((Fahrenheit(37)));
        float cel = 37;
        float ct = (9 * cel) / 5 + 32;
        System.out.println(ct);

    }
}
