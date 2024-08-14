import java.util.*;
import java.io.*;

public class practise_set_java_cwh {

    static int fib(int n) {
        if (n == 1 || n == 2)
            return n - 1;

        else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    // get the nth term
    public static void main(String[] args) {
        int res = fib(9);
        System.out.println(res);
    }

    // problem no : 8

}
