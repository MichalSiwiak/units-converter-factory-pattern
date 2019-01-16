package units;

public enum LengthUnits implements UnitValue {
    METR(1),
    KILOMETR(1000),
    MILA(1600);

    LengthUnits(double value) { this.value = value;}
    private double value;
    public double getValue() {
        return value;
    }

}
