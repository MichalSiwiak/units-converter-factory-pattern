package net.coffeecoding.units;

public enum MassUnits {

    KILOGRAM(1),
    GRAM(0.001),
    MILLIGRAM(0.000001),
    CETNAR(50),
    TON(1000),
    DRACHMA(0.0043),
    POUND(0.45359237),
    GRAN(0.00006479891),
    CARAT(0.0002),
    QUINTAL(100),
    OUNCE(0.0283495231);

    private double value;
    MassUnits(double value) {
        this.value = value;
    }
    public double getValue() {
        return value;
    }
}
