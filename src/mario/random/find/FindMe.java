package mario.random.find;
/** 
 * Given a sequence of numbers from 1 to n.
 * One number in the sequence is missing and is replaced by a duplicate.
 * Assume sorted array!
 * Find the FIRST missing number and the FIRST duplicate pair.
 */
public class FindMe
{
  public static void main(String[] args) {
    //Create new array based on number of inputs
    int[] myArray = new int[args.length];
    
    //Fill array with standard input
    for (int i = 0; i < args.length; i ++)
      myArray[i] = Integer.parseInt(args[i]);
    
    findMe(myArray);
  }
  
  public static void findMe(int[] myArray) {
    //Integer to hold current number and check for + 1 to find missing num.
    //Initialised to 0 since given that least possible num is 1.
    int x = 0;
    boolean found = false;
    
    //Create duplicate array and each time iterate all elements to check
    //for the duplicate number.
    int[] dupArray = myArray;
    boolean duplicate = false;
    
    //Check if the current elements are going  up by 1 else missing num found.
    // 4 --> 5 = +1
    // 4 --> 6 = +2 so num 5 missing
    for (int i = 0; i < myArray.length; i ++) {
      //Holds current element to search for duplicate
      int currentElement = myArray[i];
      if (x + 1 != myArray[i] && !found) {
        System.out.println("Missing number: " + (x + 1));
        found = true;
        x ++;
      } else {
        x ++;
      }
      
      //Search array from current element onwards
      for (int index = x; index < dupArray.length; index ++) {
        if (currentElement == dupArray[index] && !duplicate) {
          System.out.println("Duplicate number: " + currentElement);
          duplicate = true;
        }//if
      }
    }
    
  }
}
