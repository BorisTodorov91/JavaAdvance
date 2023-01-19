package Exercice.DefiningClass.P05CarSalesman;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfEngine = Integer.parseInt(scanner.nextLine());
        List<Engine> engineList = new ArrayList<>();

        for (int i = 0; i < numOfEngine; i++) {
            String[] inputData = scanner.nextLine().split("\\s+");

            Engine engine = null;

            String engineModel = inputData[0];
            int enginePower = Integer.parseInt(inputData[1]);

            switch (inputData.length) {

                case 4:
                    String engineDisplacement = inputData[2];
                    String engineEfficient = inputData[3];
                    engine = new Engine(engineModel, enginePower, engineDisplacement, engineEfficient);
                    break;

                case 3:
                    if (Character.isLetter(inputData[2].charAt(0))) {
                        String engineEfficiency = inputData[2];
                        engine = new Engine(engineModel, enginePower);
                        engine.setEngineEfficiency(engineEfficiency);
                        engine.setEngineDisplacement("n/a");
                    } else {
                        String displacement = inputData[2];
                        engine = new Engine(engineModel, enginePower);
                        engine.setEngineDisplacement(displacement);
                        engine.setEngineEfficiency("n/a");
                    }
                    break;
                case 2:
                    engine = new Engine(engineModel, enginePower);
            }

            engineList.add(engine);
        }

        int numOfCar = Integer.parseInt(scanner.nextLine());

        List<CarSalesman> listOfCar = new ArrayList<>();
        for (int i = 0; i < numOfCar; i++) {
            String[] inputDataForCar = scanner.nextLine().split("\\s+");

            String carModel = inputDataForCar[0];
            String carEngine = inputDataForCar[1];

            CarSalesman carSalesman = null;

            Engine currentEngine = engineList.stream().filter(engine1 -> engine1.getEngineModel().equals(carEngine)).findFirst().get();

            switch (inputDataForCar.length) {
                case 4:
                    String carWeight = inputDataForCar[2];
                    String carColor = inputDataForCar[3];
                    carSalesman = new CarSalesman(carModel, currentEngine, carWeight, carColor);
                    break;
                case 3:
                    String token = inputDataForCar[2];

                    if (!Character.isLetter(token.charAt(0))) {
                        carSalesman = new CarSalesman(carModel, currentEngine);
                        carSalesman.setCarWeight(token);
                        carSalesman.setCarColor("n/a");
                    } else {
                        carSalesman = new CarSalesman(carModel, currentEngine);
                        carSalesman.setCarColor(token);
                        carSalesman.setCarWeight("n/a");
                    }
                    break;
                case 2:
                    carSalesman = new CarSalesman(carModel, currentEngine);
                    break;
            }
            listOfCar.add(carSalesman);
        }

        listOfCar.forEach(System.out::println);
        //System.out.println(engineList);
    }
}
