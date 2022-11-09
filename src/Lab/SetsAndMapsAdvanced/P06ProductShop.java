package Lab.SetsAndMapsAdvanced;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P06ProductShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        TreeMap<String, LinkedHashMap<String, Double>> shopInfo = new TreeMap();
        String comand = scanner.nextLine();
        while (!comand.equals("Revision")) {

            String shop = comand.split(", ")[0];
            String product = comand.split(", ")[1];
            double price = Double.parseDouble(comand.split(", ")[2]);

            if (!shopInfo.containsKey(shop)) {
                shopInfo.put(shop, new LinkedHashMap<>());
                shopInfo.get(shop).put(product, price);
            } else {
                shopInfo.get(shop).put(product, price);
            }

            comand = scanner.nextLine();
        }

        for (Map.Entry<String, LinkedHashMap<String, Double>> entry : shopInfo.entrySet()) {

            System.out.printf("%s->%n", entry.getKey());
            for (Map.Entry<String, Double> stringEntry : entry.getValue().entrySet()) {
                System.out.printf("Product: %s, Price: %.1f%n", stringEntry.getKey(), stringEntry.getValue());
            }
        }
    }
}
