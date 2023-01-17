/**
 * Fibonacchi
 */
public class Fibonacchi {

  /**
   * Calculates the Fibonacchi Sequence to a certain position, starting with n1 and n2. 
   * <p>
   * Uses a recursive algorithm.
   * 
   * @param sequenceNum the position in the sequence which will be returned. The n1 and n2 are the 0th and 1st numbers.
   * @param n1 the first initial number 
   * @param n2 the second initial number
   * @return the specified number in the Fibonacchi sequence
   */
  public static int fibonacchi(int sequenceNum, int n1, int n2) {
    if (sequenceNum > 0) {
      return fibonacchi(sequenceNum - 1, n2, n1 + n2);
    }
    return n1;
  }

  /**
   * Calculates the Fibonacchi Sequence to a certain position, starting with 0 and 1. 
   * <p>
   * Uses a recursive algorithm.
   * 
   * @author Lucas Brunner 
   * @param sequenceNum The position in the sequence which will be returned. The 0 and 1 are the 0th and 1st numbers.
   * @return the specified number in the Fibonacchi sequence
   */
  public static int fibonacchi(int sequenceNum) {
    return fibonacchi(sequenceNum, 0, 1);
  }

  /**
   * Returns an Integer as a string with the correct ordinal indicator appended.
   * @author Lucas Brunner 
   */
  // Do paramaters and return values really always need to be documented? 
  public static String ordinalIndicated(Integer number) {
    String numberString = number.toString();

    String ordinalIndicator = "th";
    if (numberString.length() <= 1 || numberString.charAt(numberString.length() - 2) != '1' || numberString.charAt(numberString.length() - 2) == '-') {
      switch (numberString.charAt(numberString.length() - 1)) {
        case '1':
          ordinalIndicator = "st";
          break;
        case '2':
          ordinalIndicator = "nd";
          break;
        case '3':
          ordinalIndicator = "rd";
          break;
      
        default:
          ordinalIndicator = "th";
          break;
      }
    }
    return numberString + ordinalIndicator;
  }

  public static void main(String[] args) {
    int sequenceNum = 10;
    int fibonacchiResult = fibonacchi(sequenceNum);
    System.out.printf("The %s number of the Fibonacchi Sequence is %d", ordinalIndicated(sequenceNum), fibonacchiResult);
  }
}
