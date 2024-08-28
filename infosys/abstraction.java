import java.util.*;

class Customer {
    private String customerName;

    public Customer(String customerName) {
        this.customerName = customerName;
    }

    public double calculateFinalPrice(double totalPrice, double discount) {
        double priceAfterDiscount = totalPrice * (1 - (discount / 100));
        return priceAfterDiscount;

    }

    public void payBill(double totalPrice, double discount) {

        System.out.println("Calculating final amount to be paid.....");
        double finalPrice = calculateFinalPrice(totalPrice, discount);
        System.out.println("Hi " + customerName
                + ", your final bill amount after discount is "
                + finalPrice);
    }

}

public class abstraction {
    public static void main(String args[]) {

        Customer customer = new Customer("Jack");
        customer.payBill(500, 5);
    }
};
