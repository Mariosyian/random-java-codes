package mario.random.snippets;
/** 
 * @author marios yiannakou.
 * 
 * Given a sequence of numbers from 1 to n, in ascending order,
 * one number in the sequence is missing and is replaced by a duplicate.
 * Assume sorted array!
 * Find the FIRST missing number and the FIRST duplicate pair.
 */
public class FindMe  {

  public static void main(String[] args) {
    
  // Ensure arguments have been given
  if (args.length == 0) {
    System.out.println("No arguments have been passed!");
    System.exit(-1);
  } else if (args.length == 1) {
    System.out.println("Please provide a sequence of numbers, not just one.");
    System.exit(-1);
  }
  
    // Create new array based on number of inputs
    int[] myArray = new int[args.length];
    
    // Fill array with standard input
    for (int i = 0; i < args.length; i ++)
      myArray[i] = Integer.parseInt(args[i]);
    
    findMe(myArray);
  }
  
  /**
   * Iterates through each number in the passed array once to
   * check for their difference. If it is more than one, then
   * the missing number has been found and is reported. Check
   * once again to find the duplicate number and report it.
   * 
   * @param myArray
   */
  public static void findMe(int[] myArray) {

    // Initialised to 0 since given that least possible num is 1.
    int x = 0;
    boolean found = false;
    
    // Check if the current elements are going  up by 1 else missing num found.
    //  4 --> 5 = +1
    //  4 --> 6 = +2 so num 5 missing
    for (int i = 0; i < myArray.length; i ++) {
      if (x + 1 != myArray[i] && !found) {
        System.out.println("Missing number: " + (x + 1));
        found = true;
        x ++;
        break;
      } else {
        x ++;
      }
    }
      
    // Search array for duplicate value
    for (int i = 0; i < myArray.length; i ++) {
      if (myArray[i] == myArray[i]) {
        System.out.println("Duplicate number: " + myArray[i]);
        break;
      }// if
    }
    
  }
}
