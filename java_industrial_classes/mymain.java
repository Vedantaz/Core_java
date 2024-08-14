// package java_industrial_classes;
import java.util.*;
import java.util.Scanner;

public record mymain() {
    // splitting full name into the first name, last name and middle name:
    // int[] nos = new int[17];
    // int[] nos = {12,45,56,67,78,89};
    // sortingArrayDemo(nos);
    String fullname;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your full name : ");
    fullname = sc.nextLine();
    System.out.println("Full name is %s \n: " + fullname);
    String[] sname = fullname.split(" ");

    for (int i = sname.length - 1; i >= 0; i++) {
        System.out.println("Last name is %s : " + sname[i]);
        break;

    }
    for (int j = 0; j < sname.length;) {
        System.out.println();
        System.out.println("First name is %s : " + sname[j]);
        break;
    } ;
    for (int k = 0; k < sname.length;) {
        System.out.println();
        System.out.println("First name is %s : " + sname[k]);
        break;
    }
    for (int l = 0; l < sname.length;) {
        System.out.println();
        System.out.println("Middle name is %s : " + sname[l]);
        if (l < sname.length - 2)
            continue;

    }
    sc.close();

}
