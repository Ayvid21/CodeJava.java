public class maxMinOfArray {
  static int minMaxOfArray(int[] arr) {
    int max;

    if(arr.length == 1) {
      return max = arr[0];
    }

    if(arr[0] > arr [1]) {
      return max = arr[0];
    }
    else {
      return max = arr[1];
    }

    // for(int i=2; i<arr.length-1; i++) {
      // if(arr[i] > max) {
        // max = arr[i];
        
      // }
    // }
    // return -1;
  }
  // static int minOfArray(int[] arr){

  // }
  public static void main(String[] args) {
      int[] arr = {1000, 11, 445, 1, 330, 3000};

      System.out.println(minMaxOfArray(arr));
      // System.out.println(minOfArray(arr));
    }
}
