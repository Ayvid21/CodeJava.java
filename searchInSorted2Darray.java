import java.util.Arrays;
public class searchInSorted2Darray {

  // static int[] search(int[][]arr, int target) {
  //   int r = 0;
  //   int c = arr.length-1;

  //   while(r < arr.length && c >= 0) {
  //     if(arr[r][c] == target) {
  //       return new int[]{r,c};
  //     }
  //     else if(arr[r][c] < target) {
  //       r++;
  //     }
  //     else {
  //       c--;
  //     }
  //   }
  //   return new int[]{-1, -1};
  // }

  static int[] binarySearch(int[][] arr, int target, int row, int colStart, int colEnd) {
    while(colStart <= colEnd) {
      int mid = colStart + (colEnd - colStart)/2;

      if(arr[row][mid] == target) {
        return new int[]{row, mid};
      }
      else if(arr[row][mid] < target) {
        colStart = mid + 1;
      }
      else {
        colEnd = mid - 1;
      }
    }
    return new int[]{-1};
  }

  static int[] search(int[][] arr, int target) {
    int rows = arr.length;
    int col = arr[0].length;

    if(rows == 1) {
      return binarySearch(arr, target, 0, 0, col-1);
    }
    int rowStart = 0;
    int rowEnd = rows - 1;
    int  colMid = col / 2;

    while (rowStart < (rowEnd - 1)) {
      int mid = rowStart + (rowEnd - rowStart)/2;
      if(arr[mid][colMid] == target) {
        return new int[]{mid, colMid};
      }
      else if(arr[mid][colMid] < target) {
        rowStart = mid;
      }
      else {
        rowEnd = mid;
      }
    }
    if(arr[rowStart][colMid] == target) {
      return new int[]{rowStart, colMid};
    }
    else if(arr[rowStart + 1][colMid] == target) {
      return new int[]{rowStart + 1, colMid};
    }
    
    if(target <= arr[rowStart][colMid - 1]) {
      binarySearch(arr, target, rowStart, 0, colMid-1);
    }

    if(target >= arr[rowStart][colMid + 1] && target <= arr[rowStart][colMid - 1] ) {
      binarySearch(arr, target, rowStart, colMid + 1, col-1);
    }

    if(target <= arr[rowStart + 1][colMid - 1]) {
      binarySearch(arr, target, rowStart, 0, colMid-1);
    }
    else {
      binarySearch(arr, target, rowStart, colMid + 1, col-1);
    }

    return new int[]{-1, -1};
  }
  public static void main(String[] args) {
    int[][] array = {
      {1, 2, 3, 4},
      {5, 6, 7, 8},
      {9, 10, 11, 12},
      {13, 14, 15, 16}
    };
  
    int target = 17;
    int[] ans = search(array, target);
    System.out.println(Arrays.toString(ans));
  }
}
