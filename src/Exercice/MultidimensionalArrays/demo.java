package Exercice.MultidimensionalArrays;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[][] matrix = new int[3][3];

        for (int c = 0; c < matrix.length; c++) {
            for (int r = 0; r < matrix[c].length; r++) {
                matrix[c][r] = scanner.nextInt();
            }
        }


    }
}
