package HW8.task1;


import HW8.task1.driver.DriverBus;
import HW8.task1.driver.DriverCar;
import HW8.task1.driver.DriverTruck;
import HW8.task1.Mechanic;

import java.util.List;

public class Main {
    public static void main(String[] args) throws CantDiagnosticException {

        Car audi = new Car("Audi", "A8", 2.5, BodyTypeCar.SEDAN);
        Car bmw = new Car("BMW", "5s", 3.0, BodyTypeCar.CROSSOVER);
        Car kia = new Car("Kia", "S4", 1.8, BodyTypeCar.SUV);
        Car lada = new Car("Lada", "Granta", 1.6, null);
//        kia.determineTypeOfCar();
//        lada.determineTypeOfCar();
//        audi.determineTypeOfCar();
//        bmw.determineTypeOfCar();
//        System.out.println();

        Bus schoolBus = new Bus("Школьный", "Ш-1", 2.0, CapacityTypeBus.SMALL);
        Bus workBus = new Bus("Рабочий", "В-2", 1.2, null);
        Bus cityBus = new Bus("Городской", "Г-14", 3.0, CapacityTypeBus.LARGE);
        Bus touristBus = new Bus("Туристический", "Т-11", 3.5, CapacityTypeBus.ESPECIALLY_LARGE);
//        schoolBus.determineTypeOfBus();
//        touristBus.determineTypeOfBus();
//        workBus.determineTypeOfBus();
//        cityBus.determineTypeOfBus();
//        System.out.println();

        Truck kamaz = new Truck("KamAZ", "K-10", 2.6, LoadTypeTruck.N1);
        Truck zil = new Truck("ZIL", "M-2", 2.0, LoadTypeTruck.N2);
        Truck ural = new Truck("URAL", "Y-4", 3.0, LoadTypeTruck.N3);
        Truck gaz = new Truck("GAZ", "G-6", 3.0, null);
//        zil.determineTypeOfTtuck();
//        gaz.determineTypeOfTtuck();
//        kamaz.determineTypeOfTtuck();
//        ural.determineTypeOfTtuck();

        DriverCar vasya = new DriverCar("Вася", "B", 1.0);
        DriverTruck alesha = new DriverTruck("Алеша", "C", 15.0);
        DriverBus misha = new DriverBus("Миша", null, 7.5);

//      alesha.checkDriversLicense();
//      checkDiagnostic(audi, zil, gaz, cityBus);



        Mechanic<Transport> vasiliy = new Mechanic<>("Сидоров Вася", TypeOfTransport.ALL_TRANSPORT);
        Mechanic<Car> dima = new Mechanic<>("Данилов Дмитрий", TypeOfTransport.CAR);
        dima.getCompany().add(Sponsor.RED_BULL);
        List<Transport> race1 = List.of(audi,bmw,lada, cityBus, touristBus, workBus, gaz, ural, kamaz);

        System.out.println(race1.size());
        audi.getSponsors().add(Sponsor.RED_BULL);
        audi.getSponsors().add(Sponsor.MARLBORO);
        audi.getSponsors().add(Sponsor.SHELL);
        audi.getMechanics().add(vasiliy);
        audi.getMechanics().add(dima);
        System.out.println(audi.getMechanics().size());
        System.out.println(audi.getSponsors().size());
        audi.printAllInfoOfTransport();

        ServiceStation<Transport> transportServiceStation1 = new ServiceStation<>();
        transportServiceStation1.addTransport(bmw);
        transportServiceStation1.addTransport(ural);
        transportServiceStation1.carryOutTechnicalInspection();
    }

    public static boolean checkDiagnostic(Transport ... transports) throws CantDiagnosticException {
        int count = 1;
            try {
                for (Transport transport : transports) {
                    transport.diagnostic();
                    count++;
                }
            } catch (CantDiagnosticException e) {
                System.out.println("Обнаружена ошибка:" );
                System.out.println(e.getMessage());
            } finally {
                System.out.println(count);
            }
        return false;
    }
}
