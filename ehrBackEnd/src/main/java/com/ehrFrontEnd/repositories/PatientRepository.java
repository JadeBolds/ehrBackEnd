package com.ehrFrontEnd.repositories;

import com.ehrFrontEnd.models.Patient;

import java.util.List;

public interface PatientRepository {
    List<Patient> findAll();

    Patient save(Patient patient);

    Patient findById(Long patientID);
}
