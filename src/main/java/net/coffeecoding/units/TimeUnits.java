package net.coffeecoding.units;

public enum TimeUnits {
    SECOND(1),
    MILLISECOND(0.001),
    MICROSECOND(0.000001),
    NANOSECOND(0.000000001),
    PICOSECOND(0.000000000001),
    MINUTE(60),
    HOUR(3600),
    DAY(86400),
    WEEK(604800),
    MONTH(2629800),
    YEAR(31557600);


    private double value;

    TimeUnits(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

}
