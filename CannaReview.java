
/**
 *
 *
 * @Alan Sato
 * @v1.1
 *
 *
 * NOTES:
 *
 */
import java.util.*;
public class CannaReview
{
    //*** fields (if any)
    double vnum = 1.1;
    boolean order;
    boolean redit;
    boolean dnma;
    private  static Scanner keyb = new Scanner( System.in ); //Keyboard Scanner
    //*** methods
    /**
     * Performs main action for this class.
     * (Called automatically by Java.)
     */

    public void main(String [] args)
    {


      System.out.println("Hello");
      System.out.println("Welcome to CannaReview v" + vnum);
      System.out.println("I am Canna the Cannabis Review Bot");
      System.out.println("I will help you review your cannabis.");
      System.out.println("I will be asked you a series of questions to help give your vendor and cannabis a score.");
      System.out.println("First, I will ask some preliminary questions about the review");
      System.out.println("Did you order your flower online? (type y/n): ");
      String onl = keyb.next();
      if (onl == "y"){
        order = true;
      }
      else{
        order = false;
      }
      System.out.println("Would you like to have a review generated for Reddit, DNMAvengers, or Both?\n (Answer 'reddit', 'dnm', 'both' or 'neither'): ");
      String rev2 = keyb.next();
      if (rev2 == "both"){
        redit = true;
        dnma = true;
      }
      else if (rev2 == "reddit"){
        redit = true;
        dnma = false;
      }
      else if (rev2 == "dnm"){
        dnma = true;
        redit = false;
      }
      else if (rev2 == "neither"){
        dnma = false;
        redit = false;
      }

    } // end main() method
} // end class
