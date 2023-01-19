package Exercice.DefiningClass.P05CarSalesman;

public class CarSalesman {
    //a model, engine, weight, and color
    private String carModel;
    private Engine carEngine;
    private String carWeight; // optional;
    private String carColor; // optional;

    public CarSalesman(String carModel, Engine carEngine, String carWeight, String carColor) {
        this.carModel = carModel;
        this.carEngine = carEngine;
        this.carWeight = carWeight;
        this.carColor = carColor;
    }

    public CarSalesman(String carModel, Engine carEngine) {
        this(carModel, carEngine, "n/a", "n/a");

    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public Engine getCarEngine() {
        return carEngine;
    }

    public void setCarEngine(Engine carEngine) {
        this.carEngine = carEngine;
    }

    public String getCarWeight() {
        return carWeight;
    }

    public void setCarWeight(String carWeight) {
        this.carWeight = carWeight;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }


    @Override
    public String toString() {
        return String.format("%s:%n%s:%n Power: %d%n Displacement: %s%n Efficiency: %s%n Weight: %s%n Color: %s", this.carModel, this.carEngine.getEngineModel(),
                this.carEngine.getEnginePower(), this.carEngine.getEngineDisplacement(), this.carEngine.getEngineEfficiency(), this.carWeight, this.carColor);
    }
}
