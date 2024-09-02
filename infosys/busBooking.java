
class InvalidCouponCodeException extends Exception {
    public InvalidCouponCodeException(String message) {
        super(message);
    }
}

class InvalidDestinationException extends Exception {
    public InvalidDestinationException(String message) {
        super(message);
    }
}

class InvalidTripPackageException extends Exception {
    public InvalidTripPackageException(String message) {
        super(message);
    }
}

class BusBooking {
    // Implement your code here
    private int bookingId;
    private String destination;
    private String tripPackage;
    private double totalAmount;

    // Constructor to initialize the booking details
    public BusBooking(int bookingId, String destination, String tripPackage) {
        this.bookingId = bookingId;
        this.destination = destination;
        this.tripPackage = tripPackage;
        this.totalAmount = 0;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getTripPackage() {
        return tripPackage;
    }

    public void setTripPackage(String tripPackage) {
        this.tripPackage = tripPackage;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public boolean validateCouponCode(String couponCode, int numberOfMembers) throws InvalidCouponCodeException {
        if (couponCode.equals("BIGBUS") && numberOfMembers >= 10) {
            return true;
        } else if (couponCode.equals("MAGICBUS") && numberOfMembers >= 15) {
            return true;
        } else if (couponCode.equals("SUPERSAVER") && numberOfMembers >= 20) {
            return true;
        } else {
            throw new InvalidCouponCodeException("Invalid coupon code");
        }
    }

    public String bookTrip(String couponCode, int numberOfMembers) {
        try {
            // Validate the destination
            String[] validDestinations = { "Washington DC", "Philadelphia", "Orlando", "Boston" };
            boolean isValidDestination = false;
            for (String validDestination : validDestinations) {
                if (validDestination.equalsIgnoreCase(destination)) {
                    isValidDestination = true;
                    break;
                }
            }
            if (!isValidDestination) {
                throw new InvalidDestinationException("Invalid destination");
            }

            // Validate the trip package
            if (!(tripPackage.equalsIgnoreCase("Regular") || tripPackage.equalsIgnoreCase("Premium"))) {
                throw new InvalidTripPackageException("Invalid package");
            }

            // Validate the coupon code
            validateCouponCode(couponCode, numberOfMembers);

            // Calculate total amount based on the trip package
            if (tripPackage.equalsIgnoreCase("Regular")) {
                totalAmount = numberOfMembers * 500;
            } else if (tripPackage.equalsIgnoreCase("Premium")) {
                totalAmount = numberOfMembers * 800;
            }

            return "Booking successful";
        } catch (InvalidCouponCodeException e) {
            return e.getMessage();
        } catch (InvalidDestinationException e) {
            return e.getMessage();
        } catch (InvalidTripPackageException e) {
            return e.getMessage();
        }
    }

}

public class busBooking {
    public static void main(String[] args) {
        BusBooking booking = new BusBooking(101, "Orlando", "Regular");
        String result = booking.bookTrip("BIGBUS", 11);
        if (result.equals("Booking successful")) {
            System.out.println(result);
            System.out.println("Total amount for the trip: " + booking.getTotalAmount());
        } else {
            System.out.println(result);
            System.out.println("Your booking was not successful, please try again!");
        }
    }
}