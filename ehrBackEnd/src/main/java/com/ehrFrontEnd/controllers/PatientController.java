package com.ehrFrontEnd.controllers;

import com.ehrFrontEnd.exceptions.ResourceException;
import com.ehrFrontEnd.models.Patient;
import com.ehrFrontEnd.services.AdlService;
import com.ehrFrontEnd.services.PatientService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/patients")
public class PatientController {

    @Autowired
    private PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    private static final Logger logger = LoggerFactory.getLogger(PatientService.class);

    @GetMapping
    public ResponseEntity <List<Patient>> getEveryPatient() {
        try{
            logger.info("Get all Patients");
            return ResponseEntity.status(200).body(patientService.getAllPatients());
        }
        catch (RuntimeException e){
            logger.error("Error getting all Patients");
            throw new ResourceException("Error getting all stocks", HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/{patientID}")
    public ResponseEntity<Patient> getPatientById(@PathVariable Long patientID) {
        try{
            logger.info("Getting patient by id: " + patientID);
            return ResponseEntity.status(200).body(patientService.getPatientByID(patientID));
        }
        catch (RuntimeException e){
            logger.error("Error getting patient by id" + patientID);
            throw new ResourceException("Error getting patient by id" + patientID, HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<Patient> createPatient(@RequestBody Patient patient) {
        try{
            logger.info("Creating Patient");
            return ResponseEntity.status(200).body(patientService.createPatient(patient));
        }
        catch (RuntimeException e){
            logger.error("Error getting patient by id" + patient);
            throw new ResourceException("Error getting patient by id" + patient, HttpStatus.NOT_FOUND);
        }

    }

    @PutMapping("/{patientID}")
    public ResponseEntity<Object> updatePatient(@PathVariable Long patientID, @RequestBody Patient patient){
        try{
            Patient patentToUpdate = patientService.getPatientByID(patientID);
            patentToUpdate.setName(patient.getName());
            patentToUpdate.setRoomNumber(patient.getRoomNumber());
            patentToUpdate.setBedNumber(patient.getBedNumber());
            logger.info("Update patient by id:" + patientID);
            return ResponseEntity.status(200).body(patientService.updatePatient(patientID, patient));
        }
        catch (RuntimeException e){
            logger.error("Error updating patient by id" + patientID);
            throw new ResourceException("Error updating patient by id" + patientID, HttpStatus.NOT_FOUND);
        }
    }
}
