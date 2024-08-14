package practise_inheritence;

import java.lang.reflect.Constructor;

class circle {
    // Constructor
    circle(int r) {
        this.radius = r;
    }

    public int radius;

    public float area() {
        return (float) (Math.PI * this.radius * this.radius);
    }
}


class cylinder extends circle {
    public int height;

    cylinder(int r, int h) {
        super(r);
        this.height = h;
        System.out.println("I am cylinder parameterized constructor.");

    };

    public float cylinderArea() {
        return (float) (Math.PI * this.radius * this.height);
    }

    public double volume() {
        return Math.PI * this.radius * this.radius * this.height;
    }
}


public class file1 {
    public static void main(String[] args) {
        System.out.println("hey");
        circle c2 = new circle(2);
        cylinder c1 = new cylinder(2, 4);
        System.out.println(c1 + " " + c2);

    }

}
