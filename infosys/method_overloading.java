class Point {
    private double xCoordinate;
    private double yCoordinate;

    public Point(double xCoordinate, double yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public double getxCoordinate() {
        return xCoordinate;
    }

    public void setxCoordinate(double xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public double getyCoordinate() {
        return yCoordinate;
    }

    public void setyCoordinate(double yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    public double calculateDistance(Point point) {
        return Math.sqrt(Math.pow(this.xCoordinate - point.getxCoordinate(), 2) +
                Math.pow(this.yCoordinate - point.getyCoordinate(), 2));
    }

    @Override
    public String toString() {
        return "Point\nxCoordinate: " + this.getxCoordinate() + "\nyCoordinate: " + this.getyCoordinate();
    }
}

class Triangle {
    // Implement your code here

    private Point point1;
    private Point point2;
    private Point point3;

    // Default constructor
    public Triangle() {
        this.point1 = new Point(0, 0);
        this.point2 = new Point(1, 1);
        this.point3 = new Point(2, 5);
    }

    // Constructor with individual coordinates
    public Triangle(double point1XCoordinate, double point1YCoordinate,
            double point2XCoordinate, double point2YCoordinate,
            double point3XCoordinate, double point3YCoordinate) {
        this.point1 = new Point(point1XCoordinate, point1YCoordinate);
        this.point2 = new Point(point2XCoordinate, point2YCoordinate);
        this.point3 = new Point(point3XCoordinate, point3YCoordinate);
    }

    public Triangle(Point point1, Point point2, Point point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    public double calculatePerimeter() {
        double a = point1.calculateDistance(point2);
        double b = point2.calculateDistance(point3);
        double c = point3.calculateDistance(point1);

        return Math.round((a + b + c) * 100.0) / 100.0;
    }

    public double calculateArea() {
        double a = point1.calculateDistance(point2);
        double b = point2.calculateDistance(point3);
        double c = point3.calculateDistance(point1);

        double s = (a + b + c) / 2; // Semi-perimeter
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return Math.round(area * 100.0) / 100.0;
    }

    @Override
    public String toString() {
        return "Triangle\n" + point1.toString() + "\n" + point2.toString() + "\n" + point3.toString();
    }
}

public class method_overloading {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle();
        Triangle triangle2 = new Triangle(1, 2, 6, 5, 5, 1);

        Point point1 = new Point(2, 1);
        Point point2 = new Point(4, 4);
        Point point3 = new Point(9, 1);

        Triangle triangle3 = new Triangle(point1, point2, point3);

        System.out.println("Perimeter of triangle1 is " + triangle1.calculatePerimeter());
        System.out.println("Area of triangle1 is " + triangle1.calculateArea());

        System.out.println("Perimeter of triangle2 is " + triangle2.calculatePerimeter());
        System.out.println("Area of triangle2 is " + triangle2.calculateArea());

        System.out.println("Perimeter of triangle3 is " + triangle3.calculatePerimeter());
        System.out.println("Area of triangle3 is " + triangle3.calculateArea());
    }
}