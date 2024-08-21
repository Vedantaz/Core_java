class Author {
    // Implement your code here
    private String name;
    private String emailID;
    private char gender;

    public Author(String name, String emailID, char gender) {
        this.name = name;
        this.emailID = emailID;
        this.gender = gender;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    // Display Author details
    public void displayAuthorDetails() {
        System.out.println("Author Name: " + name);
        System.out.println("Author Email ID: " + emailID);
        System.out.println("Author Gender: " + gender);
    }
}

class Book {
    // Implement your code here
    private String name;
    private Author author;
    private double price;
    private int quantity;

    public Book(String name, Author author, double price, int quantity) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void displayBookDetails() {
        System.out.println("Book Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Author Details:");
        author.displayAuthorDetails();
    }

}

class book_author {
    public static void main(String[] args) {
        // Implement your code here
        Author author = new Author("J.K. Rowling", "jk.rowling@example.com", 'F');

        // Creating a Book object
        Book book = new Book("Harry Potter", author, 29.99, 100);

        // Displaying book details
        book.displayBookDetails();

        // Modifying book and author details
        book.setPrice(34.99);
        book.setQuantity(150);
        author.setEmailID("rowling.jk@newemail.com");
        System.out.println("\nUpdated Book Details:");
        book.displayBookDetails();

    }
}
