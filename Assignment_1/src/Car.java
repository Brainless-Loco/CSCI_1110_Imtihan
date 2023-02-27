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

    public boolean makeATrip(double distance) {
        double requiredFuel = (distance* model.getFuelEconomy())/100.00;
        if(requiredFuel<=fuelLevel){
//            System.out.println(requiredFuel+" "+ fuelLevel);
            tripHistory.add(distance);
            fuelLevel -= requiredFuel;
            return true;
        }
        return false;
    }

    public void refill() {
        fuelLevel = model.getTankCapacity();
    }

    public int getNoOfLongTrips(double distance){
        int ret=0,SIZE = tripHistory.size(),i;
        for(i=0;i<SIZE;i++){
            if(tripHistory.get(i)>=distance) ret++;
        }
        return ret;
    }
}
