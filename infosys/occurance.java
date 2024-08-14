
import java.util.HashMap;
import java.util.Map;

public class occurance {
    public static int findTotalCount(int[] numbers) {
        // Implement your code here and change the return value accordingly
        int totalCount = 0;
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int num : numbers) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        for (int count : countMap.values()) {
            if (count >= 2) {
                totalCount += count - 1;
            }
        }

        return totalCount;
    }

    public static void main(String[] args) {
        int[] numbers = { 1, 1, 5, 100, -20, 6, 0, 0 };
        System.out.println("Count of adjacent occurrence: " + findTotalCount(numbers));
    }
}
