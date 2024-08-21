class Booking {
    // Implement your code here
    private String customerEmail;
    private int seatsRequired;
    private boolean isBooked;
    private static int seatsAvailable;

    // Static block to initialize seatsAvailable
    static {
        seatsAvailable = 400; // Initial seating capacity
    }

    // Constructor
    public Booking(String customerEmail, int seatsRequired) {
        this.customerEmail = customerEmail;
        this.seatsRequired = seatsRequired;

        // Check if required seats are available
        if (seatsRequired <= seatsAvailable) {
            this.isBooked = true;
            seatsAvailable -= seatsRequired; // Update available seats
        } else {
            this.isBooked = false;
        }
    }

    // Getter for customerEmail
    public String getCustomerEmail() {
        return customerEmail;
    }

    // Setter for customerEmail
    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    // Getter for seatsRequired
    public int getSeatsRequired() {
        return seatsRequired;
    }

    // Setter for seatsRequired
    public void setSeatsRequired(int seatsRequired) {
        this.seatsRequired = seatsRequired;
    }

    // Getter for isBooked
    public boolean isBooked() {
        return isBooked;
    }

    // Getter for seatsAvailable
    public static int getSeatsAvailable() {
        return seatsAvailable;
    }
}

class Seatbooking {
    public static void main(String[] args) {
        Booking booking1 = new Booking("jack@email.com", 100);
        Booking booking2 = new Booking("jill@email.com", 350);
        Booking booking3 = new Booking("charlie@example.com", 300);

        // Create more objects and add them to the bookings array for testing your code

        Booking[] bookings = { booking1, booking2, booking3 };

        for (Booking booking : bookings) {
            if (booking.isBooked()) {
                System.out.println(
                        booking.getSeatsRequired() + " seats successfully booked for " + booking.getCustomerEmail());
            } else {
                System.out.println(
                        "Sorry " + booking.getCustomerEmail() + ", required number of seats are not available!");
                System.out.println("Seats available: " + Booking.getSeatsAvailable());
            }
        }
    }
}
//