package Lab.MultidimensionalArrays;

import java.util.Scanner;

public class P1CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int colos = scanner.nextInt();


        int[][] first = new int[rows][colos];

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < colos; c++) {
                first[r][c] = scanner.nextInt();
            }
        }

        rows = scanner.nextInt();
        colos = scanner.nextInt();

        int[][] second = new int[rows][colos];

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < colos; c++) {
                second[r][c] = scanner.nextInt();
            }
        }

        boolean areEqual = areArraysAreEquals(first, second);
        System.out.println(areEqual ? "equal" : "not equal");

    }

    public static boolean areArraysAreEquals(int[][] first, int[][] second) {
        if (first.length != second.length) {
            return false;
        }

        for (int r = 0; r < first.length; r++) {
            int[] firstArr = first[r];
            int[] secondArr = second[r];
            if (firstArr.length != secondArr.length) {
                return false;
            }

            for (int i = 0; i < firstArr.length; i++) {
                int firstNum = firstArr[i];
                int secondNum = secondArr[i];

                if (firstNum != secondNum) {
                    return false;
                }
            }
        }
        return true;
    }
}
