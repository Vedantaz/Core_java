// package.com company;

import java.util.Scanner;

public class controlStatements {
    public static void main(String[] args) {
       int a = 89;
       int b = 90;
       int age = 18;
    //    if (age>18){
    //     System.out.println("you can drive !");
    //    }
    //    else if (age < 18){
    //     System.out.println("you can't drive !");
    //    }
       System.out.print("Enter your age : ");
       Scanner sc = new Scanner(System.in);
       int age2 = sc.nextInt();
       System.out.println(age2);
    }
}