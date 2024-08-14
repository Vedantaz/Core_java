// Implement a program to display the geometric sequence as given below for a given value n,
// where n is the number of elements in the sequence. 1, 2, 4, 8, 16, 32, 64, ......, 1024


import java.util.*;

public class iteration_inputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        while (i <= n) {
            if (i == n) {
                System.out.print(i * 2);
            }
            else
                System.out.print(i * 2 + ", ");
            i++;

        }
    }
}
