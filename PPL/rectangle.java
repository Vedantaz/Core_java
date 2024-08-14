import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {
        int l,b,area;
        Scanner sc = new Scanner(System.in);
        l=sc.nextInt();
        b=sc.nextInt();
        area = l*b;
        System.out.print(area);
    }
}
