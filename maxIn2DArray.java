public class maxIn2DArray {
  static int searchForMax(int[][] arr) {
    int max = arr[0][0];
    for(int row = 0; row < arr.length; row++) {
      for(int col = 0; col < arr[row].length; col++) {
        if(arr[row][col] > max) {
          max = arr[row][col];
        }
      }
    } 
    return max;
  }
  public static void main(String[] args) {
    int[][] array = {
      {23, 54, 78},
      {94, 68, 03},
      {10, 183, 59},
      {38, 58}
    };
     int answer = searchForMax(array);
    System.out.println(answer);
  }
}
