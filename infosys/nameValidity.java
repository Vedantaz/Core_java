public class nameValidity {
    public static boolean checkNameValidity(String name) {
        String pattern = "^[A-Z][a-zA-Z]+( [A-Z][a-zA-Z]+)*$";
        return name.matches(pattern);
    }

    public static void main(String[] args) {

        String name = "Roger Federer";
        System.out.println("The name is " + (checkNameValidity(name) ? "valid!" : "invalid!"));
    }
}
