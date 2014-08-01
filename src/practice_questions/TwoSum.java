package practice_questions;

import java.util.HashMap;

public class TwoSum {
  public static void main(String[] args) {
    int[] input = new int[]{0, 3, 8, 4, -20, -11, 1, 2, 3, 7};
    findTwoSum(10, input);
  }

  public static void findTwoSum(int target, int[] input) {
    // Map between target value and original source index.
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

    for (int i = 0; i < input.length; i++) {
      if (map.containsKey(input[i])) {
        System.out.println(input[i]);
        System.out.println(input[map.get(input[i])]);
        return;
      } else {
        map.put(target - input[i], i);
      }
    }
  }
}