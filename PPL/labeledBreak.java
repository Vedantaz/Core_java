
import java.util.Scanner;

public class labeledBreak {
    public static void main(String[] args) {
    //    int a = 89;
    //    int b = 90;
    //    int age = 18;
    //    System.out.print("Enter your age : ");
    //    Scanner sc = new Scanner(System.in);
    //    int age2 = sc.nextInt();
    //    System.out.println(age2);


       // break switch loop
    navin:
    for (int i=1;i<=4; i++){
            for (int j=1; j<=4; j++){
                if (i==4){
                    break navin;

                }
                System.out.print("*");
            }
            System.out.println(" ");    
       }
    }
}