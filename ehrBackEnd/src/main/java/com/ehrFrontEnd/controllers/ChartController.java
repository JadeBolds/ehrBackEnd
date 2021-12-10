package com.ehrFrontEnd.controllers;

import com.ehrFrontEnd.exceptions.ResourceException;
import com.ehrFrontEnd.models.Chart;
import com.ehrFrontEnd.models.Patient;
import com.ehrFrontEnd.services.ChartService;
import com.ehrFrontEnd.services.PatientService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/chart")
public class ChartController {

    @Autowired
    private ChartService chartService;

    public ChartController(ChartService chartService) {
        this.chartService = chartService;
    }

    private static final Logger logger = LoggerFactory.getLogger(ChartService.class);

//    @GetMapping("/{patientID}")
//    public ResponseEntity<Patient> getChartByPatientId(@PathVariable Long patientID) {
//        try{
//            logger.info("Getting chart by patient id: " + patientID);
//            return ResponseEntity.status(200).body(patientService.getPatientByID(patientID));
//        }
//        catch (RuntimeException e){
//            logger.error("Error getting patient by id" + patientID);
//            throw new ResourceException("Error getting patient by id" + patientID, HttpStatus.NOT_FOUND);
//        }
//    }

    @PostMapping
    public ResponseEntity<Chart> createChart(@RequestBody Chart chart) {
        try{
            logger.info("Creating Chart");
            return ResponseEntity.status(200).body(chartService.createChart(chart));
        }
        catch (RuntimeException e){
            logger.error("Error getting chart by id" + chart);
            throw new ResourceException("Error getting patient by id" + chart, HttpStatus.NOT_FOUND);
        }

    }

    @PutMapping("/{chartID}")
    public ResponseEntity<Object> updateChart(@PathVariable Long chartID, @RequestBody Chart chart){
        try{
            Chart chartToUpdate = chartService.getChartByID(chartID);
            chartToUpdate.setAdl(chart.getAdl());
            chartToUpdate.setBb(chart.getBb());
            chartToUpdate.setNutrition(chart.getNutrition());
            chartToUpdate.setObservation(chart.getObservation());
            chartToUpdate.setVitals(chart.getVitals());
            logger.info("Update chart by id:" + chartID);
            return ResponseEntity.status(200).body(chartService.updateChart(chartID, chart));
        }
        catch (RuntimeException e){
            logger.error("Error updating patient by id" + chartID);
            throw new ResourceException("Error updating patient by id" + chartID, HttpStatus.NOT_FOUND);
        }
    }
}
