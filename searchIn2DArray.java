import java.util.Arrays;

public class searchIn2DArray {

  static int[] searchFor(int[][] arr, int target) {

    for(int row = 0; row < arr.length; row++) {
      for(int col = 0; col < arr[row].length; col++) {
        if(arr[row][col] == target) {
          return new int[]{row,col};
        }
      }
    } 
    return new int[]{-1, -1};
  }
  public static void main(String[] args) {
    int[][] array = {
      {23, 54, 78},
      {94, 68, 03},
      {10, 83, 59},
      {38, 58}
    };

     int target = 58;
     int[] answer = searchFor(array, target);
    System.out.println(Arrays.toString(answer));
  }
}
