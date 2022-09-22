//finding smallest element in the array which is greater than or equal to the target
public class celingOfNumber {
  static int ceil(int[] arr, int target) {
    if(target > arr[arr.length - 1]) {
      return -1;
    }
    int start = 0;
    int end = arr.length-1;
    
    while(start <= end) {
      int mid = start + (end - start) / 2;
      if(target == arr[mid]) {
        return arr[mid];
      }
      else if(target > arr[mid]) {
        start = mid + 1;
      }
      else {
        end = mid - 1;
      }
    }
    start = end + 1; // notice it how is it working
    return arr[start];
  }
  public static void main(String[] args) {
    int[] arr = { 2, 3, 5, 6, 8, 9 };
    int target = 7;
    System.out.println(ceil(arr, target));
  }
}
