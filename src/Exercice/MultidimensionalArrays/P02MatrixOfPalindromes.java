package Exercice.MultidimensionalArrays;

import java.util.Scanner;

public class P02MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        String[][] matrix = new String[n][m];


        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                /* enter palindrom */
                char outsideLetter = (char) ('a' + row);
                char middleLetter = (char) ('a' + row + col);
                matrix[row][col] = String.valueOf(outsideLetter) + middleLetter + outsideLetter;

            }
        }


        // print matrix
        for (String[] element : matrix) {
            for (String item : element) {
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }
}
