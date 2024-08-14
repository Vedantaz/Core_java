public class avgSalary {
    public static double[] findDetails(double[] salary) {
        // Implement your code here and change the return value accordingly
        int n = salary.length;
        double sum = 0;

        for (int i = 0; i < n; i++) {
            sum += salary[i];
        }

        double averageSalary = sum / n;
        int greaterCount = 0;
        int lesserCount = 0;

        for (int i = 0; i < n; i++) {
            if (salary[i] > averageSalary) {
                greaterCount++;
            } else if (salary[i] < averageSalary) {
                lesserCount++;
            }
        }

        double[] results = { averageSalary, greaterCount, lesserCount };
        return results;

    }

    public static void main(String[] args) {
        double[] salary = { 23500.0, 25080.0, 28760.0, 22340.0, 19890.0 };
        double[] details = findDetails(salary);

        System.out.println("Average salary: " + details[0]);
        System.out.println("Number of salaries greater than the average salary: " + details[1]);
        System.out.println("Number of salaries lesser than the average salary: " + details[2]);
    }
}
