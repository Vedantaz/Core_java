public class Reverseeachwords {
    public static String reverseEachWord(String str) {
        // Implement your code here and change the return value accordingly
        StringBuilder reversedStr = new StringBuilder();
        StringBuilder word = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (Character.isWhitespace(c)) {
                reversedStr.append(word.reverse()).append(" ");
                word.setLength(0);
            } else {
                word.append(c);
            }
        }

        // Append the last reversed word
        reversedStr.append(word.reverse());

        return reversedStr.toString();
    }

    public static void main(String args[]) {
        String str = "all cows eat grass";
        System.out.println(reverseEachWord(str));
    }
}
