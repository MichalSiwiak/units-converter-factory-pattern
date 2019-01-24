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

    @GetMapping("/demo")
    public String showMainPage() {
        return "units-form";
    }

    @RequestMapping(value = "/measure", consumes = MediaType.TEXT_PLAIN_VALUE, method = RequestMethod.POST)
    public ResponseEntity<String> getSelectedMeasure(@RequestBody String selectedMeasure) {
        unitFactory.setMeasure(selectedMeasure);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "/unit", consumes = MediaType.TEXT_PLAIN_VALUE, method = RequestMethod.POST)
    public ResponseEntity<String> getSelectedUnit(@RequestBody String selectedUnit) {
        unitFactory.setUnit(selectedUnit);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "/quantity", consumes = MediaType.TEXT_PLAIN_VALUE, method = RequestMethod.POST)
    public ResponseEntity<String> getSelectedQuantity(@RequestBody String quantity) {
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
