package Lab.MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class P5MaximumSumOf2X2Submatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // от този масив зимаме цифрите за размера на матрицата "3x6" разделени по (, )
        int[] dimension = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();

        // от позиция 0 взимаме стойноста 3 и я запазваме в променливата ровс
        int rows = dimension[0];
        // от позиция 1 взимаме стойноста 6 и я запазваме в променливата цоломс
        int columns = dimension[1];

        // създаваме матрица с rows на брой масиви и colums а брой масиви
        //    3, 6
        //7, 1, 3, 3, 2, 1
        //1, 3, 9, 8, 5, 6
        //4, 6, 7, 9, 1, 0
        int[][] matrix = new int[rows][columns];

        // пълниме матрицата с съответните данни които взимаме от конзолата
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();

        }
        // инициализираме матрица 2*2
        int[][] maxSumMatrix = new int[2][2];
        // създаваме променлива максСум и задаваме минимална стойност
        int maxSum = Integer.MIN_VALUE;

        // с първия фор цикъл отиваме до предпоследния елемент от матрицата
        for (int r = 0; r < matrix.length - 1; r++) {
            // 3*6
            //7, 1, 3, 3, 2, 1
            //1, 3, 9, 8, 5, 6
            //4, 6, 7, 9, 1, 0
            for (int c = 0; c < matrix[r].length - 1; c++) {

                // променливата сум ни дъжи сумата на подматрицата 2*2
                // индексите които трява да досвъпим и да съберем елементите от даденя индекс
                //  0,0 0,1
                //  1,0 1,1
                int sum = matrix[r][c] + matrix[r][c + 1] +
                        matrix[r + 1][c] + matrix[r + 1][c + 1];
                // алгоритам за максимално число
                if (sum > maxSum) {
                    maxSum = sum;
                    // пълнене на подматрицата с максималните стойности
                    maxSumMatrix[0][0] = matrix[r][c];
                    maxSumMatrix[0][1] = matrix[r][c + 1];
                    maxSumMatrix[1][0] = matrix[r + 1][c];
                    maxSumMatrix[1][1] = matrix[r + 1][c + 1];

                }
            }
        }
        for (int[] num : maxSumMatrix) {
            for (int n : num) {
                System.out.print(n + " ");
            }
            System.out.println();
        }

        System.out.println(maxSum);
    }
}
