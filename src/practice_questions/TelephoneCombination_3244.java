package practice_questions;

public class TelephoneCombination_3244 {
  private final int phoneNumberLength;
  private final int[] phoneNumber;
  private char[] result;
  public TelephoneCombination_3244(int[] phoneNumber) {
    this.phoneNumber = phoneNumber;
    phoneNumberLength = phoneNumber.length;
    result = new char[phoneNumberLength];
  }

  public void generateCombination(int currentDigit) {
    if (currentDigit == phoneNumberLength) {
      System.out.println(new String(result));
    } else {
      for (int i = 1; i <= 3; ++i) {
        result[currentDigit] = getCharKey(phoneNumber[currentDigit], i);
        generateCombination(currentDigit + 1);
      }
    }
  }

  private char getCharKey(int number, int i) {
    return 'A';
  }
}
