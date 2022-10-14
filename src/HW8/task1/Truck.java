package HW8.task1;

import java.time.LocalDate;
import java.time.Month;

public class Truck extends Transport implements Competing {

    private LoadTypeTruck loadTypeTruck;
    public Truck(String brand, String model, Double engineVolume, LoadTypeTruck loadTypeTruck) {
        super(brand, model, engineVolume);
        this.loadTypeTruck = loadTypeTruck;
    }

    public LoadTypeTruck getLoadTypeTruck() {
        return loadTypeTruck;
    }

    public void setLoadTypeTruck(LoadTypeTruck loadTypeTruck) {
        this.loadTypeTruck = loadTypeTruck;
    }

    public void determineTypeOfTtuck() {
        if (loadTypeTruck != null) {
            switch (loadTypeTruck) {
                case N1:
                    System.out.println("У грузовика " + getBrand() + " " + getModel() + " грузоподъемность до 3,5 тонн");
                    break;
                case N2:
                    System.out.println("У грузовика " + getBrand() + " " + getModel() + " грузоподъемность свыше 3,5 до 12 тонн");
                    break;
                case N3:
                    System.out.println("У грузовика " + getBrand() + " " + getModel() + " грузоподъемность свыше 12 тонн");
                    break;

                default:
                    System.out.println("Нет информации");
            }
        } else {
            System.out.println("Данных недостаточно");
        }
    }
    @Override
    public void startMoving() {
        System.out.println("Грузовик начал движение с грузом");
    }

    @Override
    public void finishMoving() {
        System.out.println("Грузовик привез груз в пункт назначения");
    }

    @Override
    public void pitStop() {
        System.out.println("Грузовик " + getBrand() + " остановился поменять колесо");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Грузовик " + getBrand() + " показал лучшую скорость");
    }

    @Override
    public void bestTime() {
        System.out.println("Грузовик " + getBrand() + " приехал первым");
    }

    @Override
    public boolean diagnostic() throws CantDiagnosticException {
        int month;
        LocalDate localDate = LocalDate.now();
        month = localDate.getMonthValue();
        if (month == 1 || month == 2 || month == 3 || month == 4 || month == 11 || month == 12) {
            System.out.println("Грузовик " + getBrand() + " " + getModel() + " нуждается в смене  резины на зимнюю");
        } else {
            System.out.println("Ставим на грузовик " + getBrand() + " " + getModel() + " летнюю резину.");
        }
        return false;
    }
}
