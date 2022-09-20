package Lab.MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class P6PrintDiagonalsOfSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[size][size];

        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        int rows = 0;
        int columns = 0;

        while (rows < matrix.length && columns < matrix[rows].length) {
            System.out.print(matrix[rows][columns] + " ");
            rows++;
            columns++;
        }
        System.out.println();
        rows = matrix.length - 1;
        columns = 0;

        while (rows >= 0 && columns < matrix[rows].length) {
            System.out.print(matrix[rows][columns] + " ");
            rows--;
            columns++;

        }


    }
}
