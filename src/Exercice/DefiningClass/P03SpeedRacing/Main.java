package Exercice.DefiningClass.P03SpeedRacing;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int numOfCar = Integer.parseInt(scanner.nextLine());
        Map<String, Car> stringCarMap = new LinkedHashMap<>();
        for (int i = 0; i < numOfCar; i++) {
            String[] carData = scanner.nextLine().split("\\s+");

            String carModel = carData[0];
            double carFoulAmount = Double.parseDouble(carData[1]);
            double carFuelCostFor1KM = Double.parseDouble(carData[2]);


            Car car = new Car(carModel, carFoulAmount, carFuelCostFor1KM);

            stringCarMap.put(carModel, car);


        }

        String command = scanner.nextLine();
        while (!command.equals("End")) {
            String[] commandParts = command.split("\\s+");

            String model = commandParts[1];
            int distance = Integer.parseInt(commandParts[2]);

            Car carToDrive = stringCarMap.get(model);
            carToDrive.drive(distance);

            command = scanner.nextLine();
        }
        stringCarMap.values().forEach(System.out::println);

    }
}
