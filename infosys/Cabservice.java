class Driver {
    private String driverName;
    private double averageRating;

    // Constructor
    public Driver(String driverName, double averageRating) {
        this.driverName = driverName;
        this.averageRating = averageRating;
    }

    // Getter and Setter methods
    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public double getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(double averageRating) {
        this.averageRating = averageRating;
    }
}

class CabServiceProvider {
    // Implement your code here
    private String cabServiceName;
    private int totalCabs;

    // Constructor
    public CabServiceProvider(String cabServiceName, int totalCabs) {
        this.cabServiceName = cabServiceName;
        this.totalCabs = totalCabs;
    }

    // Getter and Setter methods
    public String getCabServiceName() {
        return cabServiceName;
    }

    public void setCabServiceName(String cabServiceName) {
        this.cabServiceName = cabServiceName;
    }

    public int getTotalCabs() {
        return totalCabs;
    }

    public void setTotalCabs(int totalCabs) {
        this.totalCabs = totalCabs;
    }

    // Method to calculate reward price
    public double calculateRewardPrice(Driver driver) {
        double bonus = 0.0;
        double averageRating = driver.getAverageRating();

        if (averageRating < 4) {
            bonus = 0;
        } else if (averageRating >= 4 && averageRating < 4.5) {
            bonus = 10 * totalCabs;
        } else if (averageRating >= 4.5 && averageRating < 5) {
            bonus = 20 * totalCabs;
        } else if (averageRating == 5) {
            bonus = 30 * totalCabs;
        } else {
            return 0; // In case of invalid rating
        }

        // Round off to 2 decimal places
        bonus = Math.round(bonus * 100.0) / 100.0;
        return bonus;
    }
}

public class Cabservice {

    public static void main(String args[]) {
        CabServiceProvider cabServiceProvider1 = new CabServiceProvider("Halo", 50);

        Driver driver1 = new Driver("Luke", 4.8f);
        Driver driver2 = new Driver("Mark", 4.2f);
        Driver driver3 = new Driver("David", 3.9f);

        Driver[] driversList = { driver1, driver2, driver3 };
        for (Driver driver : driversList) {
            System.out.println("Driver Name: " + driver.getDriverName());
            double bonus = cabServiceProvider1.calculateRewardPrice(driver);
            if (bonus > 0)
                System.out.println("Bonus: $" + bonus + "\n");
            else
                System.out.println("Sorry, bonus is not available!");
        }

        // Create more objects of CabServiceProvider and Driver classes for testing your
        // code
    }
}
