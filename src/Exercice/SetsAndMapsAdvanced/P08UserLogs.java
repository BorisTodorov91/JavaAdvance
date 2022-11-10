package Exercice.SetsAndMapsAdvanced;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P08UserLogs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        //      user                ipAddress   count
        TreeMap<String, LinkedHashMap<String, Integer>> userInfo = new TreeMap<>();

        while (!input.equals("end")) {
            //IP=192.23.30.40 message='Hello&derps.' user=destroyer

            String[] inputParts = input.split("\\s+");

            String ipAddress = inputParts[0].substring(3);
            String user = inputParts[2].substring(5);

            if (!userInfo.containsKey(user)) {
                userInfo.put(user, new LinkedHashMap<>());
            }
            if (!userInfo.get(user).containsKey(ipAddress)) {
                userInfo.get(user).put(ipAddress, 1);
            } else {
                int currentCount = userInfo.get(user).get(ipAddress) + 1;
                userInfo.get(user).put(ipAddress, currentCount);
            }

            input = scanner.nextLine();
        }

        for (var attackers : userInfo.entrySet()) {
            System.out.printf("%s:%n", attackers.getKey());
            StringBuilder sb = new StringBuilder();
            for (Map.Entry<String, Integer> entry : attackers.getValue().entrySet()) {
                sb.append(String.format("%s => %d, ", entry.getKey(), entry.getValue()));
            }
            String finalOutput = sb.substring(0, sb.length() - 2);
            System.out.println(finalOutput + ".");
        }
    }
}
