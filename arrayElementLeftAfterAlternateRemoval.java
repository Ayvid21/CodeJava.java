// Given an array Arr of length N, it is reduced by 1 element at each step. Maximum and Minimum elements will be removed in alternating order from the remaining array until a single element is remaining in the array. The task is to find the remaining element in the given array.

// Examples:

// Input: arr[] = {1, 5, 4, 2}
// Output: 2
// Explanation: 
// Remove Max element i.e., 5 arr[] = {1, 4, 2}
// Remove Min element i.e., 1 arr[] = {4, 2}
// Remove Max element i.e., 4 arr[] = {2}

// Input: arr[] = {5, 10}
// Output: 5

// Approach:

// Follow the below idea to solve the problem:

// The idea is to sort the array and return the middle element as all of the right and left elements will be removed in the process.
import java.util.*;

public class arrayElementLeftAfterAlternateRemoval {
  public static int remainingElement(int[] arr) {
    Arrays.sort(arr);
    int length = arr.length;
    int mid = length/2;
    return mid;
  }
  public static void main(String[] args) {
    int[] arr = {1,5,4,2};
    System.out.println(remainingElement(arr));
    
  }
}
