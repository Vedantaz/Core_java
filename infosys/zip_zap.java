import java.util.Scanner;

public class zip_zap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 5 == 0 && n % 3 == 0)
            System.out.println("Zoom");
        else if (n % 5 == 0 && n % 3 != 0)
            System.out.println("Zap");
        else
            System.out.println("Zip");
    }
}
