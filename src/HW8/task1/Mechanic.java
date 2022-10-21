package HW8.task1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Mechanic<M extends Transport & Competing> {
    private final String name;
    private final Set<Sponsor<?>> company;


    private final Set<Transport> transports;

    public Mechanic(String name) {
        this.name = name;
        this.company = new HashSet<>();
        this.transports = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public Set<Sponsor<?>> getCompany() {
        return company;
    }

    public Set<Transport> getTransports() {
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
