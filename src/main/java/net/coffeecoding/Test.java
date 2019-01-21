package net.coffeecoding;

import net.coffeecoding.factory.Unit;
import net.coffeecoding.factory.UnitFactory;

import java.util.Map;

public class Test {

    public static void main(String[] args) {


        UnitFactory unitFactory = new UnitFactory(5, "Mass", "TON");
        Map<String, Double> otherUnits = unitFactory.getCalculatedUnitsOfMeasure();
        //System.out.println(unitFactory);
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














      /*  Unit unit = new UnitFactory(10, "Length", "MILA");
        Map<String, Double> stringDoubleMap = unit.createOtherUnits();
        System.out.println(unit.toString());*/
        /*unit.setMeasure("Mass");
        System.out.println(unit.toString());
        System.out.println(((UnitFactory) unit).getUnitsFromMeasure());

        Map<String, Map<String, Double>> measures = null;

        measures.put("Mass", Arrays.asList(MassUnits.values()).stream().
                collect(Collectors.toMap(MassUnits::toString, MassUnits::getValue)));


        Map collect = Arrays.asList(MassUnits.values()).stream().collect(Collectors.toMap(2, 2, TreeMap::new));

*/
       /* Map<String, Map<String, Double>> measures = new TreeMap<>();
        measures.put("Mass", Arrays.asList(MassUnits.values()).stream().
                collect(Collectors.toMap(MassUnits::toString, MassUnits::getValue)));
        System.out.println(measures);*/

    }
}