
class Tickets {
    private int movieId;
    private double costTicket;
    private int noOfSeats;

    public Tickets(int noOfSeats, int movieId) {
        this.noOfSeats = noOfSeats;
        this.movieId = movieId;
        setCostTicket(movieId);
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

    public double totalAmount() {

        if (noOfSeats <= 0 || costTicket == 0.0)
            return 0.0;

        double total = costTicket * noOfSeats;
        total += total * 0.02;
        return Math.round(total * 100.0) / 100.0; // rounding it to 2 decimal places
    }

    // for movieId
    public int getMovieId() {
        return movieId;
    }

    // for noOfSeats
    public int getNoOfSeats() {
        return noOfSeats;
    }

    // for costTicket
    public double getCostTicket() {
        return noOfSeats;
    }

}

public class movie {
    public static void main(String[] args) {
        Tickets ticket = new Tickets(3, 2);
        double amt = ticket.totalAmount();
        if (amt == 0)
            System.out.println("Sorry! Please enter valid movie Id and number of seats");
        else
            System.out.println("Total amount for booking : $" + amt);
        System.out.println(" The amount we have to paid is : " + ticket.totalAmount());
    }

}
