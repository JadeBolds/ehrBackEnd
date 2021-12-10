package com.ehrFrontEnd.models;

import javax.persistence.*;

@Entity
public class Nutrition {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "NUTRITION_ID")
    private Long id;

    private Integer amountOfFoodEaten;
    private Integer amountOfLiquidConsumed;

    public Nutrition(Long id, Integer amountOfFoodEaten, Integer amountOfLiquidConsumed) {
        this.id = id;
        this.amountOfFoodEaten = amountOfFoodEaten;
        this.amountOfLiquidConsumed = amountOfLiquidConsumed;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAmountOfFoodEaten() {
        return amountOfFoodEaten;
    }

    public void setAmountOfFoodEaten(Integer amountOfFoodEaten) {
        this.amountOfFoodEaten = amountOfFoodEaten;
    }

    public Integer getAmountOfLiquidConsumed() {
        return amountOfLiquidConsumed;
    }

    public void setAmountOfLiquidConsumed(Integer amountOfLiquidConsumed) {
        this.amountOfLiquidConsumed = amountOfLiquidConsumed;
    }
}
