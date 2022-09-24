package Lab.MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class P8WrongMeasurements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[size][];

        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = readArray(scanner);
        }

        int[] indexes = readArray(scanner);

        int valueToReplace = matrix[indexes[0]][indexes[1]];

        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                if (matrix[r][c] == valueToReplace) {
                    int correctValue = getNearbySum(matrix, r, c, valueToReplace);
                    matrix[r][c] = correctValue;
                }
            }
        }


        for (int[] arr : matrix) {
            for (int n : arr) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }

    private static int getNearbySum(int[][] matrix, int r, int c, int valueToReplace) {

        int sum = 0;
        /*
        1 2 3
        1 2 3
        1 2 3

          c 0          1          2
     r  0[r-1][c-1] |[r-1][c] |[r-1][c+1]
          [0][0]      [0][1]      [0][2]
        1[r][c-1]   |[r][c]   |[r][c+1]
          [1][0]      [1][1]      [1][2]
        2[r-1][c-1] |[r+1][c] |[r+1][c+1]
          [2][0]      [2][1]      [2][2]
         */

        if (isInBounds(r + 1, c, matrix)) {
            //up
            sum += matrix[r + 1][c];
        }
        if (isInBounds(r - 1, c, matrix)) {
            //down
            sum += matrix[r - 1][c];
        }
        if (isInBounds(r, c + 1, matrix)) {
            //right
            sum += matrix[r][c + 1];
        }
        if (isInBounds(r, c - 1, matrix)) {
            //left
            sum += matrix[r][c - 1];
        }

        return sum;
    }

    private static boolean isOutBounds(int r, int c, int[][] matrix) {
        return !isInBounds(r, c, matrix);
    }

    private static boolean isInBounds(int r, int c, int[][] matrix) {
        return r >= 0 && r < matrix.length && c >= 0 && c < matrix[r].length;
    }

    private static int[] readArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
    }
}
