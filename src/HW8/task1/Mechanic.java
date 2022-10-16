package HW8.task1;

import java.util.ArrayList;
import java.util.List;

public class Mechanic<M extends Transport & Competing> {
    private final String name;
    private final List<Sponsor<?>> company;


    private final List<Transport> transports;

    public Mechanic(String name) {
        this.name = name;
        this.company = new ArrayList<>();
        this.transports = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Sponsor<?>> getCompany() {
        return company;
    }

    public List<Transport> getTransports() {
        return transports;
    }


    public void carryOutMaintenance(M transport) {
        System.out.println("Механик " + name + " провел техобслуживание транспортного средства " + transport.getBrand()
                + transport.getModel() + ".");
    }

    public void fixTransport(M transport) {
        System.out.println("Механик " + name + " починил транспортного средства " + transport.getBrand()
                + transport.getModel() + ".");
    }

    @Override
    public String toString() {
        return "Mechanic {" +
                "Фамилия и имя='" + name + '\'' +
                ", компания =" + company +
                '}';
    }


}
