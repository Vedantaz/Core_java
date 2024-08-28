
public class moveSpecialCharacters {

    public static String moveSpecialCharacters(String str) {
        // Implement your code here and change the return value accordingly
        StringBuilder normalChars = new StringBuilder();
        StringBuilder specialChars = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                normalChars.append(c);
            } else {
                specialChars.append(c);
            }
        }

        return normalChars.toString() + specialChars.toString();
    }

    public static void main(String args[]) {

        String str = "He@#$llo!*&";
        System.out.println(moveSpecialCharacters(str));
    }

}