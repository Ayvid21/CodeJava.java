// import java.util.*;

class reversingLinkedList {
  Node head;
  private int size;

  reversingLinkedList() {
    this.size = 0;
  }

  class Node {
    Integer data;
    Node next;

    Node(Integer data) {
      this.data = data;
      this.next = null;
      size++;
    }
  }

  // add first
  public void addFirst(Integer data) {
    Node newNode = new Node(data);
    if(head == null) {
      head = newNode;
      return;
    }

    newNode.next = head;
    head = newNode;
  }
   

  //add last
  public void addLast(Integer data) {
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

  public void reverseIterate() {
    if(head == null || head.next == null) {
      return;
    }

    Node previousNode = head;
    Node currentNode = head.next;

    while(currentNode != null) {
      Node nextNode = currentNode.next;
      currentNode.next = previousNode;

      previousNode = currentNode;
      currentNode = nextNode;
    }
    head.next = null;
    head = previousNode;
  }

  public Node reverseRecursive(Node head) {
    if(head == null || head.next == null) {
      return head;
    }

    Node newHead = reverseRecursive(head.next);
     head.next.next = head;
     head.next = null;

     return newHead;
  }

  public void swapNodes() {
    // if(head == null || head.next == null) {
    //   return;
    // }

    Node temp = head;

    while(temp != null && temp.next != null) {
      int newtemp = temp.data;
      temp.data = temp.next.data;
      temp.next.data = newtemp;
      temp = temp.next.next;
    }
  }

  public static void main(String args[]) {
    reversingLinkedList list = new reversingLinkedList();
    list.addLast(1);
    list.addLast(2);
    // list.addLast(3);
    // list.addLast(4);
    // list.addLast(5);
    list.printList();
    System.out.println();
    list.swapNodes();
    list.printList();

  }
}
