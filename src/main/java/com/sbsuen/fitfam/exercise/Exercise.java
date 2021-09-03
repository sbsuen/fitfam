package com.sbsuen.fitfam.exercise;

import lombok.Data;

import java.util.List;

@Data
public class Exercise {
    private String id;
    private String name;
    private String primaryMuscle;
    private List<String> otherMuscles;
    private boolean isFullBody;
    private ExerciseType type;
    private String equipment;
    private ExerciseDifficulty difficulty;
    private String description;
    private List<Instruction> instructions;
    private List<Instruction> tips;
}
