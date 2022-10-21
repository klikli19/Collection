package HW8.task1;

import java.time.Month;

public class Bus extends Transport implements Competing {

    private CapacityTypeBus capacityTypeBus;
    public Bus(String brand, String model, Double engineVolume, CapacityTypeBus capacityTypeBus) {
        super(brand, model, engineVolume);
        this.capacityTypeBus = capacityTypeBus;
    }

    public CapacityTypeBus getCapacityTypeBus() {
        return capacityTypeBus;
    }

    public void setCapacityTypeBus(CapacityTypeBus capacityTypeBus) {
        this.capacityTypeBus = capacityTypeBus;
    }
    public void determineTypeOfBus() {
        if (capacityTypeBus != null) {
            switch (capacityTypeBus) {
                case EXTRA_SMALL:
                    System.out.println("У автобуса " + getBrand() + " " + getModel() + " вместимость до 10 мест");
                    break;
                case SMALL:
                    System.out.println("У автобуса " + getBrand() + " " + getModel() + " вместимость до 25 мест");
                    break;
                case MEDIUM:
                    System.out.println("У автобуса " + getBrand() + " " + getModel() + " вместимость 40-50 мест");
                    break;
                case LARGE:
                    System.out.println("У автобуса " + getBrand() + " " + getModel() + " вместимость 60-80 мест");
                    break;
                case ESPECIALLY_LARGE:
                    System.out.println("У автобуса " + getBrand() + " " + getModel() + " вместимость 100-120 мест");
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
        System.out.println("Автобус отправился от остановки");
    }

    @Override
    public void finishMoving() {
        System.out.println("Автобус прибыл на конечную остановку");
    }

    @Override
    public void pitStop() {
        System.out.println("Автобус " + getBrand() + " остановился на дозаправку");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Автобус " + getBrand() + " ехал быстрее всех");
    }

    @Override
    public void bestTime() {
        System.out.println("Автобус " + getBrand() + " проказал лучшее время в заезде");
    }

    @Override
    public boolean diagnostic() throws CantDiagnosticException {
        throw new CantDiagnosticException("Автобус " + getBrand() + " " + getModel() + " в диагностике не требуется");
    }
}