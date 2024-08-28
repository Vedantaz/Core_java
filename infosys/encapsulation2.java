
class MovieTicket {

    private int movieId;
    private double costTicket;
    private int noOfSeats;

    public MovieTicket(int noOfSeats, int movieId) {
        this.noOfSeats = noOfSeats;
        this.movieId = movieId;
        setCostTicket(movieId);
    }

    public double calculateTotalAmount() {
        if (costTicket == 0.0 || noOfSeats <= 0) {
            return 0.0; // Invalid case
        }

        double totalAmount = costTicket * noOfSeats;
        totalAmount += totalAmount * 0.02; // Adding 2% tax
        return Math.round(totalAmount * 100.0) / 100.0; // Rounding to two decimal places
    }

    private void setCostTicket(int movieId) {
        switch (movieId) {
            case 1:
                this.costTicket = 150.0;
                break;
            case 2:
                this.costTicket = 200.0;
                break;
            case 3:
                this.costTicket = 250.0;
                break;
            default:
                this.costTicket = 0.0;
        }

    }

}

public class encapsulation2 {
    public static void main(String[] args) {

        MovieTicket movieTicket = new MovieTicket(112, 3);
        double amount = movieTicket.calculateTotalAmount();

        if (amount == 0)
            System.out.println("Sorry! Please enter valid movie Id and number of seats");
        else
            System.out.println("Total amount for booking : $" + amount);
    }
}