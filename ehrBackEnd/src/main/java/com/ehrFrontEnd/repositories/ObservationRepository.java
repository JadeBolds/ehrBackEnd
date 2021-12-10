package com.ehrFrontEnd.repositories;

import com.ehrFrontEnd.models.Observation;

public interface ObservationRepository {
    Observation save(Observation observation);

    Observation findById(Long observationID);
}
