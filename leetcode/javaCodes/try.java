import java.util.*;

class Main {
      public static void main(String args[]) {
            System.out.println();

      }
}

// https://leetcode.com/problemset/all/?status=Solved&topicSlugs=linked-list :

// class Solution {
//     public int findMinFibonacciNumbers(int k) {
//         if (k < 2)
//             return k;

//         int first = 1;
//         int second = 1;

//         while (second <= k) {
//             second += first;
//             first = second - first;
//         }
//         return 1 + findMinFibonacciNumbers(k - first);
//     }
// }


