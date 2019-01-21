package net.coffeecoding.controller;

import net.coffeecoding.factory.UnitFactory;
import net.coffeecoding.measures.Measures;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.*;

@Controller
public class UnitsController {

    private UnitFactory unitFactory;

    @PostConstruct
    private void init() {
        unitFactory = new UnitFactory(5, "Mass", "TON");
    }

    @GetMapping("/units")
    public String showMainPage() {
        return "units-form";
    }
/*
    @RequestMapping(value = "/other-units", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
    public ResponseEntity<Map<String, Double>> createOtherUnitsJSON() {
        Map<String, Double> otherUnits = unitFactory.getCalculatedUnitsOfMeasure();
        return new ResponseEntity<>(otherUnits, HttpStatus.OK);
    }

    @RequestMapping(value = "/measures", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
    public ResponseEntity<List<Measures>> getAllMeasuresJSON() {
        List<Measures> measures = Arrays.asList(Measures.values());
        return new ResponseEntity<>(measures, HttpStatus.OK);
    }

    @RequestMapping(value = "/units-list", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
    public ResponseEntity<Map<String,Double>> getAllUnitsJSON() {
        return new ResponseEntity<>(unitFactory.getUnitsOfMeasure(), HttpStatus.OK);
    }

    @RequestMapping(value = "/default-unit", produces = MediaType.TEXT_PLAIN_VALUE, method = RequestMethod.GET)
    public ResponseEntity<String> getDefaultUnit() {
        return new ResponseEntity<>(unitFactory.getUnit(), HttpStatus.CREATED);
    }*/

    @RequestMapping(value = "/measure", consumes = MediaType.TEXT_PLAIN_VALUE, method = RequestMethod.POST)
    public ResponseEntity<String> getSelectedMeasure(@RequestBody String selectedMeasure) {
        System.out.println(selectedMeasure);
        unitFactory.setMeasure(selectedMeasure);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "/unit", consumes = MediaType.TEXT_PLAIN_VALUE, method = RequestMethod.POST)
    public ResponseEntity<String> getSelectedUnit(@RequestBody String selectedUnit) {
        System.out.println(selectedUnit);
        unitFactory.setUnit(selectedUnit);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "/quantity", consumes = MediaType.TEXT_PLAIN_VALUE, method = RequestMethod.POST)
    public ResponseEntity<String> getSelectedQuantity(@RequestBody String quantity) {
        System.out.println(quantity);
        if (quantity.equals("")){
            unitFactory.setQuantity(1);
        }else {
            unitFactory.setQuantity(Integer.parseInt(quantity));
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "/unit-model", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
    public ResponseEntity<UnitFactory> test() {
        return new ResponseEntity<>(unitFactory, HttpStatus.OK);
    }
}
