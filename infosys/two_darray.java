public class two_darray {
    public static void main(String[] args) {
        // Declaring and initializing 2D array
        int[][] dayWiseTemperature = new int[][] { { 29, 21 }, { 24, 23 },
                { 26, 22 }, { 28, 23 }, { 29, 24 }, { 23, 20 }, { 29, 21 } };

        // Displaying 2D array
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 2; j++) {
                if (j == 0)
                    System.out.println("Max Temperature is "
                            + dayWiseTemperature[i][j] + " on day " + i);
                else
                    System.out.println("Min Temperature is "
                            + dayWiseTemperature[i][j] + " on day " + i);
            }
        }
        int a[][] = { { 1, 3, 4 }, { 2, 3, 6 }, { 7, 6, 5 } };
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (a[i][j] % 2 == 0)
                    break;
                sum += a[i][j];
            }
        }
        System.out.println("sum = " + sum);

        int[][] inputArray = { { 3, 2, 3, 6 }, { 2, 4 }, { 9 }, { 2, 3, 4, 2 } };
        int total = 1;

        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 1; j < inputArray[i].length - 1; j++) {
                total *= inputArray[i][j];
            }
        }
        System.out.println("Result = " + total);

        int[][] numbers = { { 3, 2, 3, 6 }, { 2, 4 }, { 9 }, { 2, 3, 4, 2 } };
        int totalb = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (i == j)
                    continue;
                total += numbers[i][j];
            }
        }
        System.out.println("Result = " + totalb);
    }
}
