package net.coffeecoding.factory;

import java.util.Map;

public interface Unit {

    public Map<String, Double> createOtherUnits();

    void setMeasure(String mass);
}