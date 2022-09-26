package Exercice.MultidimensionalArrays;

import java.util.Scanner;

public class P03DiagonalDifference {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int size = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[size][size];

        // read matrix
        readMatrix(scanner, size, matrix);

        // primary diagonal
        int primaryDiagonal = 0;

        primaryDiagonal = getPrimaryDiagonal(matrix, primaryDiagonal);


        //secondary diagonal
        int secondaryDiagonal = 0;

        secondaryDiagonal = getSecondaryDiagonal(size, matrix, secondaryDiagonal);

        int result = Math.abs(primaryDiagonal - secondaryDiagonal);

        //print result
        // TODO: 9/25/2022
        System.out.print(result);
    }

    private static int getSecondaryDiagonal(int size, int[][] matrix, int secondaryDiagonal) {

        // [0][2]
        // [1][1]
        // [2][0]
        //rows--
        //cols++
        for (int row = size - 1, col = 0; col < size && row >= 0; row--, col++) {
            secondaryDiagonal += matrix[row][col];
        }
        return secondaryDiagonal;
    }

    private static int getPrimaryDiagonal(int[][] matrix, int primaryDiagonal) {
         /*
            [0][0]
            [1][1]
            [2][2]
         */
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {

                if (row == col) {
                    primaryDiagonal += matrix[row][col];
                }
            }
        }
        return primaryDiagonal;
    }

    private static void readMatrix(Scanner scanner, int size, int[][] matrix) {
        for (int row = 0; row < size; row++) {
            String[] rowInput = scanner.nextLine().split("\\s+");
            for (int col = 0; col < size; col++) {
                matrix[row][col] = Integer.parseInt(rowInput[col]);
            }
        }
    }
}
