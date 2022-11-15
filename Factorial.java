import java.util.Scanner;
/**
 * The function calculates the factorial(3! = 3 * 2 * 1).
 *
 * @author  Yiyun Qin
 * @version 1.0
 * @since 2022-11-13
 *
 */

class Factorial {
  static int calculate(int someInt) {
    // calculate the factorial using recursion
    if (someInt < 0) {
      return -1;
    } else {
      if (someInt == 1) {
        return 1;
      } else {
        return someInt * calculate(someInt - 1);
      }
    }
  }

  /**
   * The main function.
   *
   */

  public static void main(String[] args) {
    final String someIntString;

    Scanner myobj = new Scanner(System.in);
    System.out.print("Please enter the factorial: ");
    someIntString = myobj.next();

    System.out.println("");
    try {
      final int someInt = Integer.parseInt(someIntString);
      if (someInt == 0) {
        System.out.println("The factorial for 0! is 1");
      } else {
        System.out.println("The factorial for " + someInt + "! is "
                        + calculate(someInt));
      }
    } catch (Exception e) {
      System.out.println("Invalid number!");
    } finally {
      System.out.println("\nDone.");
    }
  }
}
  
