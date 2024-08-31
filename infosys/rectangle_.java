class Rectangle {
    // Implement your code here
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;

    }

    public double calculateArea() {
        double area = length * width;
        return Math.round(area * 100.0) / 100.0;
    }

    public double calculatePerimeter() {
        double perimeter = 2 * (length + width);
        return Math.round(perimeter * 100.0) / 100.0;
    }
}

public class rectangle_ {

    public static void main(String args[]) {

        Rectangle rectangle = new Rectangle(5.2, 3.7);
        double area = rectangle.calculateArea();
        double perimeter = rectangle.calculatePerimeter();

        System.out.println("Area of the rectangle is: " + area);
        System.out.println("Perimeter of the rectangle is: " + perimeter);

    }

}