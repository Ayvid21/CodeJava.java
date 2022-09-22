public class searchInRange {
  static int searchInRangeOf(int[] arr, int target, int start, int end) {
    if(arr.length == 0) {
      return -1;
    }

     for(int i=start; i<= end; i++) {
      if(arr[i] == target) {
        return i;
      }
     }
     return -1;
  }
  public static void main(String[] args) {
    int[] array = { 1,4,5,7,9,3,8,6,2};
    int target = 4;
    int startFrom = 1;
    int endUpto = 4;
    System.out.println(searchInRangeOf(array, target, startFrom, endUpto));
  }
}
