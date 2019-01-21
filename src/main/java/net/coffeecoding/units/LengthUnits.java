package net.coffeecoding.units;

public enum LengthUnits   {
    METR(1),
    KILOMETR(1000),
    MILE(1600);

    private double value;
    LengthUnits( double value) {
        this.value = value;
    }
    public double getValue() {
        return value;
    }
}
