package HW8.task1;

public enum Sponsor {
    MARLBORO (10000),
    SHELL (500000),
    PETRONAS (150000),
    METRO (10000000),
    RED_BULL(155000),
    PUMA (200000);

    private int supportAmount;

    Sponsor(int supportAmount) {
        this.supportAmount = supportAmount;
    }

    public int getSupportAmount() {
        return supportAmount;
    }
}
