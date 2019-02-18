package net.coffeecoding.measures;

import net.coffeecoding.units.*;

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

    Volume() {
        @Override
        public Map<String, Double> getValuesOfUnits() {
            return Arrays.asList(VolumeUnits.values()).stream().collect(Collectors.toMap(VolumeUnits::toString, VolumeUnits::getValue));
        }

        @Override
        public Enum getDefaultValue() {
            return VolumeUnits.CUBIC_METER;
        }
    },

    Temperature() {
        @Override
        public Map<String, Double> getValuesOfUnits() {
            return Arrays.asList(TemperatureUnits.values()).stream().collect(Collectors.toMap(TemperatureUnits::toString, TemperatureUnits::getValue));
        }

        @Override
        public Enum getDefaultValue() {
            return TemperatureUnits.CELSIUS;
        }
    },

    Area() {
        @Override
        public Map<String, Double> getValuesOfUnits() {
            return Arrays.asList(AreaUnits.values()).stream().collect(Collectors.toMap(AreaUnits::toString, AreaUnits::getValue));
        }

        @Override
        public Enum getDefaultValue() {
            return AreaUnits.SQUARE_METER;
        }
    },

    Length() {
        @Override
        public Map<String, Double> getValuesOfUnits() {
            return Arrays.asList(LengthUnits.values()).stream().collect(Collectors.toMap(LengthUnits::toString, LengthUnits::getValue));
        }

        @Override
        public Enum getDefaultValue() {
            return LengthUnits.METER;
        }
    };


    public abstract Map<String, Double> getValuesOfUnits();

    public abstract Enum getDefaultValue();
}
