import java.util.Scanner;
public class practiseSet2 {
    public static void main(String[] args) {
    float a= 7/4.0f * 9/2.0f;
    System.out.println(a);      // 7/4 = 1 * 9 = 9/5 = 4.5 but 9 & 2 are int values > ans is in int > 4 and float = 4.0
    Scanner sc=new Scanner(System.in);   //System.in is a standard input stream  
   
    char y = 'A';
    y=(char)(y+8);
    System.out.println(y);
   // Decrypting the grades..
   y = (char)(y-8);
    System.out.println(y);

    // comparison operator to compare
    Scanner st = new Scanner(System.in);
    int h = st.nextInt();
    if (h > 5){  // 5 is the given number.
        System.out.println("It is greater than expected value.");
    }
    else if (h < 5){
        System.out.println("It is shorter than expected value.");
    }

    }
}