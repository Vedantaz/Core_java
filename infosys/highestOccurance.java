import java.util.HashMap;
import java.util.Map;

public class highestOccurance {

    public static int findHighestOccurrence(String str) {
        // Implement your code here and change the return value accordingly
        Map<Character, Integer> charCounts = new HashMap<>();
        int maxCount = 0;

        for (char c : str.toCharArray()) {
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
            maxCount = Math.max(maxCount, charCounts.get(c));
        }

        return maxCount;
    }

    public static void main(String args[]) {
        String str = "success";
        System.out.println(findHighestOccurrence(str));
    }
}