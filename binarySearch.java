// time complexity of binary search is O(log n) 
public class binarySearch {
  static int bSearch(int[] arr, int target) {
    int start = 0;
    int end = arr.length-1;

     while(start <= end) {
      int mid = start + (end - start) / 2;

      if(target > arr[mid]) {
        start = mid + 1;
      }
      else if(target < arr[mid]) {
        end = mid -1;
      }
      else {
        return mid;
      }
     }
     return -1;
  }

  public static void main(String[] args) {
    int[] array = {3,7,12,28,34,39,67,90};
    int target = 34;
    System.out.println(bSearch(array, target));
  }
}
