package factory;
import units.*;

import java.util.HashMap;
import java.util.Map;

public class UnitFactory<T extends Enum<T> & UnitValue> implements Unit {

    private double quantity;
    private T unit;
    private Map<String, Double> unitsMap;

    public UnitFactory(double value, T unit) {
        this.quantity = value;
        this.unit = unit;
        unitsMap = new HashMap<>();

        if (unit.getClass().equals(MassUnits.class)) {
            for (MassUnits massUnits : MassUnits.values()) {
                this.unitsMap.put(massUnits.toString(), massUnits.getValue());
            }
        } else if (unit.getClass().equals(TimeUnits.class)) {
            for (TimeUnits timeUnits : TimeUnits.values()) {
                this.unitsMap.put(timeUnits.toString(), timeUnits.getValue());
            }
        } else if (unit.getClass().equals(LengthUnits.class)) {
            for (LengthUnits lengthUnits : LengthUnits.values()) {
                this.unitsMap.put(lengthUnits.toString(), lengthUnits.getValue());
            }
        }
    }

    @Override
    public Map<String, Double> createOtherUnits() {

        Map<String, Double> productMap = new HashMap<>();
        Double temp = unitsMap.get(unit.toString()) * quantity;
        Enum[] enumConstants = unit.getClass().getEnumConstants();
        for (Enum enumConstant : enumConstants) {
            productMap.put(enumConstant.toString(), temp / unitsMap.get(enumConstant.toString()));
        }
        return productMap;
    }
}
