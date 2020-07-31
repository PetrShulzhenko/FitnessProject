package com.fitness.webapp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;

public class Day {
    @NotBlank
    private final String date;
    private ArrayList<String> exercises;

    public Day(@JsonProperty("date") String date) {
        this.date = date;
    }

    public void addExercise(String exercise) {
        exercises.add(exercise);
    }

    public int size() {
        return exercises.size();
    }

    public String getNumberOfDay() {
        return date;
    }

    public ArrayList<String> getExercises() {
        return exercises;
    }

    public String exercisesToString() {
        StringBuilder builder = new StringBuilder();
        builder.append("['");
        for (int i = 0, end_ = exercises.size() - 1; i < end_; ++i) {
            builder.append(exercises.get(i))
                    .append('\'')
                    .append(", '");
        }
        builder.append(exercises.get(exercises.size() - 1))
                .append('\'')
                .append("]");

        return builder.toString();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Day{date=")
                .append(date)
                .append(", exercises=")
                .append(exercisesToString())
                .append("}");

        return builder.toString();
    }
}
