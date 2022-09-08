// O(N) time complexity

// https://www.geeksforgeeks.org/write-a-program-to-reverse-an-array-or-string/

// Write a program to reverse an array or string

public class reverseAnArrayOrString {
  
  static void reverse(int[] arr, int n) {
    int start = 0;
    int end = n;
    while(start < end) {
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
  }

  static void printArray(int[] arr, int n) {
    for(int i=0; i<n; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }
  public static void main(String[] args) {
    int[] arr = {1,2,3,4,5,6};
    System.out.println("Original array is:");
    printArray(arr, 6);
    reverse(arr, 5);
    System.out.println("Reversed array is:");
    printArray(arr, 6);
  }
}