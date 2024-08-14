import java.util.*;
                       
class ReverseWordString { 
      public static void main(String args[]) {
        Deque<String> dq = new ArrayDeque<String>();
        String s = new String();
        s = "vscode";
        for(int i=0; i < s.length(); i++){
            dq.add(s.substring(i,i+1));
            s.replace(s.substring(i,i+1), "");
            
            
        }
        int i=dq.size();
        while(i >= 0){
            s += dq.pop();
            i--;
        }
        System.out.println(s);
                            
      }
}


// https://leetcode.com/problems/reverse-words-in-a-string-iii/
// start from here