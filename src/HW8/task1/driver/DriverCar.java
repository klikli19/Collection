package HW8.task1.driver;
import HW8.task1.Car;

import java.util.Objects;

public class DriverCar extends Driver<Car> {

    public DriverCar(String name, String  driversLicense, Double drivingExperience) {
        super(name, driversLicense, drivingExperience);
    }


    @Override
    public void startMove(Car transport) {
        System.out.println("Водитель " + getName() + " участвует в заезде. Начал движение на автомобиле "
                + transport.getBrand() + " " + transport.getModel() + ".");
    }

    @Override
    public void stopMove(Car transport) {
        System.out.println("Водитель " + getName() + " остановился на автомобиле " + transport.getBrand() + " "
                + transport.getModel() + "." );
    }

    @Override
    public void refill(Car transport) {
        System.out.println("Водитель " + getName() + " заправил автомобиль " + transport.getBrand() + " "
                + transport.getModel() + "." );
    }

    @Override
    public void checkDriversLicense() {
        if (getDriversLicense() == null || getDriversLicense().isBlank() || !Objects.equals(getDriversLicense(), "B")){
            throw new RuntimeException("Необходимо указать тип прав!");

        } else {
            System.out.println("Категория прав у водителя " + getName() + " соответствует.");
        }

    }

}
