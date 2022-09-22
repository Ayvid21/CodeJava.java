// import java.util.*;
class LL {
  Node head;
  private int size;

  LL() {
    this.size = 0;
  }

  class Node {
    String data;
    Node next;

    Node(String data) {
      this.data = data;
      this.next = null;
      size++;
    }
  }

  // add first
  public void addFirst(String data) {
    Node newNode = new Node(data);
    if(head == null) {
      head = newNode;
      return;
    }

    newNode.next = head;
    head = newNode;
  }
   

  //add last
  public void addLast(String data) {
    Node newNode = new Node(data);
    if(head == null) {
      head = newNode;
      return;
    }

    Node currentNode = head;
    while(currentNode.next != null) {
      currentNode = currentNode.next;
    }

    currentNode.next = newNode;
  }


  //print
  public void printList() {
    if(head == null) {
      System.out.println("List is empty");
      return;
    }

    Node currentNode = head;
    while(currentNode != null) {
      System.out.print(currentNode.data + " -> ");
      currentNode = currentNode.next;
    }
    System.out.print("NULL");
  }

  // delete first
  public void deleteFirst() {
    if(head == null) {
      System.out.println("List is empty");
      return;
    }
    size--;
    head = head.next;
  }

  // delete last
  public void deleteLast() {
    if(head == null) {
      System.out.println("List is empty");
      return;
    }

    size--;
    if(head.next == null) {
      head = null;
      return;
    }

    Node secondLastNode = head;
    Node lastNode = head.next;
    while(lastNode.next != null) {
      lastNode = lastNode.next;
      secondLastNode = secondLastNode.next;
    }

    secondLastNode.next = null;
  }
  
  public int getSize() {
    return size;
  }

  public static void main(String args[]) {
    LL list = new LL();
    list.addFirst("Divya");
    list.addFirst("I'm");
    list.printList();

    System.out.println();
    list.addLast("Rajpoot");
    list.printList();
    System.out.println();
    list.addFirst("Hello!");
    list.printList();

    System.out.println();
    list.deleteFirst();
    list.printList();

    System.out.println();
    list.deleteLast();
    list.printList();

    System.out.println();
    System.out.println(list.getSize());
  }
}