package HW8.task1.driver;
import HW8.task1.Bus;

import java.util.Objects;

public class DriverBus extends Driver<Bus> {
    public DriverBus(String name, String  driversLicense, Double drivingExperience) {
        super(name, driversLicense, drivingExperience);
    }

    @Override
    public void startMove(Bus transport) {
        System.out.println("Водитель " + getName() + " участвует в заезде. Начал движение на автобусе "
                + transport.getBrand() + " " + transport.getModel() + ".");
    }

    @Override
    public void stopMove(Bus transport) {
        System.out.println("Водитель " + getName() + " остановил автобус " + transport.getBrand() + " "
                + transport.getModel() + "." );
    }

    @Override
    public void refill(Bus transport) {
        System.out.println("Водитель " + getName() + " заправил автобус " + transport.getBrand() + " "
                + transport.getModel() + "." );
    }

    @Override
    public void checkDriversLicense() {
        if (getDriversLicense() == null || getDriversLicense().isBlank() || !Objects.equals(getDriversLicense(), "D")){
            throw new RuntimeException("Необходимо указать тип прав!");
        } else {
            System.out.println("Категория прав у водителя " + getName() + " соответствует.");
        }
    }


}
