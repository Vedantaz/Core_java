class Participant {
    private static int counter;
    private String registrationId;
    private String name;
    private long contactNumber;
    private String city;

    // Static block to initialize the counter
    static {
        counter = 10001; // Starting the counter from 10001
    }

    // Constructor
    public Participant(String name, long contactNumber, String city) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.city = city;
        this.registrationId = "D" + counter++;
    }

    // Getter for registrationId
    public String getRegistrationId() {
        return registrationId;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for contactNumber
    public long getContactNumber() {
        return contactNumber;
    }

    // Setter for contactNumber
    public void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }

    // Getter for city
    public String getCity() {
        return city;
    }

    // Setter for city
    public void setCity(String city) {
        this.city = city;
    }
}

public class dancereistration {
    public static void main(String[] args) {
        // Creating Participant objects
        Participant participant1 = new Participant("Alice", 9876543210L, "New York");
        Participant participant2 = new Participant("Bob", 9876543222L, "Los Angeles");

        // Displaying the details of the participants
        System.out.println("Participant 1: ");
        System.out.println("Registration ID: " + participant1.getRegistrationId());
        System.out.println("Name: " + participant1.getName());
        System.out.println("Contact Number: " + participant1.getContactNumber());
        System.out.println("City: " + participant1.getCity());

        System.out.println("\nParticipant 2: ");
        System.out.println("Registration ID: " + participant2.getRegistrationId());
        System.out.println("Name: " + participant2.getName());
        System.out.println("Contact Number: " + participant2.getContactNumber());
        System.out.println("City: " + participant2.getCity());
    }
}
