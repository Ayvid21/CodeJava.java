//return the smallest character int the array that is larger than target
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/submissions/
public class smallestLetterGreaterThanTarget {

  static char smallestLetter(char[] arr, char target) {
    int start = 0;
    int end = arr.length-1;

    while(start <= end) {
      int mid = start + (end - start) / 2;

      if(target < arr[mid]) {
        end = mid - 1;
      }
      else {
        start = mid + 1;
      }
    }
    start = end + 1;
    return arr[start % arr.length];
  }
  public static void main(String[] args) {
    char[] array = {'c', 'f', 'j'};
    char target = 'c';
    System.out.println(smallestLetter(array, target));
  }
}
