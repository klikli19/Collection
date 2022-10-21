package HW8.task1.driver;
import HW8.task1.Mechanic;
import HW8.task1.Transport;

import java.util.List;

public abstract class Driver<D extends Transport> {
    private final String name;
    private String driversLicense;
    private Double drivingExperience;



    public Driver(String name, String driversLicense, Double drivingExperience) {
        this.name = name;
        setDriversLicense(driversLicense);
        setDrivingExperience(drivingExperience);
    }

    public String getName() {
        return name;
    }

    public String getDriversLicense() {
        return driversLicense;
    }

    public void setDriversLicense(String driversLicense) {
        this.driversLicense = driversLicense;
    }

    public Double getDrivingExperience() {
        return drivingExperience;
    }

    public void setDrivingExperience(Double drivingExperience) {
        this.drivingExperience = drivingExperience <= 0 ? Double.valueOf("Без стажа вождения") : drivingExperience;
    }

    public abstract void startMove(D transport);

    public abstract void stopMove(D transport);

    public abstract void refill(D transport);

    public abstract void checkDriversLicense();

    @Override
    public String toString() {
        return "Водитель " + name + ", категория прав: " + driversLicense + ", стаж вождения: " + drivingExperience + " лет.";
    }
}
