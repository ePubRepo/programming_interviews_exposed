package practice_questions;

public class Permutations_3096 {
  public static void permuteString(String toPermute) {
    generatePermutations("", toPermute);
  }

  public static void generatePermutations(String prefix, String remain) {
    if (remain.length() == 0) {
      System.out.println(prefix);
    } else {
      for (int i = 0; i < remain.length(); i++) {
        generatePermutations(prefix + remain.charAt(i),
            remain.substring(0, i) + remain.substring(i+1, remain.length()));
      }
    }
  }
}
