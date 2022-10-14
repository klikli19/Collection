package HW8.task1;


import HW8.task1.driver.Driver;

import java.util.ArrayList;
import java.util.List;

public abstract class Transport {
    private final String brand;
    private final String model;
    private Double engineVolume;

    private List<Sponsor> sponsors;

    private List<Transport> race;

    private final List<Mechanic> mechanics;

    public List<Mechanic> getMechanics() {
        return mechanics;
    }

    public Transport(String brand, String model, Double engineVolume) {
        this.brand = brand;
        this.model = model;
        setEngineVolume(engineVolume);
        this.mechanics = new ArrayList<>();
        this.sponsors = new ArrayList<>();
    }

    public List<Sponsor> getSponsors() {
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

    public void sponsorRace(Sponsor sponsor) {
        System.out.println(sponsor + " спонсирует заезд транспортного средства " + brand + " " + model
                + ". Сумма поддержки составляет " + sponsor.getSupportAmount() + " рублей.");
    }

    public void printAllInfoOfTransport() {
        System.out.println("у авто " + brand + model + " имеются спонсоры: " + getSponsors() + ", механики: " + getMechanics());
    }


    @Override
    public String toString() {
        return "Транспортное средство {" +
                "марка='" + brand + '\'' +
                ", модель='" + model + '\'' +
                ", объем двигателя='" + engineVolume + '\'' +
                '}' + "\n";
    }
}
