class myVersionOfRotatedSortedArray {

    static int orderAgnosticBinarySearch(int[] arr, int target, int start, int end) {
  
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
  
  static int search(int[]arr, int target) {
  int peak = peakIndex(arr);
  int firstTry = orderAgnosticBinarySearch(arr, target , 0 , peak);
  if(firstTry != -1) {
    return firstTry;
  }
  return orderAgnosticBinarySearch(arr, target, peak+1, arr.length-1);
  }
  
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
  
  // it does not work for one element
  public static void main(String[] args) {
    int[] arr = {4,5,6,7,0,1,2,};
    int target = 0;
    System.out.println(search(arr, target));
  }
}