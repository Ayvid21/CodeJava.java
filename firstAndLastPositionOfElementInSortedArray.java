//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

public class firstAndLastPositionOfElementInSortedArray {
  static int search(int[] nums, int target, boolean findStartIndex) {

    int ans = -1;
    int start = 0;
    int end = nums.length-1;

    while(start <= end) {
      int mid = start + (end - start) / 2;

      if(target > nums[mid]) {
        start = mid + 1;
      } 
      else if (target < nums[mid]) {
        end = mid - 1;
      } 
      else {
        //potential answer is found
        ans = mid;
        if(findStartIndex) {
          end = mid -1;
        } else {
          start = mid + 1;
        }
      }
    }
    return ans;
  }

  static int[] searchRange(int[] nums, int target) {
    int[] ans = {-1, -1};
    //checking for the first occurence of target first

    int start = search(nums, target, true);
    int end = search(nums, target,false);

    ans[0] = start;
    ans[1] = end;

    return ans;
  } 

  public static void main(String[] args) {
    int[] array = {5, 7, 7, 8, 8, 10};
    int target = 8;
    System.out.println(searchRange(array, target)); 
  }
}
