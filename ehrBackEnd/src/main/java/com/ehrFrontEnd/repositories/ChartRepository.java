package com.ehrFrontEnd.repositories;

import com.ehrFrontEnd.models.Chart;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Set;

public interface ChartRepository {
    @Query("SELECT a FROM Chart a WHERE a.patient.id = ?1")
    Set<Chart> findAllByPatientId(Long patientId);

    Chart save(Chart chart);

    Chart findById(Long chartID);
}
