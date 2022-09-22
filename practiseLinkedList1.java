// Make a Linked List & add the following elements to it : (1, 5, 7, 3 , 8, 2, 3). Search for the number 7 & display its index.

//Take elements(numbers in the range of 1-50) of a Linked List as input from the user. Delete all nodes which have values greater than 25.

import java.util.*;

class practiseLinkedList1 {
  public static void main(String args[]) {
    LinkedList<Integer>list = new LinkedList<Integer>();

    list.addFirst(1);
    list.add(5);
    list.add(7);
    list.add(3);
    list.add(8);
    list.add(2);
    list.add(3);
    System.out.println(list);
  }
  
}
