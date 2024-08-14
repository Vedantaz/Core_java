
import java.util.Scanner;
public class j1 {
    public static void main(String[] args) {
        int a = 9;
        int b = 89;
        int c = a + b;
        System.out.println("Hello, World!");
        System.out.println(c);
        System.out.println(2&3);  // 2&3 = 2
        System.out.println(2|3);  // 2|3 = 3
        // In java associativity (left to right andvice versa.)
        // and precedence are usually preferred in compared to BODMASS rule.

        int v = 3*5-9/6;
        int m = 3/5-9*6;
        int k = 2*7/3;
        System.out.println(v);
        System.out.println(k);
        System.out.println(m);
        
        // byte, short ,long ,integer ,float ,double ,chracter  are the all data types.
  
        // increment and decrement operators.
        int i = 56;
        System.out.println(i);
        System.out.println(i++);  // i will be incremnt in the next round
        System.out.println(i);    // i was incremented in the last round.
        System.out.println(++i);  // i was incremented first and then printed.
        int j=45;
        int g= ++j;
        System.out.println(g);
        //  specifically  when character incremented > 
        char ch = 'a';
        System.out.println(++ch);
        String name = new String("Raj");
        System.out.println(name);
        System.out.println(name.length());
        int o=9;
        float h =7.89f;
        System.out.printf("The value of o is %d and value of h is %6.2f",o,h);
        /* 
        %d is for int , %f is for float , %s is for string.
        %c for char , %s for string , %b for boolean.
        */

        Scanner sc = new Scanner(System.in);
        String name1 = sc.next();
        System.out.println(name1);

    }
}