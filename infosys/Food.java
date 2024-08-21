import java.util.*;
import java.util.concurrent.DelayQueue;

class Orders {
    private int orderId;
    private Details[] orderedFoods;
    private double totalPrice;
    private String status;

    public Orders(int orderId, Details[] orderedFoods) {
        this.orderId = orderId;
        this.orderedFoods = orderedFoods;
        this.totalPrice = 0.0;
        this.status = "Ordered";
    }

    public Orders() {
        this.status = "Ordered";
    }

    public double Calculate(int unitPrice) {
        totalPrice += unitPrice + (unitPrice * 0.05);
        return totalPrice;
    }

    public String getStatus() {
        return status;
    }

}

class Details {
    // Attributes of the Food class
    private String foodName;
    private String cuisine;
    private String foodType;
    private int quantity;
    private double unitPrice;

    // Constructor to initialize the Food object
    public Details(String foodName, String cuisine, String foodType, int quantity,
            double unitPrice) {
        this.foodName = foodName;
        this.cuisine = cuisine;
        this.foodType = foodType;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    // Getter and Setter methods for each attribute
    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getCuisine() {
        return cuisine;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    // Method to calculate the total price
    public double calculateTotalPrice() {
        return this.quantity * this.unitPrice;
    }

    // Override the toString method to display food details
    @Override
    public String toString() {
        return "Food{" + "foodName='" + foodName + '\'' + ", cuisine='" + cuisine + '\''
                + ", foodType='" + foodType + '\'' + ", quantity=" + quantity + ", unitPrice="
                + unitPrice + ", totalPrice=" + calculateTotalPrice() + '}';
    }
}

class Order {
    private int orderId;
    private static int orderIdCounter;
    private Details[] orderedFoods;

    static {
        orderIdCounter = 101;
    }

    public Order(Details[] orderFoods) {
        this.orderedFoods = orderFoods;
        this.orderId = orderIdCounter++;
    }

    public int getOrderId() {
        return orderId;
    }

    public Details[] getOrderedFoods() {
        return orderedFoods;
    }

    // Setter for orderedFoods
    public void setOrderedFoods(Details[] orderedFoods) {
        this.orderedFoods = orderedFoods;
    }

    public static int getTotalNoOfOrders() {
        return orderIdCounter - 101;
    }
}

class Restaurent {
    private String name;
    private String contact;
    private String address;
    public float rating;

    public Restaurent(String name, String contact, String address, float rating) {
        this.name = name;
        this.address = address;
        this.contact = contact;
        this.rating = rating;
    }

    public void displayRestaurentDetails() {
        System.out.println("The details are : " + "name : " + name + "address : " + address
                + "rating : " + rating + "contact : " + contact);
    }
}

public class Food {
    public static void main(String[] args) {
        // Creating a Food object
        Details pizza = new Details("Pizza", "Italian", "Non-Vegetarian", 2, 11.99);
        Details dosa = new Details("dosa", "south indian", "Vegetarian", 3, 9.99);
        Details[] foods = { pizza, dosa };

        // List<String> foods = new ArrayList<>();
        // foods.add("Pizza");
        // foods.add("Pasta");

        Order order1 = new Order(foods);
        Order order2 = new Order(foods);

        // orderss ..
        Orders val = new Orders();
        System.out.println(val.getStatus());

        Orders value = new Orders(101, foods);
        value.Calculate(200);
        value.Calculate(150);

        Restaurent r = new Restaurent("Pulkit", "2356897841", "Vijay Nagar", 4);
        r.displayRestaurentDetails();

        System.out.println(value.Calculate(45));
        // Displaying the food details
        System.out.println(pizza);
    }

}
