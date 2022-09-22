public class orderAgnosticBinarySearch {

  static int orderAgnosticBS(int[] arr, int target) {
    int start = 0;
    int end = arr.length -1;

    boolean isAscending; // or // boolean isAscending = arr[start] < arr[end];
    if(arr[start] < arr[end]) {
      isAscending = true;
    }
    else {
      isAscending = false;
    }
    while(start <= end) {

      int mid = start + (end - start) / 2;

      if(target == arr[mid]) {
        return mid;
      }
      
      if(isAscending) {
        if(target < arr[mid]) {
          end = mid - 1;
        }
        else {
          start = mid + 1;
        }
      } else {
        if(target < arr[mid]) {
          start = mid + 1;
        }
        else {
          end = mid - 1;
        }
      }
  }
  return -1;
}
  public static void main(String[] args) {
    int [] array = {1, 3, 5, 6, 8, 9, 14, 17};
    int target = 3;
    System.out.println(orderAgnosticBS(array, target));
  }
}
