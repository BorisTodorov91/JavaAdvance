package Exercice;

import java.util.ArrayDeque;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // stack
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        // обавяне на елемент в стека
        stack.push(1);
        stack.push(3);
        stack.push(5);
        stack.push(1);
        stack.push(3);
        stack.push(5);


        // s pop вадим последния елемент от стека
        stack.pop();
        // s peek взимаме(гледаме) последния елемет не модифиция последния елемент
        stack.peek();
       int n =  stack.peekLast();


        // Queue
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        queue.offer(2);// добавяме елемент в опашката
        queue.offer(2);
        queue.offer(23);
        // махаме първия елемент
        queue.poll();
        // взимаме първия но не модифицираме опашката
        queue.peek();




    }
}
