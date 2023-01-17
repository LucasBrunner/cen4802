/**
 * Fibonacchi
 */
public class Fibonacchi {

  public static int fibonacchi(int sequenceNum, int n1, int n2) {
    if (sequenceNum > 0) {
      return fibonacchi(sequenceNum - 1, n2, n1 + n2);
    }
    return n1;
  }

  public static int fibonacchi(int sequenceNum) {
    return fibonacchi(sequenceNum, 0, 1);
  }

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
