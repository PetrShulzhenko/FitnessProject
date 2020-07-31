package com.fitness.webapp.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotBlank;

public class User {
    private int id;
    @NotBlank
    private String name;
    @NotBlank
    private String programType;
    private boolean isTrainingPlan;
    private boolean isDietPlan;
    private short height;
    private short weight;
    private short age;
    @NotBlank
    private String trainingExperience;
    @NotBlank
    private String previousProgram;
    @NotBlank
    private String health;
    @NotBlank
    private String muscleTarget;
    @NotBlank
    private String dietTarget;
    @NotBlank
    private String specialProgram;
    private String photo;
    private String equipment;
    @NotBlank
    private String activityLevel;

    public User(@JsonProperty("id") int id,
                @JsonProperty("name") String name,
                @JsonProperty("programType") String programType,
                @JsonProperty("isTrainingPlan") boolean isTrainingPlan,
                @JsonProperty("isDietPlan") boolean isDietPlan,
                @JsonProperty("height") short height,
                @JsonProperty("weight") short weight,
                @JsonProperty("age") short age,
                @JsonProperty("trainingExperience") String trainingExperience,
                @JsonProperty("previousProgram") String previousProgram,
                @JsonProperty("health") String health,
                @JsonProperty("muscleTarget") String muscleTarget,
                @JsonProperty("dietTarget") String dietTarget,
                @JsonProperty("specialProgram") String specialProgram,
                @JsonProperty("photo") String photo,
                @JsonProperty("equipment") String equipment,
                @JsonProperty("activityLevel") String activityLevel) {
        this.id = id;
        this.name = name;
        this.programType = programType;
        this.isTrainingPlan = isTrainingPlan;
        this.isDietPlan = isDietPlan;
        this.height = height;
        this.weight = weight;
        this.age = age;
        this.trainingExperience = trainingExperience;
        this.previousProgram = previousProgram;
        this.health = health;
        this.muscleTarget = muscleTarget;
        this.dietTarget = dietTarget;
        this.specialProgram = specialProgram;
        this.photo = photo;
        this.equipment = equipment;
        this.activityLevel = activityLevel;
    }

    public int getId() {
        return id;
    }
}
