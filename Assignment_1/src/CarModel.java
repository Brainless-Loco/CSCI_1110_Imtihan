public class CarModel {
    private String name;
    private double fuelEconomy;
    private double tankCapacity;

    public CarModel(String name, double fuelEconomy, double tankCapacity) {
        this.name = name;
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
        return name;
    }
}
