public class CarModel {
    private String modelName;
    private double fuelEconomy;
    private double tankCapacity;

    public CarModel(String modelName, double fuelEconomy, double tankCapacity) {
        this.modelName = modelName;
        this.fuelEconomy = fuelEconomy;
        this.tankCapacity = tankCapacity;
    }

    public double getFuelEconomy() {
        return fuelEconomy;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public String getModelName() {
        return modelName;
    }
}
