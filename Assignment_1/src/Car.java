import java.util.ArrayList;

public class Car {
    private int plateNumber;
    private CarModel model;
    private double fuelLevel;
    private ArrayList<Double> tripHistory = new ArrayList<>();

    public Car(int plateNumber, CarModel model) {
        this.plateNumber = plateNumber;
        this.model = model;
        this.fuelLevel = model.getTankCapacity();
    }

    public int getPlateNumber() {
        return plateNumber;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public boolean canMakeTrip(double distance) {
        double fuelRequired = (distance / 100)* model.getFuelEconomy();
        if(fuelRequired<=fuelLevel){
            tripHistory.add(distance);
            fuelLevel -= fuelRequired;
            return true;
        }
        return false;
    }

    public void refill() {
        fuelLevel = model.getTankCapacity();
    }

    public int getNoOfLongTrips(double distance){
        int ret=0;
        for(Double trip:tripHistory){
            if(trip>=distance) ret++;
        }
        return ret;
    }
}
