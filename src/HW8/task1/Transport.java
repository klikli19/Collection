package HW8.task1;


import HW8.task1.driver.Driver;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class Transport implements Competing {
    private final String brand;
    private final String model;
    private Double engineVolume;

    private Set<Sponsor<?>> sponsors = new HashSet<>();

    private Set<Transport> race = new HashSet<>();

    private Set<Mechanic<?>> mechanics = new HashSet<>();

    private Set<Driver<?>> drivers = new HashSet<>();



    public Transport(String brand, String model, Double engineVolume) {
        this.brand = brand;
        this.model = model;
        setEngineVolume(engineVolume);
        this.sponsors = new HashSet<>();
        this.mechanics = new HashSet<>();
    }

    public Set<Sponsor<?>> getSponsors() {
        return sponsors;
    }

    public Set<Transport> getRace() {
        return race;
    }

    public Set<Mechanic<?>> getMechanics() {
        return mechanics;
    }

    public Set<Driver<?>> getDrivers() {
        return drivers;
    }

    public String getBrand() {
        return brand;
    }


    public String getModel() {
        return model;
    }


    public Double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(Double engineVolume) {
         this.engineVolume = engineVolume <=0 ? 1.5 : engineVolume;
    }

    public abstract void startMoving();

    public abstract void finishMoving();



    public void infoOfVehicle() {
        System.out.println("Информация о транспортном средстве:");
    }

    public boolean diagnostic() throws CantDiagnosticException {
        return false;
    }



    public void printAllInfoOfTransport() {
        System.out.println("У авто " + brand + model + " имеются спонсоры: " + getSponsors() + ", механики: " + getMechanics() + ", водители: " + getDrivers());
    }


    @Override
    public String toString() {
        return "Транспортное средство {" +
                "марка='" + brand + '\'' +
                ", модель='" + model + '\'' +
                ", объем двигателя='" + engineVolume + '\'' +
                '}' + "\n";
    }

    public boolean carryOutTechnicalInspection() {
        return Math.random() < 0.5;
    }
}
