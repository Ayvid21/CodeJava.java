//also known as sinking sort   or  exchange sort
public class bubbleSort {

  static int bSort(int[] arr) {
    for(int i = 0; i < arr.length-1; i++) {
      for(int j = i+1; j < arr.length-i-1; j++) {
        if(i > j) {
          int temp = i;
          i = j;
          j = temp; 
        }
      }
    }
    return -1;
  }
  public static void main(String[] args) {
    int[] arr ={3, 1, 5, 4, 2};
    System.out.println(bSort(arr));
  }
}
