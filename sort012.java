//Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.

//https://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1

import java.util.Arrays;
public class sort012 {
  public static void main(String[] args) {
    int[] arr = {0,2,1,2,0};
    int length = arr.length;
    Arrays.sort(arr);
    for(int i=0; i<length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
