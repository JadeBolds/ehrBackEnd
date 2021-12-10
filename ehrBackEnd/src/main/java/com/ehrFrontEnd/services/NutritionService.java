package com.ehrFrontEnd.services;

import com.ehrFrontEnd.models.Bb;
import com.ehrFrontEnd.models.Nutrition;
import com.ehrFrontEnd.repositories.BbRepository;
import com.ehrFrontEnd.repositories.NutritionRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class NutritionService {

    @Autowired
    private NutritionRepository nutritionRepository;

    public NutritionService(NutritionRepository nutritionRepository) {
        this.nutritionRepository = nutritionRepository;
    }

    public Nutrition createNutrition(Nutrition nutrition) {
        return nutritionRepository.save(nutrition);
    }

    public Nutrition getNutritionByID(Long nutritionID) {
        return nutritionRepository.findById(nutritionID);
    }

    public Nutrition updateNutrition(Long nutritionID, Nutrition nutrition) {
        return nutritionRepository.save(nutrition);
    }
}
