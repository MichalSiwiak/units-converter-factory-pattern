package net.coffeecoding.units;

public enum AreaUnits {

    SQUARE_METER(1),
    SQUARE_KILOMETER(1000000),
    SQUARE_CENTIMETER(0.0001),
    SQUARE_MILLIMETER(0.000001),
    SQUARE_MICROMETER(0.000000000001),
    HECTARE(10000),
    SQUARE_MILE(2589990),
    SQUARE_YARD(0.83612736),
    SQUARE_FOOT(0.09290304),
    SQUARE_INCH(0.00064516),
    ACRE(4046.8564224);

    private double value;

    AreaUnits(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
