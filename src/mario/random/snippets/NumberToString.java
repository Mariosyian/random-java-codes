package mario.random.snippets;

/**
 * @author marios yiannakou
 * 
 * Write a program to convert a number to a string
 * e.g. 12345 = Twelve Thousand Three Hundred Forty Five
 * 
 * Range = 0 to 9billion
 */

public class NumberToString {

  private static String NUM = null;
  private static int INDEX = 0;
  private static String[] S = null;

  public static void main(String[] args) {
    
    // Nine billion One Hundred Twenty-Five Million Six Hundred Three Thousand Two hundred Four
    NUM = "9125603204";
    S = NUM.split("");
    
    for (INDEX = 0; INDEX < NUM.length(); INDEX ++) {
      // TODO: Handle zero
      System.out.print(getPositionPostfixAsString(S[INDEX], NUM.length() - INDEX) + " ");
    }
  }
  
  /**
   * Method to convert the basic digits 0-9 to strings
   * @param n - Number to convert
   * @return String representation of number passed
   */
  private static String getBaseNumberAsString(String n) {
    switch(n) {
      case "0": return "Zero";
      case "1": return "One";
      case "2": return "Two";
      case "3": return "Three";
      case "4": return "Four";
      case "5": return "Five";
      case "6": return "Six";
      case "7": return "Seven";
      case "8": return "Eight";
      case "9": return "Nine";
      default: System.exit(1);
    }
    
    return null;
  }
  
  /**
   * Method to return the number post fix depending on its position
   * e.g. position 1 = nothing, 2 = tens (number-ty), 3 = hundred, 4 = thousand etc
   * 
   * @param p - Position of number
   * @return String representation of position as postfix
   */
  private static String getPositionPostfixAsString(String d, int p) {
    String s = getBaseNumberAsString(d);
    switch (p) {
      case 1: return "";
      case 2: return getTens();
      case 3: s = s.concat(" Hundred"); break;
      case 4: s = s.concat(" Thousand"); break;
      case 5: return getThousands();
      case 6: s = s.concat(" Hundred ").concat(getThousands()).concat(" Thousand"); break;
      case 7: s = s.concat(" Million"); break;
      case 8: return getMillions();
      case 9: s = s.concat(" Hundred ").concat(getMillions()).concat(" Million"); break;
      case 10: s = s.concat(" Billion"); break;
      default: System.exit(1);
    }
    
    return s;
  }

  private static String getTens() {
    String s = null;
    switch (NUM.substring(NUM.length() - 2, NUM.length() - 1)) {
      case "0": s = getBaseNumberAsString(S[NUM.length() - 1]); break;
      case "1": s = getTenX(S[NUM.length() - 1]); break;
      case "2": s = "Twenty-" + getBaseNumberAsString(S[NUM.length() - 1]); break;
      case "3": s = "Thirty-" + getBaseNumberAsString(S[NUM.length() - 1]); break;
      case "4": s = "Fourty-" + getBaseNumberAsString(S[NUM.length() - 1]); break;
      case "5": s = "Fifty-" + getBaseNumberAsString(S[NUM.length() - 1]); break;
      case "6": s = "Sixty-" + getBaseNumberAsString(S[NUM.length() - 1]); break;
      case "7": s = "Seventy-" + getBaseNumberAsString(S[NUM.length() - 1]); break;
      case "8": s = "Eighty-" + getBaseNumberAsString(S[NUM.length() - 1]); break;
      case "9": s = "Ninety-" + getBaseNumberAsString(S[NUM.length() - 1]); break;
      default: System.exit(1);
    }

    INDEX += 2;
    return s;
  }

  private static String getThousands() {
    String s = null;
    switch (NUM.substring(NUM.length() - 5, NUM.length() - 4)) {
      case "0": s = getBaseNumberAsString(S[NUM.length() - 4]); break;
      case "1": s = getTenX(S[NUM.length() - 4]); break;
      case "2": s = "Twenty-" + getBaseNumberAsString(S[NUM.length() - 4]); break;
      case "3": s = "Thirty-" + getBaseNumberAsString(S[NUM.length() - 4]); break;
      case "4": s = "Fourty-" + getBaseNumberAsString(S[NUM.length() - 4]); break;
      case "5": s = "Fifty-" + getBaseNumberAsString(S[NUM.length() - 4]); break;
      case "6": s = "Sixty-" + getBaseNumberAsString(S[NUM.length() - 4]); break;
      case "7": s = "Seventy-" + getBaseNumberAsString(S[NUM.length() - 4]); break;
      case "8": s = "Eighty-" + getBaseNumberAsString(S[NUM.length() - 4]); break;
      case "9": s = "Ninety-" + getBaseNumberAsString(S[NUM.length() - 4]); break;
      default: System.exit(1);
    }

    INDEX += 2;
    return s;
  }

  private static String getMillions() {
    String s = null;
    switch (NUM.substring(NUM.length() - 8, NUM.length() - 7)) {
      case "0": s = getBaseNumberAsString(S[NUM.length() - 7]); break;
      case "1": s = getTenX(S[NUM.length() - 7]); break;
      case "2": s = "Twenty-" + getBaseNumberAsString(S[NUM.length() - 7]); break;
      case "3": s = "Thirty-" + getBaseNumberAsString(S[NUM.length() - 7]); break;
      case "4": s = "Fourty-" + getBaseNumberAsString(S[NUM.length() - 7]); break;
      case "5": s = "Fifty-" + getBaseNumberAsString(S[NUM.length() - 7]); break;
      case "6": s = "Sixty-" + getBaseNumberAsString(S[NUM.length() - 7]); break;
      case "7": s = "Seventy-" + getBaseNumberAsString(S[NUM.length() - 7]); break;
      case "8": s = "Eighty-" + getBaseNumberAsString(S[NUM.length() - 7]); break;
      case "9": s = "Ninety-" + getBaseNumberAsString(S[NUM.length() - 7]); break;
      default: System.exit(1);
    }

    INDEX += 2;
    return s;
  }

  private static String getTenX(String x) {
    switch(x) {
      case "0": return "Ten";
      case "1": return "Eleven";
      case "2": return "Twelve";
      case "3": return "Thirteen";
      case "4": return "Fourteen";
      case "5": return "Fifteen";
      case "6": return "Sixteen";
      case "7": return "Seventeen";
      case "8": return "Eighteen";
      case "9": return "Nineteen";
      default: System.exit(1);
    }

    return null;
  }
}
