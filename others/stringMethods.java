import java.util.Scanner;
public class stringMethods {
    public static void main(String[] args) {
          //             012345 are the respective indexes.
        int g=9;
        String name = "  Vedant  ";
        String name1 = "Vedant";
        System.out.println(name);
        // all string methods
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.trim());
        System.out.println(name);
        System.out.println(name.substring(5));
        System.out.println(name.substring(0,5));
        System.out.println(name1.replace("Ved","Happy Ved"));
        System.out.println(name1.startsWith("Ved"));
        System.out.println(name1.endsWith("ant"));
        System.out.println(name1.charAt(2));        // character at
        System.out.println(name1.indexOf("ant"));   // index value starts from
        String name2 = "Vedantant";
        System.out.println(name2.indexOf("ant", 5)); // index value starts finding from given index
        System.out.println(name2.lastIndexOf("ant"));
        System.out.println(name2.lastIndexOf("rt"));
        System.out.println(name1.lastIndexOf("ant",3));     // 3 is the starting character from where searching starts.
        System.out.println(name1.equals("ant"));
        System.out.println(name1.equalsIgnoreCase("VEDANT"));
        System.out.println("I am escape sequence\tdouble quote");
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int n = sc.nextInt();
        int k = sc.nextInt();
    }
}