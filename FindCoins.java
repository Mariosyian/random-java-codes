/**
 * @author marios yiannakou
 * 
 * Program takes exactly one argument as an integer which is treated as the
 * total amount of money the user is trying to resolve the minimum amount
 * of coins required to sum up to.
 * Available coins include: 200, 100, 50, 20, 10, 5, 2, 1
 */
public class FindCoins {
  
  public static void main(String[] args) {
    if (args.length != 1) {
      System.out.println("Please enter the total amount of coins to calculate.");
      System.exit(-1);
    }
  
    int totalAmount = 0;
    try {
      totalAmount = Integer.parseInt(args[0]);
    } catch (Exception e) {
      System.err.println("Error: " + e.getMessage());
      System.out.println("System will now exit...");
      System.exit(-1);
    }
    
    if (totalAmount < 0) {
      totalAmount *= -1;
      System.out.println("Negative number detected! Converted to positive.");
    }
    
    // Available coins
    int[] coins = { 200, 100, 50, 20, 10, 5, 2, 1 };
    int remainder = 0;
    
    /*
     * Use each coin, starting from the largest value to calculate maximum
     * amount of times that coin value goes into the total and subtracts
     * this from total into a remainder Integer.
     * This is then used to calculate the rest of the coins in the same way.
     */
    System.out.println("Total amount: " + totalAmount);
    for (int coin : coins) {
      remainder = totalAmount % coin;
      System.out.println("Amount of " + coin + " coins: " + totalAmount / coin);
      totalAmount = remainder;
    }
  }
}
