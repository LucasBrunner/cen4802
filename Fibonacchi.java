/**
 * Fibonacchi
 */
public class Fibonacchi {

  public static int fibonacchi(int depth, int n1, int n2) {
    if (depth <= 1) {
      return n1 + n2;
    }
    return fibonacchi(depth - 1, n2, n1 + n2);
  }

  public static int fibonacchi(int sequenceNum) {
    return fibonacchi(sequenceNum - 1, 0, 1);
  }

  public static String ordinalIndicated(int number) {
    String numberString = ((Integer)number).toString();

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
