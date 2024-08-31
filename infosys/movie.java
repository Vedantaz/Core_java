class MovieTicket {
    // Implement your code here
    private int movieId;
    private int noOfSeats;
    private double costPerTicket;

    public MovieTicket(int movieId, int noOfSeats) {
        this.movieId = movieId;
        this.noOfSeats = noOfSeats;

        // Set costPerTicket based on movieId
        switch (movieId) {
            case 101:
                costPerTicket = 100.0;
                break;
            case 102:
                costPerTicket = 150.0;
                break;
            case 103:
                costPerTicket = 200.0;
                break;
            default:
                costPerTicket = 0.0;
        }
    }

    public double calculateTotalAmount() {
        if (costPerTicket == 0) {
            return 0; // Invalid movie ID
        }

        double totalAmount = costPerTicket * noOfSeats;
        double tax = totalAmount * 0.02;
        totalAmount += tax;

        return Math.round(totalAmount);
    }
}

public class movie {
    public static void main(String[] args) {
        MovieTicket movieTicket = new MovieTicket(112, 3);
        double amount = movieTicket.calculateTotalAmount();
        if (amount == 0)
            System.out.println("Sorry! Please enter valid movie Id and number of seats");
        else
            System.out.println("Total amount for booking : $" + amount);
    }
}