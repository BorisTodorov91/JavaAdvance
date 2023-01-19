package Exercice.DefiningClass.P05CarSalesman;

public class Engine {
    //a model, power, displacement, and efficiency
    private String engineModel;
    private int enginePower;
    private String engineDisplacement; // optional
    private String EngineEfficiency; // optional

    public Engine(String engineModel, int enginePower, String engineDisplacement, String engineEfficiency) {
        this.engineModel = engineModel;
        this.enginePower = enginePower;
        this.engineDisplacement = engineDisplacement;
        EngineEfficiency = engineEfficiency;
    }

    public Engine(String engineModel, int enginePower) {
        this(engineModel, enginePower, "n/a", "n/a");
    }

    public String getEngineModel() {
        return engineModel;
    }

    public void setEngineModel(String engineModel) {
        this.engineModel = engineModel;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public String getEngineDisplacement() {
        return engineDisplacement;
    }

    public void setEngineDisplacement(String engineDisplacement) {
        this.engineDisplacement = engineDisplacement;
    }

    public String getEngineEfficiency() {
        return EngineEfficiency;
    }

    public void setEngineEfficiency(String engineEfficiency) {
        EngineEfficiency = engineEfficiency;
    }
}
