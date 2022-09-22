import java.util.*;
public class LLwithCollectionFramework {
  public static void main(String args[]) {
    LinkedList<String> list = new LinkedList<String>();

    list.addFirst("I'am");
    list.addFirst("Hello!");
    System.out.println(list);

    list.addLast("Divya");
    System.out.println(list);
    list.addLast("Rajpoot");
    System.out.println(list);

    System.out.println(list.size());

    for(int i=0; i<list.size(); i++) {
      System.out.print(list.get(i) + " -> ");
    }
    System.out.println("Null");

    list.remove(2);
    System.out.println(list);
  }
}