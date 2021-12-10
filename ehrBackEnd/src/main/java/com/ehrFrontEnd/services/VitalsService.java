package com.ehrFrontEnd.services;

import com.ehrFrontEnd.exceptions.*;
import com.ehrFrontEnd.models.Observation;
import com.ehrFrontEnd.models.Vitals;
import com.ehrFrontEnd.repositories.ObservationRepository;
import com.ehrFrontEnd.repositories.VitalsRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class VitalsService {

    @Autowired
    private VitalsRepository vitalsRepository;

    public VitalsService(VitalsRepository vitalsRepository) {
        this.vitalsRepository = vitalsRepository;
    }

    public Vitals createVitals(Vitals vitals) {
        return vitalsRepository.save(vitals);
    }

    public Vitals getVitalsByID(Long vitalsID) {
        return vitalsRepository.findById(vitalsID);
    }

    public Vitals updateVitals(Long vitalsID, Vitals vitals) {
        return vitalsRepository.save(vitals);
    }
}
