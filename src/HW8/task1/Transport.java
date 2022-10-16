package HW8.task1;


import HW8.task1.driver.Driver;

import java.util.ArrayList;
import java.util.List;

public abstract class Transport implements Competing {
    private final String brand;
    private final String model;
    private Double engineVolume;

    private List<Sponsor<?>> sponsors = new ArrayList<>();

    private List<Transport> race = new ArrayList<>();

    private List<Mechanic<?>> mechanics = new ArrayList<>();

    private List<Driver<?>> drivers = new ArrayList<>();



    public Transport(String brand, String model, Double engineVolume) {
        this.brand = brand;
        this.model = model;
        setEngineVolume(engineVolume);
        this.sponsors = new ArrayList<>();
        this.mechanics = new ArrayList<>();
    }

    public List<Transport> getRace() {
        return race;
    }

    public List<Driver<?>> getDrivers() {
        return drivers;
    }

    public List<Mechanic<?>> getMechanics() {
        return mechanics;
    }
    public List<Sponsor<?>> getSponsors() {
        return sponsors;
    }

    public List<Transport> getTransports() {
        return race;
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
