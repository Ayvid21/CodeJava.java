public class searchInStrings {
  static boolean searchElementInString(String str, char target) {
    if(str.length() == 0) {
      return false;
    }

    for(int i = 0; i<str.length(); i++) {
      if(str.charAt(i) == target) {
        return true;
      }
    }
    return false;
  }
  public static void main(String[] args) {
    String name = "Surender";
    char charToSearch = 'e';
     System.out.println(searchElementInString(name, charToSearch));
  }
}