package net.coffeecoding.units;

public enum TemperatureUnits {
    CELSIUS(1),
    KELVIN(-272.15),
    FAHRENHEIT(-17.222222222);



    private double value;

    TemperatureUnits(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

}
