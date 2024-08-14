// package.com company;
import java.util.Scanner;
public class multiplicationArrays {
    public static void main(String[] args) {
    int a[][]= {{1,4,5},{8,12,32},{13,22,34}};
    int b[][]= {{56,89,78},{21,67,23},{17,26,35}};
    int c[][]=new int[3][3];
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            c[i][j]=0;      
            for(int k=0;k<3;k++)      
                {      
                      c[i][j]+=a[i][k]*b[k][j];     
                }
            System.out.print(c[i][j]+" ");
            }
    System.out.println();//new line    
        }
    }
}