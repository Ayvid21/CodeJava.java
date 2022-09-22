public class maxMinNumber {

  static int maxNumber(int[] array) {
    if(array.length == 0) {
      return -1;
    }

    int ans = array[0];
    for(int i = 1; i<array.length; i++) {
      if(array[i] > ans) {
        ans = array[i];
      }
    }
    return ans;
  }

  static int minNumber(int[] array) {
    if(array.length == 0) {
      return -1;
    }

    int ans = array[0];
    for(int i = 1; i<array.length; i++) {
      if(array[i] < ans) {
        ans = array[i];
      }
    }
    return ans;
  }
  public static void main(String[] args) {
    int[] array = {29, 85, 39, 76, 30, 25, 64};
    System.out.println("Max number in the array is: " + maxNumber(array));
    System.out.println("Min number in the array is: " + minNumber(array));
  }
}
