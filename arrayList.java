import java.util.ArrayList;
import java.util.Collections;

class arrayList {
  public static void main(String args[]) {
    ArrayList<Integer>list = new ArrayList<Integer>();

    //add elements
    list.add(0);
    list.add(2);
    list.add(4);
    list.add(9);
    list.add(1);
    list.add(3);
    list.add(5);
    list.add(7);
    list.add(6);
    list.add(8);

    System.out.println(list);

    //get elements
    int element = list.get(6);
    System.out.println(element);

    //add element in between
    list.add(1,5);
    System.out.println(list);

    // set element
    list.set(0,7);
    System.out.println(list);

    // delete element
    list.remove(8);
    System.out.println(list);

    //size of arraylist
    int size = list.size();
    System.out.println(size);

    // for loops
    for(int i=0; i<list.size(); i++) {
      System.out.println(list.get(i));
    }

    // sorting
    Collections.sort(list);
    System.out.println(list);
  }
}