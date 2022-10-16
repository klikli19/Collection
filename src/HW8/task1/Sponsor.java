package HW8.task1;

public class Sponsor<T extends Transport> {
    private final String name;
    private Integer supportAmount;

    public Sponsor(String name, Integer supportAmount) {
        this.name = name;
        setSupportAmount(supportAmount);
    }

    public String getName() {
        return name;
    }

    public int getSupportAmount() {
        return supportAmount;
    }

    public void setSupportAmount(Integer supportAmount) {
        if (supportAmount == null || supportAmount < 0 ) {
            supportAmount = Integer.valueOf("Не указана сумма взноса");
        } else {
            this.supportAmount = supportAmount;
        }
    }

    public void infoSponsorRace(T sponsor) {
        System.out.println(sponsor + " спонсирует заезд транспортного средства " + sponsor.getBrand() + " "
                + sponsor.getModel() + ". Сумма поддержки составляет " + supportAmount + " рублей.");
    }

    @Override
    public String toString() {
        return "Sponsor{" +
                "name='" + name + '\'' +
                ", supportAmount=" + supportAmount +
                '}';
    }
}
