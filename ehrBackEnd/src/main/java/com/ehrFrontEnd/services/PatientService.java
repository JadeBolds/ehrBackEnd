package com.ehrFrontEnd.services;

import com.ehrFrontEnd.models.Patient;
import com.ehrFrontEnd.repositories.ChartRepository;
import com.ehrFrontEnd.repositories.PatientRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

    @Autowired
    private PatientRepository patientRepository;

    private ChartRepository chartRepository;

    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    public Patient createPatient(Patient patient) {
        return patientRepository.save(patient);
    }

    public Patient getPatientByID(Long patientID) {
        return patientRepository.findById(patientID);
    }

    public Patient updatePatient(Long patientID, Patient patient) {
        return patientRepository.save(patient);
    }
}
