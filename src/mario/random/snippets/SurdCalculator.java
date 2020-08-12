/**
 * Surd calculator
 * @author marios yiannakou.
 * 
 * Exit Codes:
 * -1 - Error
 * 0 - Success
 * 1 - User has entered a negative number or erroneous input
 */
package mario.random.snippets;

import java.util.LinkedList;

public class SurdCalculator {

  private static LinkedList<Integer> primes = new LinkedList<Integer>();
  
  public static void main(String[] args) {
    if (args.length != 1) {
      System.err.println("Please enter exactly one integer.");
      System.exit(-1);
    }
    
    int root = 0;
    
    //  Validate input
    try {
      root = Integer.parseInt(args[0]);
      if (root < 0)
        throw new NumberFormatException();
    } catch (NumberFormatException e) {
      System.err.println(root + " is not a positive integer.");
      System.exit(1);
    } catch (Exception e) {
      System.err.println("Exception: " + e.getMessage());
      System.exit(1);
    }
    
    // Carry out the program
    switch (root) {
      case 0: // Case of 0 and 1 is the same so just display value passed
      case 1: System.out.println("Answer: " + root); System.exit(0);
      case 2: System.out.println("Answer: √" + 2); System.exit(0);
      default: getFactors(root);
    }
    
    System.exit(0);
  }
  
  /**
   * Breaks down integer passed into all factors.
   * Excluding 1 and itself.
   * @param num Number to break down.
   * @return Linked list of <num> factors.
   */
  public static void getFactors(int num) {
    LinkedList<Integer> factors = new LinkedList<Integer>();
    for (int divisor = 2; divisor < num; divisor ++) {
      if (num % divisor == 0) {
        System.out.print(divisor + ", ");
        factors.add(divisor);
      }
    }
    
    for (Integer factor : factors) {
      System.out.println("Checking number " + factor.intValue() + "...");
      if (!isPrime(factor.intValue())) {
        getFactors(factor.intValue());
      } else {
        if (!primes.contains(factor))
          primes.add(factor);
      }
    }
    
    System.out.println("Factors: " + factors);
    System.out.println("Primes: " + primes);
  }
  
  /**
   * Checks if number is prime.
   * @param num Number to check if prime.
   * @return True if prime, false otherwise.
   */
  public static boolean isPrime(int num) {
    for (int i = 2; i < num; i ++)
      if (num % i == 0)
        return false;
    return true;
  }
}


/**
 * Break down root into factors
 * Check each factor and break down if not prime
 * When all factors are prime, check that they are either prime, the number 2 or the number 1 (square numbers).
 *   If all are prime then multiply them and thats the answer (e.g. 15 = 3 * 5) else sqrt the prime and leave square numbers outside
 * Check the amount of times the number goes into that number ?? log????
 */