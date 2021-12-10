package com.ehrFrontEnd.services;

import com.ehrFrontEnd.models.Adl;
import com.ehrFrontEnd.repositories.AdlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AdlService {

    @Autowired
    private AdlRepository adlRepository;

    public AdlService(AdlRepository adlRepository) {
        this.adlRepository = adlRepository;
    }

    public Adl createAdl(Adl adl) {
        return adlRepository.save(adl);
    }

    public Optional<Adl> getAdlByID(Long adlID) {
        return adlRepository.findById(adlID);
    }

    public Adl updateAdl(Long adlID, Adl adl) {
        return adlRepository.save(adl);
    }
}
