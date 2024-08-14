package com.ved;

import java.util.Scanner;
import java.util.*;

public class basic{
    public static void main(String[] args){
            atmOperationInterface op = new atmOperationImp();
            int atmNumber = 12345;
            int atmPin    = 123;
            Scanner in =  new Scanner(System.in);
            System.out.print("Enter the ATM Number : ");
            int atmnumber = in.nextInt();
            System.out.print("Enter pin : ");
            int atmpin = in.nextInt();
            if ((atmNumber == atmnumber) && (atmpin == atmPin)){
                while(true){
                    System.out.println("1. View Available Balance\n 2. Withdraw Amount \n 3. Deposit Amount \n 4. View mini statement \n 5. Exit");
                    System.out.println("Enthe choice : ");
                    int ch = in.nextInt();
                    if (ch == 1){
                        op.viewBalance()
                    }
                    else if (ch==2){
                        System.out.println("Enter Amount to be withDrawn : ");
                        double withdrawAmount =in.nextDouble();
                        
                        
                    }
                    else if (ch==3){
                        System.out.println("Enter Amount to deposit : ");
                        double depositAmount = in.nextDouble(); // 5000
                        op.depositAmount(depositAmount);
                    
                    }

                    else if (ch==4){
                        op.viewMiniStatement();

                    }

                    else if (ch==5){
                            System.out.println("Collect your ATM Card\n Thank you for using JAVA-ATM");
                            System.exit(0);

                    }
                    else{
                        System.out.println("Please enter from above given choices");
                        
                    }
                    
                    
                }
                    System.out.println("Validation done..");
                    
            }
            else{
                System.out.println("Incorrect credentials");
                // System.exit(status : 0);
            }

    }
}