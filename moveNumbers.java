// Move all negative numbers to beginning and positive to end with constant extra space

// An array contains both positive and negative numbers in random order. Rearrange the array elements so that all negative numbers appear before all positive numbers.

// https://www.geeksforgeeks.org/move-negative-numbers-beginning-positive-end-constant-extra-space/

import java.util.*;

public class moveNumbers {
  static void move(int[] arr) {
    Arrays.sort(arr);
  }
  public static void main(String[] args) {
    int[] arr = {-12, -13, -5, 6, -7, 11, 5, -3, -6};
    int length = arr.length-1;
    move(arr);
    for(int i=0; i<=length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
