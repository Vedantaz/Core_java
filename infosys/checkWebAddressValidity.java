public class checkWebAddressValidity {
    public static boolean checkWebAddressValidity(String webAddress) {
        String pattern = "^(http|https)://+(www\\.)?([a-zA-Z0-9]+\\.)+[com|org|net]$";

        // Check if the web address matches the pattern
        return webAddress.matches(pattern);
    }

    public static void main(String[] args) {

        // Change the value of webAddress for testing your code with different web
        // addresses
        String webAddress = "http://www.company.com";
        System.out.println("The web address is " + (checkWebAddressValidity(webAddress) ? "valid!" : "invalid!"));
    }
}
