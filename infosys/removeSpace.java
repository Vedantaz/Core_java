
public class removeSpace {
    public static String removeWhiteSpaces(String str) {
        // Implement your code here and change the return value accordingly
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isWhitespace(str.charAt(i)))
                res.append(str.charAt(i));
        }
        return res.toString();
    }

    public static void main(String args[]) {
        String str = "Hello   How are you   ";
        String ns = removeWhiteSpaces(str);
        System.out.println(ns);
    }
}
