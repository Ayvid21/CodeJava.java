// O(N) time complexity

// https://www.geeksforgeeks.org/maximum-and-minimum-in-an-array/

// Maximum and minimum of an array using minimum number of comparisons

public class maxAndMinOfArray {

  static class Pair {
    int min;
    int max;
  }

  static Pair getMinMax(int[] arr, int n) {
    Pair minmax = new Pair();
    int i;

    // if only one element is present in an array
    if(n == 1) {
      minmax.max = arr[0];
      minmax.min = arr[0];
      return minmax;
    }

    // if more than one elements are present
    if(arr[0] > arr[1]) {
      minmax.max = arr[0];
      minmax.min = arr[1];
    }
    else {
      minmax.max = arr[1];
      minmax.min = arr[0];
    }

    for(i=2; i<n; i++) {
      if(arr[i] > minmax.max) {
        minmax.max = arr[i];
      }
       else if(arr[i] < minmax.min) {
        minmax.min = arr[i];
       }
    }
    return minmax;
  }
  public static void main(String[] args) {
    int[] arr = {1000, 11, 445, 1, 330, 3000};
    int arrSize = 6;
    Pair minmax = getMinMax(arr, arrSize);
    System.out.println("Minimum element is " + minmax.min);
    System.out.println("Maximum element is " + minmax.max);
  }
}
