package Lab.SetsAndMapsAdvanced.fun;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P01CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double[] number = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToDouble(Double::parseDouble)
                .toArray();

        Map<Double, Integer> doubleIntegerMap = new TreeMap<>();


        for (double v : number) {
            Integer curentNum = doubleIntegerMap.get(v);

            if (doubleIntegerMap.containsKey(v)) {
                doubleIntegerMap.put(v, curentNum + 1);
            } else {
                doubleIntegerMap.put(v, 1);
            }
        }

        for (Map.Entry<Double, Integer> doubleIntegerEntry : doubleIntegerMap.entrySet()) {
            System.out.printf("%.0f - %d%n", doubleIntegerEntry.getKey(), doubleIntegerEntry.getValue());
        }
    }
}
