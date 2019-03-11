<!DOCTYPE html>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>coffeecoding.net</title>
    <meta name="description"
          content="Free open source projects present different java solutions using spring, hibernate and other popular frameworks.">
    <meta name="keywords"
          content="java, spring, hibernate, apache, tomcat, coding, programmer, linux, google cloud platform, open source, bootstrap, mysql, java ideas">
    <!-- CSS dependencies -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css"
          type="text/css">
    <link rel="stylesheet"
          href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.7.1/css/bootstrap-datepicker.standalone.min.css">
    <link rel="stylesheet" href="https://www.coffeecoding.net/resources/css/now-ui-kit.css" type="text/css">
    <link rel="stylesheet" href="https://www.coffeecoding.net/resources/css/style.css" type="text/css">
    <link rel="icon" href="resources/img/favicon.png">
    <!-- PAGE scripts -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
            integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
            crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
            integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
            crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
            integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
            crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.7.1/js/bootstrap-datepicker.js"></script>
</head>


<body class="bg-light text-dark">
<div id="wrap">
    <div id="main" class="clear-top">


        <div class="collapse" id="navbarHeader">
            <div class="container">
                <div class="row">
                    <div class="col-md-7 py-4">
                        <h4>About</h4>
                        <p class="text-info">Free open source projects present different java solutions using spring,
                            hibernate
                            and other popular frameworks.</p>
                    </div>
                    <div class="col-md-3 offset-md-1 py-4">
                        <h4>Contact</h4>
                        <ul class="list-unstyled">
                            <li>
                                <a href="https://pl.linkedin.com/in/michalsiwiak" class="text-secondary"
                                   target="_blank">Follow
                                    on LinkedIn</a>
                            </li>
                            <li>
                                <a href="mailto:info@coffeecoding.net" target="_top" class="text-secondary">Email me</a>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>


        <div class="navbar sticky-top navbar-dark bg-info">
            <div class="container d-flex justify-content-between">
                <a href="https://www.coffeecoding.net/" class="navbar-brand d-flex align-items-center"><i
                        class="fa fa-home fa-2x lead fa-fw d-inline-block" aria-hidden="true"></i>&nbsp;&nbsp;<text
                        class="">
                    HOME
                </text>
                </a>
                <a href="https://github.com/MichalSiwiak/units-converter-factory-pattern" target="_blank"
                   class="navbar-brand d-flex align-items-center"><i
                        class="fa fa-git-square fa-fw d-inline-block lead fa-2x"></i>&nbsp;&nbsp;<text class="">SOURCE
                    CODE
                </text>
                </a>
                <a href="${pageContext.request.contextPath}/demo" class="navbar-brand d-flex align-items-center"><i
                        class="fa fa-desktop fa-2x fa-fw lead d-inline-block" aria-hidden="true"></i>&nbsp;&nbsp;<text
                        class="">DEMO VIEW
                </text>
                </a>
                <a href="https://coffeecoding.net/resources/img/cv_msiwiak.pdf" target="_blank"
                   class="navbar-brand d-flex align-items-center"><i
                        class="fa fa-address-card fa-2x lead fa-fw d-inline-block" aria-hidden="true"></i>&nbsp;&nbsp;<text
                        class="">RESUME
                </text>
                </a>
                <a href="/contact" class="navbar-brand d-flex align-items-center"><i
                        class="fa fa-envelope fa-2x lead fa-fw d-inline-block" aria-hidden="true"></i>&nbsp;&nbsp;<text
                        class="">CONTACT
                </text>
                </a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarHeader"><span
                        class="navbar-toggler-icon"></span></button>
            </div>
        </div>


        <div class="py-5">
            <div class="container">
                <div class="row">
                    <div class="col-md-12">
                        <h1>Units Converter</h1>
                        <hr>
                        <h5>This application presents simple implementation of unit converter. The application uses a
                            modified factory pattern - we can easily add more units and measures.<br></h5>
                        <h5><b>Back End: </b>Java, Spring MVC.</h5>
                        <h5><b>Front End: </b>AngularJS, HTML, CSS.</h5>
                        <h5>To run application: git clone
                            https://github.com/MichalSiwiak/units-converter-factory-pattern.git,
                            upload and run application using tomcat application server or similar.</h5>
                        <h5>Demo View: <a href="https://coffeecoding.net/converter/demo">https://coffeecoding.net/converter/demo</a>
                        </h5>
                        <h5>Measures enum class:</h5>
                    </div>
                </div>
                <pre><code class="java">
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

    
       
</code></pre>
                <h5 class="mb-3">Example of Units class:</h5>
                <pre><code class="java">
public enum AreaUnits {

    SQUARE_METER(1),
    SQUARE_KILOMETER(1000000),
    SQUARE_CENTIMETER(0.0001),
    SQUARE_MILLIMETER(0.000001),
    SQUARE_MICROMETER(0.000000000001),
    HECTARE(10000),
    SQUARE_MILE(2589990),
    SQUARE_YARD(0.83612736),
    SQUARE_FOOT(0.09290304),
    SQUARE_INCH(0.00064516),
    ACRE(4046.8564224);

    private double value;

    AreaUnits(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}

                    </code></pre>

                <h5 class="mb-3">Unit Factory class:</h5>
                <pre><code class="java">
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


                    </code></pre>
                <h5 class="mb-3">Units Controller class:</h5>
                <pre><code class="java">
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

    @GetMapping("/error")
    public String showErrorPage() {
        return "error-page";
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

                     </code></pre>


                <script src="https://cdnjs.cloudflare.com/ajax/libs/highlight.js/9.11.0/highlight.min.js"></script>
                <script>
                    hljs.initHighlightingOnLoad();
                </script>
            </div>
        </div>


    </div>
</div>


<footer class="footer bg-dark text-muted">
    <div class="container">
        <p class="float-right">
            <a href="#">Back to top</a>
        </p>
        <p>© Copyright 2018 coffeecoding.net - All rights reserved.<br>Contact: info@coffeecoding.net<br>Warsaw PL<br><a
                href="https://www.coffeecoding.net/">Visit the homepage</a>
        </p>
    </div>
</footer>


</body>
</html>