import java.util.*;
import java.util.List.*;  
class recursion { 
    static int factorial(int n){
            // factorial(4) = 4 * 4-1 * 4-2 * 4-3 = 4*3*2*1 = 24
            // factorial(n) = n * factorial(n-1)
            // condition is apply = n>=1 , factorial(0) = 1
            if ( n==0 || n==1){
                return 1;
            } 
            return n * factorial(n-1);

            // iterative approach : for loops else..
            
           
    }
    static int factorial_iterative(int n){
            if (n==0 || n==1){
                return 1;
            }
            else{
                int product = 1;

                for (int i=1; i<=n;i++){
                    product *= i;
                }
                return product;
            }
           
    }
    static int fibonacci(int n){
        int a = 0, b = 1, c, i, count = 10;
        System.out.println(a + " " + b);
        List p = new ArrayList<>();
        for (i=2; i<count; i++){
            c = a+b;
            System.out.println(" " + c);
            p.add(c);
            a=b;
            b=c;
            
        }
        p.toString();
        return p;
        // return p.List();
// cure the error after coming ...
    }
    public static void main(String args[]) {
           
        //    System.out.println("Hey, it is recursion..");
        //    int x = factorial(4);
        //    System.out.println("factorial_iterative approach is " + factorial_iterative(4));
           
        //    System.out.println("factorial approach is " + x);

           //fibonacci series...
           System.out.println("The fibonacci number is : " + fibonacci(4));
           

           
      }
}

