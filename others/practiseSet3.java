public class practiseSet3{
    public static void main(String[] args){
    //  Problem 1
    String name = "Jack Parker";
    name = name.toLowerCase();
    System.out.println(name);

    // Problem 2
    String text = "to upper case";
    text = text.replace(" ", "_");
    // Problem 3
    String letter = "Dear <|name|>, Thanks a lot! ";
    letter = letter.replace("<|name|>", "Vedant");
    System.out.println(letter);
    // Problem 4
    String mys= "This string contains           double or tirple spaces";
    System.out.println(mys.indexOf("  "));
    System.out.println(mys.indexOf("             "));
    // Problem 5
    String myletter = "Dear Ved, \n\tThanks for this Techy News!\n\t";
    System.out.println(myletter);

    
    

    }
}