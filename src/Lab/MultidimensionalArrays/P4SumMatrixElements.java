package Lab.MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class P4SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] size = scanner.nextLine().split(", ");
        int row = Integer.parseInt(size[0]);
        int col = Integer.parseInt(size[1]);
        int[][] matrix = new int[row][col];

        for (int r = 0; r < matrix.length; r++) {
            int[] arr = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
            matrix[r] = arr;
        }


        int sum = 0;


        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                sum += matrix[r][c];
            }
        }

        System.out.println(row);
        System.out.println(col);
        System.out.println(sum);
    }
}
