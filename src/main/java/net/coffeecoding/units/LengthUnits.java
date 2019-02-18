package net.coffeecoding.units;

public enum LengthUnits {
    METER(1),
    KILOMETER(1000),
    CENTIMETER(0.01),
    MILLIMETER(0.001),
    MICROMETER(0.000001),
    NANOMETER(0.000000001),
    MILE(1609.35),
    YARD(0.9144),
    FOOT(0.3048),
    INCH(0.0254),
    LIGHT_YEAR(9460660000000000L);


    private double value;

    LengthUnits(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}