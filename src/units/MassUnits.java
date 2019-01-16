package units;

public enum MassUnits implements UnitValue {
    KILOGRAM(1),
    CETNAR(50),
    DRACHMA(0.0043),
    OUND(0.45359237),
    GRAN(0.00006479891),
    CARAT(0.0002),
    QUINTAL(100),
    TON(1000),
    OUNCE(0.0283495231);

    MassUnits(double value) { this.value = value;}
    private double value;
    public double getValue() {
        return value;
    }

}
