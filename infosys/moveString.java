
public class moveString {
    public static String move(String str) {
        StringBuilder alphanumeric = new StringBuilder();
        StringBuilder specialCharacters = new StringBuilder();

        // Iterate through the string
        for (char ch : str.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                alphanumeric.append(ch); // Add to alphanumeric StringBuilder
            } else {
                specialCharacters.append(ch); // Add to special characters StringBuilder
            }
        }
        return alphanumeric.append(specialCharacters).toString();
    }

    public static void main(String args[]) {
        String str = "123456#$@%#12345";
        String modifiedStr = move(str);
        System.out.println("Modified string: " + modifiedStr);

    }
}
