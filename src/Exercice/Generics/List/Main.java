package Exercice.Generics.List;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        CustomList<String> customList = new CustomList<>();

        while (!command.equals("END")) {

            String[] inputData = command.split(" ");
            String inputType = inputData[0];

            switch (inputType) {
                case "Add":
                    String elementToAdd = inputData[1];
                    customList.add(elementToAdd);
                    break;
                case "Remove":
                    int index = Integer.parseInt(inputData[1]);
                    customList.remove(index);
                    break;
                case "Contains":
                    String elementToSearch = inputData[1];
                    System.out.println(customList.contains(elementToSearch));
                    break;
                case "Swap":
                    int firstIndex = Integer.parseInt(inputData[1]);
                    int secondIndex = Integer.parseInt(inputData[2]);
                    customList.swap(firstIndex, secondIndex);
                    break;
                case "Greater":
                    String elementForCount = inputData[1];
                    System.out.println(customList.countGrater(elementForCount));
                    break;
                case "Max":
                    System.out.println(customList.max());
                    break;
                case "Min":
                    System.out.println(customList.min());
                    break;
                case "Print":
                    System.out.println(customList);
                    break;
            }

            command = scanner.nextLine();
        }

    }
}
