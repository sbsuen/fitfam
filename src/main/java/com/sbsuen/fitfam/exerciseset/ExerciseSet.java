package com.sbsuen.fitfam.exerciseset;

import com.sbsuen.fitfam.exercise.Exercise;
import lombok.Data;

@Data
public abstract class ExerciseSet {
    private String id;
    private float resistance;
    private Exercise exercise;
}
