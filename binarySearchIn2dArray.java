import java.util.Arrays;

public class binarySearchIn2dArray {

  static int[] find(int[][] arr, int target) {
    int r = 0;
    int c = arr.length-1;

    while(r< arr.length && c >= 0) {
      if(arr[r][c] > target) {
        c--;
      }
      else if(arr[r][c] < target) {
        r++;
      }
      else {
        return new int[]{r,c};
      } 
    }
    return new int[]{-1, -1};
  }
  public static void main(String[] args) {
    int[][] array = {
      {10,20,30,40},
      {15,25,35,45},
      {28,29,37,49},
      {33,34,38,50}
    };

    int target = 37;
    int[] ans = find(array, target);
    System.out.println(Arrays.toString(ans));
  }
}
