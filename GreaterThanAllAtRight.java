/**
 * @author marios yiannakou
 * 
 * Given an array of n elements, write a program to
 * print out the elements that are greater than all
 * other elements to its right.
 * 
 * e.g. Given:  16, 17, 4, 3, 5, 2 
 *      Output: 17, 5, 2
 * 
 * Exit Codes:
 * -1 - Wrong number of arguments
 * -2 - Erroneous input
 */
public class GreaterThanAllAtRight {
  public static void main(String[] args){
    if (args.length == 0) {
      System.out.println("No arguments have been passed!");
      System.exit(-1);
    }
    
    int[] nums = new int[args.length];
    int index = 0;  // Keep track of which element we finished off at
     
    try {
      for (String arg : args) {
        nums[index] = Integer.parseInt(arg);
        index ++;
      }
    } catch (Exception e) {
      System.err.println("Fatal error caught: " + e.getMessage());
      System.exit(-2);
    }
    
    boolean flag = false;
    System.out.print("Answer: ");
    for (int i = 0; i < nums.length; i ++) {
      for (int j = i + 1; j < nums.length; j ++) {
        index = i;
        // If smaller than any then do not print
        if (nums[i] < nums[j]) {
          flag = false;
          break;
        } else {
          flag = true;
        }
      }
      // Only print if greater than all to its right
      if (flag) {
        System.out.print(nums[index] + " ");
        flag = false; // Reset flag for next iteration
      }
    }

    // Always print last array element as no other to compare to.
    System.out.println(nums[nums.length - 1]);
  }
}
