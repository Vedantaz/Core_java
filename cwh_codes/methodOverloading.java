import java.util.*;
import java.util.Scanner;

class methodOverloading { 
    static void tellJoke(){
        System.out.println("I invented a new word \n" + "Plagiarism !");
        
    }
    static int Change(int w){
        w = 2;
        return w;
    }
    static void Change2( int []w){
        w[0] = 67;
        // return w;
    }
    static void foo(){
        System.out.println("What a busy day...");
        
    }
    static void foo(String a){
        System.out.println("What a busy day..." + a);
        
    }
    static void foo(String a, String b){  // this is parameters inside parenthesis before assigning the values
        System.out.println("Take a passion with a cool mind : " + a);
        System.out.println("Take a passion with a cool mind : " + b);
        
    }
    public static void main(String args[]) {
        
        //tellJoke();
        int []arr = {12,22,33,44,55,66};
        int x  = 89;
        Change(x);
        // System.out.println(Change2(int arr[]));
         
        // System.out.println("X after the change is : " + x);
        // System.out.println("arr after the change is : " + arr[0]);
        
        // array's value will be changed, but the value independently not changed.
        // The independent value will go to the function ,
        // But at the Array's Case : the address or reference of the array will be passed / copied.

        //Method overloading
        // foo();
        // foo("Vedant");        // this is argument inside the parenthesis.
        // foo("Vedant", "Parth");        // this is argument inside the parenthesis.
        // Arguments are actual Parameters !
        
      }
}
