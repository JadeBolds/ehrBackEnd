package com.ehrFrontEnd.repositories;

import com.ehrFrontEnd.models.Nutrition;

public interface NutritionRepository {
    Nutrition save(Nutrition nutrition);

    Nutrition findById(Long nutritionID);
}
