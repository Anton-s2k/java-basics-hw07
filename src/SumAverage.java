/**
 * Compute the sum and average for running integers using loop.
 */
public class SumAverage {
  public static int digitCount;
  public static int sum;
  public static double average;


  /**
   * Computes sum of running integers from a lower bound to an upper bound.
   *
   * @param lowerBound lower bound
   * @param upperBound upper bound
   * @return sum of integers
   */
  public static int sum(int lowerBound, int upperBound) {
    // TODO fill in code here using for loop and replace the return statement
    int[] arr = {lowerBound,upperBound};
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      if (lowerBound <= upperBound) {sum += arr[i];}}
    System.out.println("Sum = " + sum);
    return sum;
  }

  /**
   * Computes sum of running integers from a lower bound to an upper bound within an array.
   *
   * @param numbers running integers array
   * @return sum of integers
   */
  public static int sum(int[] numbers) {
    // TODO fill in code here using for each loop and replace the return statement
    digitCount = 0;
    digitCount++;
    return digitCount;
  }

  /**
   * Computes average of running integers from a lower bound to an upper bound.
   *
   * @param lowerBound lower bound
   * @param upperBound upper bound
   * @return average of integers
   */

  public static double average(int lowerBound, int upperBound) {
    // TODO fill in code here using while loop and replace the return statement
    if (digitCount != 0) {
      average = (sum / digitCount);
    }
    return average;
  }

  /**
   * Computes average of running integers from a lower bound to an upper bound within an array.
   *
   * @param numbers running integers array
   * @return average of integers
   */
  public static double average(int[] numbers) {
    // TODO fill in code here using do-while loop and replace the return statement
    return 0;
  }
}
