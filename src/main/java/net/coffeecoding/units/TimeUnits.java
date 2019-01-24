package net.coffeecoding.units;

public enum TimeUnits {
    HOUR(60 * 60),
    DAY(24 * 60 * 60),
    YEAR(DAY.getValue() * 365),
    MINUTE(60),
    SECOND(1);

    private double value;

    TimeUnits(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

}
