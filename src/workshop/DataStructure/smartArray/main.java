/*
 * Copyright (c) 2023 Boris T.
 */

package workshop.DataStructure.smartArray;

public class main {
    public static void main(String[] args) {

        SmartArray smartArray = new SmartArray();
        smartArray.add(13);
        smartArray.add(42);
        smartArray.add(73);
        smartArray.add(69);
        smartArray.add(23);
        smartArray.remove(2);
        System.out.println();

        smartArray.forEach(System.out::println);

        System.out.println();

    }
}
