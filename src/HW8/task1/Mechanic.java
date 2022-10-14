package HW8.task1;

import java.util.ArrayList;
import java.util.List;

public class Mechanic<M extends Transport> {
    private final String name;
    private final List<Sponsor> company;
    private TypeOfTransport typeOfTransport;


    private final List<Transport> transports;

    public Mechanic(String name, TypeOfTransport typeOfTransport) {
        this.name = name;
        setTypeOfTransport(typeOfTransport);
        this.company = new ArrayList<>();
        this.transports = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Sponsor> getCompany() {

        return company;
    }

    public List<Transport> getTransports() {
        return transports;
    }

    public void setTypeOfTransport(TypeOfTransport typeOfTransport) {
        if (typeOfTransport == null) {
            throw new RuntimeException("Не указан вид транспорта, который обслуживает механие");
        } else {
            this.typeOfTransport = typeOfTransport;
        }
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
                ", вид транспорта =" + typeOfTransport +
                '}';
    }


}
