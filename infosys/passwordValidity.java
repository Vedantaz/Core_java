public class passwordValidity {
    public static boolean checkPasswordValidity(String password) {
        String pattern = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&*_])[a-zA-Z\\d@#$%^&*_]{8,20}$";

        return password.matches(pattern);
    }

    public static void main(String[] args) {

        // Change the value of password for testing your code with different passwords
        String password = "P@$sW0rd";
        System.out.println("The password is " + (checkPasswordValidity(password) ? "valid!" : "invalid!"));
    }

}
