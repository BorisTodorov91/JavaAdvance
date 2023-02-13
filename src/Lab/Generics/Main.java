package Lab.Generics;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Jar<Integer> integerJar = new Jar<>();

        integerJar.add(1233);
        integerJar.add(23333);
        System.out.println(integerJar.remove());
    }
}
