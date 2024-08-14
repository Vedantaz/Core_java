public class leap {
    public static int[] findLeapYears(int startYear) {
        int[] leapYears = new int[15];
        int index = 0;

        while (index < 15) {
            if (isLeapYear(startYear)) {
                leapYears[index] = startYear;
                index++;
            }
            startYear++;
        }

        return leapYears;
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        int startYear = 2024;
        int[] leapYears = findLeapYears(startYear);

        System.out.println("Next 15 leap years starting from " + startYear + ":");
        for (int year : leapYears) {
            System.out.print(year + " ");
        }
    }
}
