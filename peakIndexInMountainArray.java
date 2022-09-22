

// https://leetcode.com/problems/find-peak-element/
// time complexity O(logn)
// space complexity O(1)
public class peakIndexInMountainArray {
  static int peakIndex(int[] arr) {
    int start = 0;
    int end = arr.length-1;

    while(start < end) {
      int mid = start + (end - start)/2;

      if(arr[mid] > arr[mid+1]) {
        end = mid;
      }
      else {
        start = mid + 1;
      }
    }
    return start;
  }
  public static void main(String[] args) {
    int[] array = {1,5,3,4,1};
    System.out.println(peakIndex(array));
  }
}
