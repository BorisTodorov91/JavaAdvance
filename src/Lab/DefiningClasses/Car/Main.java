package Lab.DefiningClasses.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());


        List<Car> cars = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String[] data = input.split("\\s+");

            String brand = data[0];

            if (data.length == 1) {
                Car car = new Car(brand);
                cars.add(car);

            } else {
                String mode = data[1];
                int hp = Integer.parseInt(data[2]);
                Car car = new Car(brand, mode, hp);
                cars.add(car);
            }
        }


        cars.forEach(Car::carInfo);

    }
}
