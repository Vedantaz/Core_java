
import java.util.*;
class length_last_word { 
      public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int i = s.length()-1 ;
        int count =0 ;
        while(i > 0 ){
            if (s.substring(i,i+1) != " "){
                count+=1;
            }

            if (i != s.length()-1 && s.substring(i,i+1) == " "){
                break;
            }
            
            i-=1;
            
        }
        System.out.println(count);
        
                            
      }
}
