/*
 * Copyright (c) 2023 Boris T.
 */

package workshop.DataStructure.LinkedList;

public class main {
    public static void main(String[] args) {


      DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
      doublyLinkedList.addLast(1);
      doublyLinkedList.addLast(2);
      doublyLinkedList.addLast(3);
      doublyLinkedList.addLast(4);
      doublyLinkedList.addLast(5);
      doublyLinkedList.addLast(6);
      doublyLinkedList.addLast(7);
      doublyLinkedList.addLast(8);

      System.out.println(doublyLinkedList.get(2));
      System.out.println(doublyLinkedList.get(0));

      System.out.println(doublyLinkedList.get(7));

      for (int i : doublyLinkedList.toArr()) {
        System.out.println(i);
      }


      //doublyLinkedList.forEach(System.out::println);
      System.out.println();


    }
}
