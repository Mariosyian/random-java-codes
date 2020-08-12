package mario.random.snippets;
/**
 * @author marios yiannakou.
 * 
 * Given a list of +ve ints and a +ve int 'k'
 * find two (not necessarily distinct) ints 'm' and 'n'
 * which make up the product of 'k' s.t. k = m * n
 */
public class FindProductInArray {
  
  private static final int[] LIST = {5, 24, 9, 5, 30, 6, 3, 12, 2, 10};
  private static final int K = 72;

  public static void main(String[] args) {
    
    boolean flag = false;
    for (int m : LIST) {
      for (int n : LIST) {
        if ( (m * n) == K ) {
          flag = true;
          System.out.println("Product of " + K + " are " + m + " * " + n);
        }
      }
    }
    
    if (!flag) {
      System.out.println("No matches were found!");
    }
  }
}