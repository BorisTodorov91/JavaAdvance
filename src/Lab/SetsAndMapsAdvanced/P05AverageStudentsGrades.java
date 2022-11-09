package Lab.SetsAndMapsAdvanced;

import java.util.*;

public class P05AverageStudentsGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());


        TreeMap<String, List<Double>> infoStudent = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            String student = scanner.nextLine();
            String name = student.split("\\s+")[0];
            double grades = Double.parseDouble(student.split("\\s+")[1]);

            if (!infoStudent.containsKey(name)) {
                infoStudent.put(name, new ArrayList<>());
                infoStudent.get(name).add(grades);
            } else {
                infoStudent.get(name).add(grades);
            }
        }

        for (Map.Entry<String, List<Double>> studentInfoGrade : infoStudent.entrySet()) {
            double avg = 0.0;
            StringBuilder sb = new StringBuilder();

            for (double grade : studentInfoGrade.getValue()) {
                avg += grade;
                String tmp = String.format("%.2f ", grade);

                sb.append(tmp);
            }

            avg = avg / studentInfoGrade.getValue().size();

            System.out.printf("%s -> %s(avg: %.2f)%n", studentInfoGrade.getKey(), sb, avg);
        }

    }
}
