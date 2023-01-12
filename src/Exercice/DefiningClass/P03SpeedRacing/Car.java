package Exercice.DefiningClass.P03SpeedRacing;

public class Car {
    private String model;
    private double fuelAmount;
    private double fuelCostFor1KM;
    private int distanceTraveled;

    public Car(String model, double fuelAmount, double fuelCostFor1KM) {
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.fuelCostFor1KM = fuelCostFor1KM;
        this.distanceTraveled = 0;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getFuelAmount() {
        return fuelAmount;
    }

    public void setFuelAmount(double fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public double getFuelCostFor1KM() {
        return fuelCostFor1KM;
    }

    public void setFuelCostFor1KM(double fuelCostFor1KM) {
        this.fuelCostFor1KM = fuelCostFor1KM;
    }

    public double getDistanceTraveled() {
        return distanceTraveled;
    }

    public void setDistanceTraveled(int distanceTraveled) {
        this.distanceTraveled = distanceTraveled;
    }

    //methods
    public double calculateRequaredFuel(int distance) {
        return this.fuelCostFor1KM * distance;
    }

    public boolean hasEnoughFuel(int distance) {
        return this.fuelAmount >= calculateRequaredFuel(distance);
    }

    public void drive(int distance) {
        if (hasEnoughFuel(distance)) {
            this.fuelAmount -= calculateRequaredFuel(distance);
            this.distanceTraveled += distance;
        } else {
            System.out.println("Insufficient fuel for the drive");
        }
    }

    @Override
    public String toString() {
        return String.format("%s %.2f %d", this.model, this.fuelAmount, this.distanceTraveled);
    }
}
