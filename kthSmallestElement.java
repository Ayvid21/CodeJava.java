// O(N) time complexity

// https://practice.geeksforgeeks.org/problems/kth-smallest-element5635/1

// Given an array arr[] and an integer K where K is smaller than size of array, the task is to find the Kth smallest element in the given array. It is given that all array elements are distinct.
import java.util.*;
public class kthSmallestElement {

  static int smallestElement(int[]arr, int k) {
    Arrays.sort(arr);
    for(int i=0; i<=k; i++) {
      if(i == k) {
        return arr[i-1];
      }
    }
    return 0;
  }
  public static void main(String[] args) {
    int[] arr = {6, 5, 4, 3, 2, 1}; 
    // 3 4 7 10 15 20
    int k = 5;
    System.out.println(smallestElement(arr, k));   
  }
}
