import factory.UnitFactory;
import units.MassUnits;
import factory.Unit;

import java.util.Map;

public class Test {

    public static void main(String[] args) {
        Unit unit = new UnitFactory<>(10, MassUnits.CARAT);
        Map<String, Double> stringDoubleMap = unit.createOtherUnits();
        System.out.println(stringDoubleMap.toString());
    }
}
