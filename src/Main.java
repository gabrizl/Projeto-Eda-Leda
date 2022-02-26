<<<<<<< HEAD
import java.text.ParseException;

import Console.Console;

public class Main {
  public static void main(String[] args) throws ParseException {

    Console console = new Console("listings_review_date.csv");
=======
import Console.Console;

public class Main {
  public static void main(String[] args) {
    
    Console console = new Console("listings.csv");
>>>>>>> a8926c86165acbcb9a41b8b1489536fdf3e91a4f
    console.menu();

  }
}
