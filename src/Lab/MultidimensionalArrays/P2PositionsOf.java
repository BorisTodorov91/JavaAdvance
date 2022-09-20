package Lab.MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class P2PositionsOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimension = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int rows = dimension[0];
        int cols = dimension[1];

        int[][] matrix = new int[rows][cols];
        for (int r = 0; r < matrix.length; r++) {
            matrix[r] = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        }
        int searchNumber = Integer.parseInt(scanner.nextLine());
        boolean isFounded = false;
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                int curentNumber = matrix[r][c];

                if (curentNumber == searchNumber) {
                    System.out.println(r + " " + c);
                    isFounded = true;
                }
            }

        }
        if (!isFounded) {
            System.out.println("not found");
        }

    }
}
