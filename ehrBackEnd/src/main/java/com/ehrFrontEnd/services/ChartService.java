package com.ehrFrontEnd.services;

import com.ehrFrontEnd.models.Chart;
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
public class ChartService {

    private PatientRepository patientRepository;

    @Autowired
    private ChartRepository chartRepository;

    public ChartService(ChartRepository chartRepository) {
        this.chartRepository = chartRepository;
    }

    public Chart createChart(Chart chart) {
        return chartRepository.save(chart);
    }

    public Chart getChartByID(Long chartID) {
        return chartRepository.findById(chartID);
    }

    public Chart updateChart(Long chartID, Chart chart) {
        return chartRepository.save(chart);
    }
}

