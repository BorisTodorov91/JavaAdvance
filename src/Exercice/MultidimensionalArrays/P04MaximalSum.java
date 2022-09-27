package Exercice.MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class P04MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] dimension = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int rows = dimension[0];
        int cols = dimension[1];

        int[][] matrix = new int[rows][cols];

        //readMatrix
        readMatrix(scanner, rows, cols, matrix);

        int maxSum = Integer.MIN_VALUE;
        int bestStartingRow = 0;
        int bestStartingCol = 0;
        for (int row = 0; row < rows - 2; row++) {
            for (int col = 0; col < cols - 2; col++) {
                int sum =
                        // 0 0                 0 1                     0 2
                        matrix[row][col] + matrix[row][col + 1] + matrix[row][col + 2] +
                                // 1 0               //1 1                     1 2
                                matrix[row + 1][col] + matrix[row + 1][col + 1] + matrix[row + 1][col + 2] +
                                // 2 0                 2 1                     2 2
                                matrix[row + 2][col] + matrix[row + 2][col + 1] + matrix[row + 2][col + 2];
                                                       //!vazno
                /*for (int currentRow = 0; currentRow < row + 3; currentRow++) {
                                                         //!vazno
                    for (int currentCol = 0; currentCol < col + 3; currentCol++) {
                        sum += matrix[currentRow][currentCol];
                    }
                }*/

                if (sum > maxSum) {
                    maxSum = sum;
                    bestStartingRow = row;
                    bestStartingCol = col;
                }
            }
        }

        System.out.println("Sum = " + maxSum);
        printMatrix(matrix, bestStartingRow, bestStartingCol);
    }

    private static void printMatrix(int[][] matrix, int bestStartingRow, int bestStartingCol) {
        for (int row = bestStartingRow; row < bestStartingRow + 3; row++) {
            for (int col = bestStartingCol; col < bestStartingCol + 3; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static void readMatrix(Scanner scanner, int rows, int cols, int[][] matrix) {
        for (int row = 0; row < rows; row++) {
            String[] inputRow = scanner.nextLine().split("\\s+");
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = Integer.parseInt(inputRow[col]);
            }
        }
    }
}
