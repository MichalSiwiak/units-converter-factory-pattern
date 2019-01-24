package net.coffeecoding;

import net.coffeecoding.factory.UnitFactory;

import java.util.Map;

public class Test {

    public static void main(String[] args) {


        UnitFactory unitFactory = new UnitFactory(5, "Mass", "TON");
        Map<String, Double> otherUnits = unitFactory.getCalculatedUnitsOfMeasure();

        System.out.println(unitFactory.toString());
        unitFactory.setMeasure("Time");
        System.out.println(unitFactory.toString());

        unitFactory.setQuantity(5);
        System.out.println(unitFactory.toString());

        unitFactory.setUnit("ROK");
        unitFactory.setQuantity(1);
        System.out.println(unitFactory.toString());
        unitFactory.setMeasure("Length");
        System.out.println(unitFactory.toString());

    }
}