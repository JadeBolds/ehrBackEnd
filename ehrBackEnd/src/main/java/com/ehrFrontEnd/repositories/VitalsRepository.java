package com.ehrFrontEnd.repositories;

import com.ehrFrontEnd.models.Vitals;

public interface VitalsRepository {
    Vitals save(Vitals vitals);

    Vitals findById(Long vitalsID);
}
