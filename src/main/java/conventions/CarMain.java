package conventions;

import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Car type: ");
        String carType = sc.nextLine();

        System.out.print("Model: ");
        String model = sc.nextLine();

        System.out.print("Engine type: ");
        String engineType = sc.nextLine();

        System.out.print("Doors: ");
        int doors = sc.nextInt();

        System.out.print("Persons: ");
        int persons = sc.nextInt();

        Car car = new Car(carType,engineType,doors,persons);
        car.addModelName(model);
        System.out.print(car.getCarType() + " " + car.getEngineType() + " " + car.getDoors() + "(door) " + car.getPersons() + "(person)");
    }
}
