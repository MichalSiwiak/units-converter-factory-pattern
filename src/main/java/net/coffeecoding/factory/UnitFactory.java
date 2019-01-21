package net.coffeecoding.factory;

import net.coffeecoding.measures.Measures;
import java.util.*;

public class UnitFactory {

    private double quantity;
    private String measure;
    private String unit;

    private List<String> measures;
    private Map<String, Double> unitsOfMeasure;
    private Map<String, Double> calculatedUnitsOfMeasure;

    public UnitFactory(double quantity, String measure, String unit) {

        this.quantity = quantity;
        this.measure = measure;
        this.unit = unit;

        measures = new ArrayList<>();
        for (Measures measuresConstant : Measures.values()) {
            measures.add(measuresConstant.toString());
        }

        calculateUnit(quantity, measure, unit);
    }

    private void calculateUnit(double quantity, String measure, String unit) {
        this.quantity = quantity;
        this.measure = measure;
        this.unit = unit;

        try {
            unitsOfMeasure = Measures.valueOf(measure).getValuesOfUnits();
            calculatedUnitsOfMeasure = new HashMap<>();
            Double temp = unitsOfMeasure.get(unit) * quantity;
            for (String key : unitsOfMeasure.keySet()) {
                calculatedUnitsOfMeasure.put(key, temp / unitsOfMeasure.get(key));
            }
        } catch (NullPointerException e) {
            System.out.println("Bad unit of measure");
        }
    }


    public void setQuantity(double quantity) {
        this.quantity = quantity;
        calculateUnit(quantity, measure, unit);
    }

    public void setMeasure(String measure) {
        this.measure = measure;
        unit = Measures.valueOf(measure).getDefaultValue().toString();
        calculateUnit(quantity, measure, unit);
    }

    public void setUnit(String unit) {
        this.unit = unit;
        calculateUnit(quantity, measure, unit);
    }

    public double getQuantity() {
        return quantity;
    }

    public String getMeasure() {
        return measure;
    }

    public String getUnit() {
        return unit;
    }

    public List<String> getMeasures() {
        return measures;
    }

    public List<String> getUnitsOfMeasure() {
        List<String> unitsOfMeasureList = new ArrayList<>();
        for (String key : unitsOfMeasure.keySet()) {
            unitsOfMeasureList.add(key);
        }


        return unitsOfMeasureList;
    }

    public Map<String, Double> getCalculatedUnitsOfMeasure() {
        return calculatedUnitsOfMeasure;
    }

    @Override
    public String toString() {
        return "UnitFactory{" +
                "quantity=" + quantity +
                ", measure='" + measure + '\'' +
                ", unit='" + unit + '\'' +
                ", measures=" + measures +
                ", unitsOfMeasure=" + unitsOfMeasure +
                ", calculatedUnitsOfMeasure=" + calculatedUnitsOfMeasure +
                '}';
    }
}
