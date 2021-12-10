package com.ehrFrontEnd.services;

import com.ehrFrontEnd.models.Bb;
import com.ehrFrontEnd.repositories.BbRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BbService {

    @Autowired
    private BbRepository bbRepository;

    public BbService(BbRepository bbRepository) {
        this.bbRepository = bbRepository;
    }

    public Bb createBb(Bb bb) {
        return bbRepository.save(bb);
    }

    public Optional<Bb> getBbByID(Long bbID) {
        return bbRepository.findById(bbID);
    }

    public Bb updateBb(Long bbID, Bb bb) {
        return bbRepository.save(bb);
    }
}
