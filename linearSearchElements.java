// time complexity of linearSearch is 
public class linearSearchElements {
  static int linearSearch(int[] arr, int value) {
    if (arr.length == 0) {
      return -1;
    }
    for(int i=0; i<arr.length; i++) {
      if(arr[i] == value) {
        return i;
      }
    }
    return -1;
  }
  public static void main(String args[]) {
    int[] array = { 13, 46, 65, 25, 89, 48, 59};
    int valueToFind = 89;
    int ans = linearSearch(array, valueToFind);
    System.out.println(valueToFind + " is present at index : " + ans);
  }
}
