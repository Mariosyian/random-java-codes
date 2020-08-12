/**
 * @author marios yiannakou
 * 
 * Purpose of the program is to find when the fathers age will be
 * twice the sons age by incrementing both the ages and then
 * dividing by two and comparing the dads age to the sons age. 
 * 
 * Program accepts EXACTLY two arguments.
 * The first argument is the sons current age and
 * the second argument is the dads current age.
 * 
 * Exit Codes:
 * -1 - Wrong number of arguments
 * -2 - Erroneous input
 */
public class FindSonAge {

  public static void main(String[] args) {
    if (args.length != 2) {  
      System.out.println("Need exactly two arguments, son's age and father's age respectively.");
      System.exit(-1);
    }

    int sonAge = 0;
    int dadAge = 0;

    try {
      sonAge = Integer.parseInt(args[0]);
      dadAge = Integer.parseInt(args[1]);
    } catch (Exception e) {
      System.err.println("Error: " + e.getMessage());
      System.exit(-2);
    }

    if (sonAge <= 0 || dadAge <= 0) {  
      System.out.println("Age must be positive.");
      System.exit(-2);
    } else if (sonAge >= dadAge) {
      System.out.println("Sons age must be less than dads age.");
      System.exit(-2);
    }

    int iterations = 0;

    while (true) {
      sonAge ++;
      dadAge ++;
      iterations ++;
      if (dadAge == 2 * sonAge) {
        System.out.println("Son age: " + sonAge);
        System.out.println("Dad age: " + dadAge);
        System.out.println("Years Passed: " + iterations);
        break;
      }
    }
  }
}
