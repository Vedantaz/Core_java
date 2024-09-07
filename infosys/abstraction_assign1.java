class Payment {
    // Implement your code here
    private int customerId;
    private String paymentId;
    private int serviceTaxPercentage;

    // Constructor
    public Payment(int customerId) {
        this.customerId = customerId;
    }

    // Getter and Setter methods
    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public int getServiceTaxPercentage() {
        return serviceTaxPercentage;
    }

    public void setServiceTaxPercentage(int serviceTaxPercentage) {
        this.serviceTaxPercentage = serviceTaxPercentage;
    }

}

class DebitCardPayment extends Payment {
    // Implement your code here
    private static int counter;
    private double discountPercentage;

    static {
        counter = 1000; // Initializing static block
    }

    public DebitCardPayment(int customerId) {
        super(customerId);
        setPaymentId("D" + counter++);
    }

    public double payBill(double amount) {
        if (amount <= 500) {
            setServiceTaxPercentage(2); // 2% service tax
            discountPercentage = 1; // 1% discount
        } else if (amount > 500 && amount <= 1000) {
            setServiceTaxPercentage(4); // 4% service tax
            discountPercentage = 2; // 2% discount
        } else {
            setServiceTaxPercentage(5); // 5% service tax
            discountPercentage = 3; // 3% discount
        }

        // Calculating the bill amount
        double serviceTaxAmount = (amount * getServiceTaxPercentage()) / 100;
        double discountAmount = (amount * discountPercentage) / 100;
        return amount + serviceTaxAmount - discountAmount;
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(double discountPercentage) {
        discountPercentage = discountPercentage;
    }

    public void setDiscountPercentage(int discountPercentage) {
        discountPercentage = discountPercentage;
    }

    public void setCounter(int counter) {
        counter = counter;
    }

    public int getCounter() {
        return counter;
    }
}

class CreditCardPayment extends Payment {
    // Implement your code here

    private static int counter;

    static {
        counter = 1000; // Initializing static block
    }

    // Constructor
    public CreditCardPayment(int customerId) {
        super(customerId);
        setPaymentId("C" + counter++);
    }

    public double payBill(double amount) {
        if (amount <= 500) {
            setServiceTaxPercentage(3); // 3% service tax
        } else if (amount > 500 && amount <= 1000) {
            setServiceTaxPercentage(5); // 5% service tax
        } else {
            setServiceTaxPercentage(6); // 6% service tax
        }

        // Calculating the bill amount
        double serviceTaxAmount = (amount * getServiceTaxPercentage()) / 100;
        return amount + serviceTaxAmount;
    }

    public void setCounter(int counter) {
        counter = counter;
    }

    public int getCounter() {
        return counter;
    }

}

public class abstraction_assign1 {
    public static void main(String args[]) {
        DebitCardPayment debitCardPayment = new DebitCardPayment(101);
        double billAmount = Math.round(debitCardPayment.payBill(500) * 100) / 100.0;
        System.out.println("Customer Id: " + debitCardPayment.getCustomerId());
        System.out.println("Payment Id: " + debitCardPayment.getPaymentId());
        System.out.println("Service tax percentage: " + debitCardPayment.getServiceTaxPercentage());
        System.out.println("Discount percentage: " + debitCardPayment.getDiscountPercentage());
        System.out.println("Total bill amount: " + billAmount);

        CreditCardPayment creditCardPayment = new CreditCardPayment(102);
        billAmount = Math.round(creditCardPayment.payBill(1000) * 100) / 100.0;
        System.out.println("Customer Id: " + creditCardPayment.getCustomerId());
        System.out.println("Payment Id: " + creditCardPayment.getPaymentId());
        System.out.println("Service tax percentage: " + creditCardPayment.getServiceTaxPercentage());
        System.out.println("Total bill amount: " + billAmount);
    }
}