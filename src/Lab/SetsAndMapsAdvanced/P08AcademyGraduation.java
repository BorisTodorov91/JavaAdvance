package Lab.SetsAndMapsAdvanced;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P08AcademyGraduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Double> gradesByStudents = new TreeMap<>();
        while (n-- > 0) {

            String name = scanner.nextLine();

            double grades = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToDouble(Double::parseDouble)
                    .average()
                    .orElse(0);
            gradesByStudents.put(name, grades);

        }
        DecimalFormat format = new DecimalFormat("###.####");
        gradesByStudents.forEach((name, grade) -> System.out.printf("%s is graduated with %s%n", name, format.format(grade)));


    }
}
