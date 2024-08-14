import java.util.*;
import java.util.Random;
import java.util.Scanner;

class rockScissor{
    public static void main(String args[]){
            // playng the rock-paper-scissor game..
            // playing 3 times the game - play with conditions
            int rock = 0;
            int paper = 1;
            int scissor = 2;
            int countUser = 0;
            int countComp = 0;
            for (int i=0; i<3; i++){
                

                Scanner sc = new Scanner(System.in);
                System.out.println("Enter your choice : ");
            
                int user = sc.nextInt();

                int upper  = 3;
                Random rand = new Random();
                int comp = rand.nextInt(upper);
                System.out.println("Computer's choice : " + comp);
            
                
                if (comp == 0 && user == 1){
                    System.out.println("Congrats you won");
                    countUser+=1;
                    
                }
                else if (comp == 0 && user == 2){
                    System.out.println("Sorry, you loose");
                    countComp+=1;
                    
                }
                else if (comp == 1 && user == 0){
                    System.out.println("Sorry, you loose");
                    countComp+=1;
                    
                }
                else if (comp == 1 && user == 2){
                    System.out.println("Congrats you won");
                    countUser+=1;
                    
                }

                else if (comp == 2 && user == 0){
                    System.out.println("Congrats you won");
                    countUser+=1;
                    
                }
                else if (comp == 2 && user == 1){
                    System.out.println("Sorry, you loose");
                    countComp+=1;
                    
                }
                else if(comp == user) {
                    System.out.println("This match is tied ...");
                    

                }
            }
            if (countUser == 3){
                System.out.println("Hooray !, you beat the computer by 3-0.");
                
            }
            else if (countComp == 3){
                System.out.println("Bad luck !, computer beat you by 3-0.");
                
            }
            else if (countComp > countUser){
                System.out.println("Computer wins the final battle");
        }
            else if (countUser > countComp){
                System.out.println("You wins the final battle");
                
            }
            
            else{
                System.out.println("The battle is tied !");
                
            }
    }
}
