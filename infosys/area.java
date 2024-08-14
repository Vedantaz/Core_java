package classes_codes;

class Rectangle {
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double calculateArea() {
        double area = length * breadth;
        return Math.round(area * 100.0) / 100.0;
    }

    public double calculatePerimeter() {
        double perimeter = 2 * (length + breadth);
        return Math.round(perimeter * 100.0) / 100.0;
    }
}


public class area {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5.2, 3.7);

        double area = rectangle.calculateArea();
        double perimeter = rectangle.calculatePerimeter();

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);

    }
}
