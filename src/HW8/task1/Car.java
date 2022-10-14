package HW8.task1;

import java.time.LocalDate;
import java.time.Month;

public class Car extends Transport implements Competing {

    private BodyTypeCar bodyTypeCar;


    public Car(String brand, String model, Double engineVolume,  BodyTypeCar bodyTypeCar) {
        super(brand, model, engineVolume);
            this.bodyTypeCar = bodyTypeCar;
    }

    public BodyTypeCar getBodyTypeCar() {
        return bodyTypeCar;
    }

    public void setBodyTypeCar(BodyTypeCar bodyTypeCar) {
        this.bodyTypeCar = bodyTypeCar;
    }

    public void determineTypeOfCar() {
        if (bodyTypeCar != null) {
        switch (bodyTypeCar) {
            case UNIVERSAL:
                System.out.println("У авто " + getBrand() + " " + getModel() + " тип кузова универсал");
                break;
            case HATCHBACK:
                System.out.println("У авто " + getBrand() + " " + getModel() + " тип кузова хэтчбек");
                break;
            case SUV:
                System.out.println("У авто " + getBrand() + " " + getModel() + " тип кузова внедорожник");
                break;
            case VAN:
                System.out.println("У авто " + getBrand() + " " + getModel() + " тип кузова фургон");
                break;
            case SEDAN:
                System.out.println("У авто " + getBrand() + " " + getModel() + " тип кузова седан");
                break;
            case COUPE:
                System.out.println("У авто " + getBrand() + " " + getModel() + " тип кузова купе");
                break;
            case CROSSOVER:
                System.out.println("У авто " + getBrand() + " " + getModel() + " тип кузова кроссовер");
                break;
            case PICKUP:
                System.out.println("У авто " + getBrand() + " " + getModel() + " тип кузова пикап");
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
        System.out.println("Автомобиль начал движение");
    }

    @Override
    public void finishMoving() {
        System.out.println("Автомобиль приехал");
    }


    @Override
    public void pitStop() {
        System.out.println("Автомобиль " + getBrand() + " остановился поменять водителя, заправиться");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Автомобиль " + getBrand() + " имеет лучшую скорость в гонке");
    }

    @Override
    public void bestTime() {
        System.out.println("Автомобиль " + getBrand() + " продемонстрировал лучшее время");
    }

    public boolean diagnostic() throws CantDiagnosticException {
        int month;
        LocalDate localDate = LocalDate.now();
        month = localDate.getMonthValue();
        if (month == 1 || month == 2 || month == 3 || month == 4 || month == 11 || month == 12) {
            System.out.println("Автомобиль " + getBrand() + " " + getModel() + " нуждается в смене  резины на зимнюю");
        } else {
            System.out.println("Ставим на автомобиль " + getBrand() + " " + getModel() + " летнюю резину.");
        }
        return false;
    }

}
