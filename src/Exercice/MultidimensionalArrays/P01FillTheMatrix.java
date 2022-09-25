package Exercice.MultidimensionalArrays;

import java.util.Scanner;

public class P01FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        /*
        [0][0] [1][0] [2][0]
        [0][1] [1][1] [2][1]
        [0][2] [1][2] [2][2]
         */
        /*
        [0][0] [0][1] [0][2]
        [1][0] [1][1] [1][2]
        [2][0] [2][1] [2][2]
         */

        String[] input = scanner.nextLine().split(", ");
        int n = Integer.parseInt(input[0]);
        String pattern = input[1];

        int counter = 1;

        int[][] matrix = new int[n][n];

        if (pattern.equals("A")) {
            paternA(n, counter, matrix);
        } else {

            paternB(n, counter, matrix);
        }

        printMatrix(matrix);
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] element : matrix) {
            for (int item : element) {
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }

    private static void paternB(int n, int counter, int[][] matrix) {
        for (int col = 0; col < n; col++) {
            if (col % 2 == 0) {
                for (int row = 0; row < n; row++) {
                    matrix[row][col] = counter;
                    counter++;
                }
            } else {
                for (int row = n - 1; row >= 0; row--) {
                    matrix[row][col] = counter;
                    counter++;
                }
            }
        }
    }

    private static void paternA(int n, int counter, int[][] matrix) {
        for (int col = 0; col < n; col++) {
            for (int row = 0; row < n; row++) {
                matrix[row][col] = counter;
                counter++;
            }
        }
    }
}
