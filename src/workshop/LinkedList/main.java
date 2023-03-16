/*
 * Copyright (c) 2023 Boris T.
 */

package workshop.LinkedList;

public class main {
    public static void main(String[] args) {


        LinkedList list = new LinkedList();

        list.addLast(12);
        list.removeLast();


        list.forEach(System.out::println);

    }
}
