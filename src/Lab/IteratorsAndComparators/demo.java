package Lab.IteratorsAndComparators;

public class demo {

    public static void main(String[] args) {
        Car car = new Car();

        addFuel(car);

        System.out.println(car.fuel);
    }

    public static void addFuel(Car... cars) {

        for (Car car : cars) {
            car.fuel += 10;
        }
    }

    public static class Car {
        int year;
        int fuel;

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }
    }
}
