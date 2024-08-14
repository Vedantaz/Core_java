import java.util.*;

class EOF {
  public static void main(String args[]) {


    Scanner sc = new Scanner(System.in);
    // /my answer code which is wrong
    // String str =sc.nextLine();
    // long c = str.lines().count();
    // String[] res = str.split("\n",c.parseInt() );

    // for (int i=0; i< c; i++){

    // System.out.print(i + " ");
    // System.out.print(res[i]);

    // }

    // code answer
    int line_number = 1;
    while (sc.hasNext()) {
      System.out.println(line_number + " " + sc.nextLine());
      line_number++;

    }
    sc.close();
  }
}
