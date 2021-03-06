package ro.siit.homework03;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Logan car = new Logan("asnfuwansjsas", 19, 45, "Diesel", 38, 6, 8.2);
        Vehicle vehicle = new Passat("asdnwuabsudb", 17, 50, "Petrol", 45, 5, 7.8);
        Car logan = new Logan("gkjseg58sfsds", 16, 40, "Petrol", 30, 5, 6.5);
        Car duster = new Duster("gkhkrrjshhd", 17, 45, "Diesel", 45, 6, 9);
        Car passat = new Passat("hitjsuc58js54s", 18, 42, "Diesel", 35, 5, 8.5);
        Car golf = new Golf("kghyrysdnjsd", 16, 40, "Petrol", 45, 5, 6);

        //Car newCar = new Car();
        //Dacia newDacia = new Dacia();

        List<Car> cars = new ArrayList<>();
        cars.add(car);
        cars.add((Car)vehicle);
        cars.add(logan);
        cars.add(duster);
        for (Car car1 : cars) {
            if(car1 instanceof Car){
                car1.start();
            }
        }

        car.start();
        car.drive(100);
        car.shiftGear(1);
        car.stop();
        vehicle.start();
        vehicle.drive(50);

        Car dacia = (Car) vehicle;

        dacia.shiftGear(7);
        dacia.stop();

        System.out.println(dacia.getAvailableFuel());
        System.out.println(car.getAvailableFuel());
    }
}
