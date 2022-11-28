package Lab.SetsAndMapsAdvanced.fun;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class sumNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Function<int[], String> sum = element -> "" + Arrays.stream(element).sum();

        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        System.out.println(sum.apply(array));
    }
}
