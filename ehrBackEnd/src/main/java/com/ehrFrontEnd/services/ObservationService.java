package com.ehrFrontEnd.services;

import com.ehrFrontEnd.models.Nutrition;
import com.ehrFrontEnd.models.Observation;
import com.ehrFrontEnd.repositories.NutritionRepository;
import com.ehrFrontEnd.repositories.ObservationRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class ObservationService {

    @Autowired
    private ObservationRepository observationRepository;

    public ObservationService(ObservationRepository observationRepository) {
        this.observationRepository = observationRepository;
    }

    public Observation createObservation(Observation observation) {
        return observationRepository.save(observation);
    }

    public Observation getObservationByID(Long observationID) {
        return observationRepository.findById(observationID);
    }

    public Observation updateObservation(Long observationID, Observation observation) {
        return observationRepository.save(observation);
    }
}