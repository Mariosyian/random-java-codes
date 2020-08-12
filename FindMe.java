/** 
 * @author marios yiannakou
 * 
 * Given a sequence of numbers from 1 to n, in ascending order,
 * one number in the sequence is missing and is replaced by a duplicate.
 * Assume sorted array!
 * Find the first missing number and the first duplicate pair.
 */
public class FindMe  {

  public static void main(String[] args) {
    if (args.length == 0) {
      System.out.println("No arguments have been passed!");
      System.exit(-1);
    } else if (args.length == 1) {
      System.out.println("Please provide a sequence of numbers, not just one.");
      System.exit(-1);
    }

    int[] myArray = new int[args.length];
    for (int i = 0; i < args.length; i ++) {
      myArray[i] = Integer.parseInt(args[i]);
    }
    
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
    // Initialised to 0 since given smallest possible num is 1.
    int x = 0;
    boolean found = false;

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
    
    for (int i = 0; i < myArray.length; i ++) {
      if (myArray[i] == myArray[i]) {
        System.out.println("Duplicate number: " + myArray[i]);
        break;
      }
    }
  }
}
