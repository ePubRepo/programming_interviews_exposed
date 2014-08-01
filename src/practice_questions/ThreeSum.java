package practice_questions;

import java.util.Arrays;

public class ThreeSum {
  public static void main(String[] args) {
    int[] ints = new int[]{0, 3, 20, 15, -10};
    computeThreeSum(10, ints);
  }

  public static void computeThreeSum(int targetSum,
                                     int[] inputInts) {
    Arrays.sort(inputInts);

    for (int i = 0; i < inputInts.length; i++) {
      int n = i + 1;
      int j = inputInts.length - 1;

      while (n < j) {
        int sum = inputInts[i] + inputInts[j] + inputInts[n];
        if (sum == targetSum) {
          System.out.println("Match: " + inputInts[i] + ", " + inputInts[j] + ", " + inputInts[n]);
          return;
        } else if (sum < targetSum) {
          n++;
        } else if (sum > targetSum) {
          j--;
        }
      }
    }
    System.out.println("No solution");
  }
}