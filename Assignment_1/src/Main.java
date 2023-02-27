import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        ArrayList<CarModel> carModels = new ArrayList<>();
        ArrayList<Car> cars = new ArrayList<>();

        while (true) {
            String command = input.next();

            if (command.equals("MODEL")) {
                String modelName = input.next();
                double fuelEconomy = input.nextDouble();
                double tankCapacity = input.nextDouble();

                CarModel carModel = new CarModel(modelName, fuelEconomy, tankCapacity);
                carModels.add(carModel);
            }
            else if (command.equals("CAR")) {
                String modelName = input.next();
                int plateNumber = input.nextInt();

                for (CarModel carModel : carModels) {
                    if (carModel.getModelName().equals(modelName)) {
                        Car car = new Car(plateNumber, carModel);
                        cars.add(car);
                        break;
                    }
                }
            }
            else if (command.equals("TRIP")) {
                int plateNumber = input.nextInt();
                double distance = input.nextDouble();

                Car car = null;
                for (Car c : cars) {
                    if (c.getPlateNumber() == plateNumber) {
                        car = c;
                        break;
                    }
                }

                if (car.canMakeTrip(distance)) {
                    System.out.printf("Trip completed successfully for #%d\n",car.getPlateNumber());
                }
                else {
                    System.out.printf("Not enough fuel for #%d\n",car.getPlateNumber());
                }
            }
            else if (command.equals("REFILL")) {
                int plateNumber = input.nextInt();

                Car car = null;
                for (Car c : cars) {
                    if (c.getPlateNumber() == plateNumber) {
                        car = c;
                        break;
                    }
                }
                car.refill();
            }
            else if(command.equals("LONGTRIPS")){
                int plateNumber = input.nextInt();
                double distance = input.nextDouble();

                Car car = null;
                for (Car c : cars) {
                    if (c.getPlateNumber() == plateNumber) {
                        car = c;
                        break;
                    }
                }
                System.out.printf("#%d made %d trips longer than %.2f\n",plateNumber,car.getNoOfLongTrips(distance),distance);

            }
            else if (command.equals("FINISH")) {
                break;
            }
        }

        input.close();
    }
}
