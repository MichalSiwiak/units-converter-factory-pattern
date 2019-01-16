package units;

public enum TimeUnits implements UnitValue {
    GODZINA(1),
    DZIEN(24),
    ROK(8760);

    TimeUnits(double value) {
        this.value = value;
    }
    private double value;
    public double getValue() {
        return value;
    }
}
