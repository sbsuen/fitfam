package com.sbsuen.fitfam.workout;

import com.sbsuen.fitfam.exerciseset.ExerciseSet;
import lombok.Data;

import java.util.List;

@Data
public abstract class Workout {
    protected String id;
    protected String name;
    protected List<ExerciseSet> setList;
}
