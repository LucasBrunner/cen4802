/**
 * Fibonacchi
 */
public class Fibonacchi {

  /**
   * Calculates the Fibonacchi Sequence to a certain position, starting with 0 and 1.
   * @param timeToLive
   * @param n1
   * @param n2
   * @return
   */
  public static int fibonacchi(int timeToLive, int n1, int n2) {
    if (timeToLive > 0) {
      return fibonacchi(timeToLive - 1, n2, n1 + n2);
    }
    return n1;
  }

  /**
   * Calculates the Fibonacchi Sequence to a certain position, starting with 0 and 1.
   * @author Lucas Brunner 
   * @param sequenceNum The position in the sequence which will be returned. The initial 0 and 1 are the 0th and 1st numbers.
   * @return
   */
  public static int fibonacchi(int sequenceNum) {
    return fibonacchi(sequenceNum, 0, 1);
  }

  /**
   * Returns an Integer as a string with the correct ordinal indicator appended.
   * @author Lucas Brunner 
   */
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
