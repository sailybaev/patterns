package Factory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String cartype = scan.next();
        CarFactory carFactory = carSelector(cartype);
        Car car = carFactory.createCar();

        car.drive();
    }

    public static CarFactory carSelector(String type) {
        if(type.equalsIgnoreCase("sport")){
            return new KoenigseggFactory();
        }
        else if(type.equalsIgnoreCase("offroad")){
            return new RAMFactory();
        }
        else if(type.equalsIgnoreCase("casual")){
            return new LadaFactory();
        }
        else{
            System.out.println("INVALID TYPE");
        }

        return null;
    }
}