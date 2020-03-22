/**
 * @author marios yiannakou.
 * 
 * Given a number, a linear starting point and a quadratic starting point,
 * calculate how many iterations it takes for the quadratic number
 * to become larger than the linear number.
 */
package mario.random.find;

public class QuadrOvertakeLinear {

  /**
   * Exit Codes
   * -2: Incorrect number of arguments
   * -1: Fatal exception
   */
  public static void main(String[] args) {

    if (args.length != 3) {
      System.err.println("Please provide exactly 3 arguments");
      System.exit(-2);
    }
    
    int num, LINEAR, QUADRATIC;
    num = LINEAR = QUADRATIC = 0;
    
    try {
      num = Integer.parseInt(args[0]);
      LINEAR = Integer.parseInt(args[1]);
      QUADRATIC = Integer.parseInt(args[2]);      
    } catch (Exception e) {
      System.err.println("Fatal exception caught: " + e.getMessage());
    }
    
    int q,l,counter = 0;
    
    while(true) {
      l = LINEAR * num;
      q = (QUADRATIC * QUADRATIC) * num;
      
      if (q == l) {
        System.out.println("Equal.");
        break;
      } else if (q > l) {
        System.out.print("Quadratic surpassed linear after ");
        break;
      }
      
      QUADRATIC ++;
      LINEAR ++;
      counter ++;
    }
    System.out.println(counter + " iterations.");
    System.out.println("Linear value: " + l);
    System.out.println("Quadratic value: " + q);
  }
}
