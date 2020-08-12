/**
 * @author marios yiannakou
 * 
 * Given a number, a linear starting point and a quadratic starting point,
 * calculate how many iterations it takes for the quadratic number
 * to become larger than the linear number.
 * 
 * Exit Codes:
 * -1 - Erroneous input
 * -2 - Wrong number of arguments
 */
public class QuadrOvertakeLinear {

  public static void main(String[] args) {

    if (args.length != 3) {
      System.err.println("Please provide exactly 3 arguments");
      System.exit(-2);
    }
    
    int num = 0;
    int LINEAR = 0;
    int QUADRATIC = 0;
    
    try {
      num = Integer.parseInt(args[0]);
      LINEAR = Integer.parseInt(args[1]);
      QUADRATIC = Integer.parseInt(args[2]);      
    } catch (Exception e) {
      System.err.println("FATAL ERROR: " + e.getMessage());
      System.exit(-1);
    }
    
    int q = 0;
    int l = 0;
    int counter = 0;
    
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
