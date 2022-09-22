// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class findingEvenNumberOfDigits {
  // counting total number of digits in a number
  static int digits(int num) {
    int count = 0;
    while(num > 0) {
      count++;
      num = num / 10;
    }
    return count;
  }

   // checking whether a number containd even digits or not
  static boolean even(int num) {
    int numberOfDigits = digits(num);
    if(numberOfDigits % 2 == 0) {
      return true;
    }
    return false;
  }
  static int findNumbers(int[] arr) {
    int count = 0;
    for(int i : arr) {
      if(even(i)) {
        count++;
      }
    }
    return count;
  }
  public static void main(String[] args) {
    int[] arr = {1,901,4282,771};
    System.out.println(findNumbers(arr));
  }
}
