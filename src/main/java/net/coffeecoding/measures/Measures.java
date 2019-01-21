package net.coffeecoding.measures;

import net.coffeecoding.units.LengthUnits;
import net.coffeecoding.units.MassUnits;
import net.coffeecoding.units.TimeUnits;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public enum Measures {

    Mass() {
        @Override
        public Map<String, Double> getValuesOfUnits() {
            return Arrays.asList(MassUnits.values()).stream().collect(Collectors.toMap(MassUnits::toString, MassUnits::getValue));
        }

        @Override
        public Enum getDefaultValue() {
            return MassUnits.KILOGRAM;
        }
    },
    Time() {
        @Override
        public Map<String, Double> getValuesOfUnits() {
            return Arrays.asList(TimeUnits.values()).stream().collect(Collectors.toMap(TimeUnits::toString, TimeUnits::getValue));
        }

        @Override
        public Enum getDefaultValue() {
            return TimeUnits.HOUR;
        }
    },

    Length() {
        @Override
        public Map<String, Double> getValuesOfUnits() {
            return Arrays.asList(LengthUnits.values()).stream().collect(Collectors.toMap(LengthUnits::toString, LengthUnits::getValue));
        }

        @Override
        public Enum getDefaultValue() {
            return LengthUnits.METR;
        }
    };


    public abstract Map<String, Double> getValuesOfUnits();

    public abstract Enum getDefaultValue();
}
