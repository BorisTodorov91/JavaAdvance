package Exercice.DefiningClass.P09CatLady;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String commandData = scanner.nextLine();

        HashMap<String, Cat> catHashMap = new HashMap<>();

        while (!commandData.equals("End")) {

            String[] parts = commandData.split("\\s+");
            String catType = parts[0];
            String catName = parts[1];

            Cat cat = null;
            switch (catType) {
                case "Siamese":
                    double earSize = Double.parseDouble(parts[2]);
                    cat = new Siamese(catName, earSize);
                    break;
                case "Cymric":
                    double furLength = Double.parseDouble(parts[2]);
                    cat = new Cymric(catName, furLength);
                    break;
                case "StreetExtraordinaire":
                    double decibelsOfMeows = Double.parseDouble(parts[2]);
                    cat = new StreetExtraordinaire(catName, decibelsOfMeows);
                    break;
            }

            catHashMap.put(catName, cat);
            commandData = scanner.nextLine();
        }

        String catToSearch = scanner.nextLine();

        if (catHashMap.containsKey(catToSearch)) {
            System.out.println(catHashMap.get(catToSearch));
        }
    }
}
