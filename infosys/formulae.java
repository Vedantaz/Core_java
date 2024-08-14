public class formulae {
    public static void main(String[] args) {
        int a = 1, b = 4, c = 6;
        int val = (b * b) - (4 * a * c);
        int roota = (-b + (val) * 2 * a);
        int rootb = (-b - (val) * 2 * a);
        if (val == 0) {
            System.out.println(roota);
        }
        else if (val > 0) {
            System.out.println(roota + " " + rootb);
        }
        else
            System.out.println(" The equation has no real roots");
    }

}
