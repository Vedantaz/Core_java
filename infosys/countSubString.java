public class countSubString {

    public static int countSubstring(String inputString, String substring) {
        return countSubstringHelper(inputString, substring, 0);
    }

    private static int countSubstringHelper(String inputString, String substring, int startIndex) {
        int index = inputString.indexOf(substring, startIndex);
        if (index == -1) {
            return 0;
        } else {
            return 1 + countSubstringHelper(inputString, substring, index + substring.length());
        }
    }

    public static void main(String args[]) {
        int count = countSubstring(
                "I felt happy because I saw the others were Happy and because I knew I should feel happy, but I was not really happy",
                "happy");
        System.out.println(count);
    }
}
