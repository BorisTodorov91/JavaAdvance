package Exercice.MultidimensionalArrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P06StringMatrixRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String rotation = scanner.nextLine();
        String rotationStringNumber = rotation.split("[()]")[1];
        int rotationNumber = Integer.parseInt(rotationStringNumber);
        /* исползваме модулно деление за да можем да определим под кой ъгал да въртиме матрицата
            имаме 4 ти възможности 0 90 180 270
            0 % 360 =   0
            90 % 360 =  90
            180 % 360 = 180
            270 % 360 = 270
            360 % 360 = 0
            450 % 360 = 90
            540 % 360 = 180
            630 % 360 = 270
            720 % 360 = 0
            ...

        * */
        int angleOfRotation = rotationNumber % 360;

        String input = scanner.nextLine();
        // използваме лист структура от данни за да мозем да запишем всички думи а също така защото не знаме колко точно
        // думи ще имаме
        List<String> wordList = new ArrayList<>();

        int maxLenght = Integer.MIN_VALUE;
        // със while цикъла и с алгоритъм за най-голямо число определяме колоната на матрицата
        while (!input.equals("END")) {
            wordList.add(input);

            if (input.length() > maxLenght) {
                maxLenght = input.length();
            }
            input = scanner.nextLine();
        }
        // редовете взимаме като вземем всички записи от листа
        int rows = wordList.size();
        // колоните взимаме като вземем найголямата дума от елементите в листа
        int cols = maxLenght;

        char[][] matrix = new char[rows][cols];

        // попълваме празната матрица от tip char
        for (int row = 0; row < rows; row++) {
            String currentWord = wordList.get(row);
            for (int col = 0; col < cols; col++) {

                //  с тази проверка проверяваме ако колоните са ни по-малко от броя на текущият брой елементи и ги добавяме в матрицата
                if (col < currentWord.length()) {
                    /*
                    h  a  l  l  o + ''+''
                    s  o  f  t  u   n  i
                    e  x  a  m+ ''+ ''+''
                    */
                    char currentChar = currentWord.charAt(col);
                    matrix[row][col] = currentChar;
                } else {
                    // ако ли не добавяме празно мясно
                    matrix[row][col] = ' ';
                }
            }
        }


        // принтиране на матрицата спрямо градусите които сме получили
        switch (angleOfRotation) {
            case 0:
                // за 0 и 360 градуса си принтираме принтираме стандартно
                //  от ляво на дясно
                //и от горе надолу
                // row++
                // col++
                for (int row = 0; row < rows; row++) {
                    for (int col = 0; col < cols; col++) {
                        System.out.print(matrix[row][col]);
                    }
                    System.out.println();
                }
                break;
            case 90:
                // за 90 градуса
                // започваме от първата колона и колоните ги увеличаваме докато не стигнем col < cols
                // col++
                // и започваме от последният ред и намаляме редовете докато не стигнем до >= 0
                // row--
                for (int col = 0; col < cols; col++) {
                    for (int row = rows - 1; row >= 0; row--) {
                        System.out.print(matrix[row][col]);
                    }
                    System.out.println();
                }
                break;
            case 180:
                // за 180 градуса
                // започваме от последният ред и редовете ги намаляме докато не стигнем >=0
                // row--
                // започваме от последната колона и колоните ги намаляме догато не стигнем >= 0
                // col--
                for (int row = rows - 1; row >= 0; row--) {
                    for (int col = cols - 1; col >= 0; col--) {
                        System.out.print(matrix[row][col]);
                    }
                    System.out.println();
                }
                break;
            case 270:
                // за 270 градуса
                // започваме от последната колона и намаляме броят на колоните докато не стигнем >=0
                // col--
                // започваме от първият ред и увеличаваме броят на редовете докато row<rows
                // row++
                for (int col = cols - 1; col >= 0; col--) {
                    for (int row = 0; row < rows; row++) {
                        System.out.print(matrix[row][col]);
                    }
                    System.out.println();
                }
                break;
        }
    }
}
