//https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
public class findAnElementInInfitineSortedArray {

  static int answer(int[] arr, int target) {
    // first find the range
    // first start with a box of size 2

    int start = 0;
    int end = 1;
    //condition for the target to lie int the range
    while(target > arr[end]) {
      int newStart = end + 1;
      // double the box value
      // end = previous end + sizeofBox*2
      end = end + (end - start + 1) *2;
      start = newStart;
    }
    return binarySearch(arr, target, start, end);
  }

  static int binarySearch(int[] arr, int target, int start, int end) {

    while(start <= end) {
      int mid = start + (end - start) / 2;
      if(target > arr[mid]) {
        start = mid + 1;
      }
      else if(target < arr[mid]) {
        end = mid - 1;
      }
      else {
        return mid;
      }
    }
    return -1;
  }
  public static void main(String[] args) {
    int[] arr ={3, 5, 7, 9, 10, 90, 92, 93, 94, 95, 96, 97, 98, 99};

    int target = 92;

    System.out.println(answer(arr, target));
  }
}
