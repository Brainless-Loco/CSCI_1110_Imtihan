import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        ArrayList<Car> cars = new ArrayList<>();
        ArrayList<CarModel> carModels = new ArrayList<>();

        String whatToDo,modelName;
        double fuelEconomy,tankCapacity,distance;
        int plateNumber,i,SIZE;
        boolean finish=false;

        Car car=null;

        while(finish==false){
            whatToDo = input.next();
            switch (whatToDo){
                case "MODEL":
                    modelName = input.next();
                    fuelEconomy = input.nextDouble();
                    tankCapacity = input.nextDouble();

                    CarModel carModel = new CarModel(modelName, fuelEconomy, tankCapacity);
                    carModels.add(carModel);
                    break;
                case "CAR":
                    modelName = input.next();
                    plateNumber = input.nextInt();
                    SIZE=carModels.size();
                    for(i=0;i<SIZE;i++){
                        if (carModels.get(i).getModelName().equals(modelName)) {
                            car = new Car(plateNumber, carModels.get(i));
                            cars.add(car);
                            break;
                        }
                    }
                    break;
                case "TRIP":
                    plateNumber = input.nextInt();
                    distance = input.nextDouble();

                    SIZE=cars.size();
                    for(i=0;i<SIZE;i++){
                        if (cars.get(i).getPlateNumber() == plateNumber) {
                            car = cars.get(i);
                            break;
                        }
                    }
                    if (car.makeATrip(distance)) {
                        System.out.printf("Trip completed successfully for #%d\n",car.getPlateNumber());
                    }
                    else {
                        System.out.printf("Not enough fuel for #%d\n",car.getPlateNumber());
                    }
                    break;
                case "REFILL":
                    plateNumber = input.nextInt();
                    SIZE=cars.size();
                    for(i=0;i<SIZE;i++){
                        if (cars.get(i).getPlateNumber() == plateNumber) {
                            car = cars.get(i);
                            car.refill();
                            break;
                        }
                    }
                    break;
                case "LONGTRIPS":
                    plateNumber = input.nextInt();
                    distance = input.nextDouble();

                    SIZE=cars.size();

                    for(i=0;i<SIZE;i++){
                        if (cars.get(i).getPlateNumber() == plateNumber) {
                            car = cars.get(i);
                            System.out.printf("#%d made %d trips longer than ",plateNumber,car.getNoOfLongTrips(distance),distance);
                            if(distance==Math.ceil(distance)){
                                System.out.printf("%d\n",(int)distance);
                            }
                            else{
                                System.out.printf("%.2f\n",distance);
                            }
                            break;
                        }
                    }
                    break;
                case "FINISH":
                    finish = true;
                    break;
            }
        }
    }
}
