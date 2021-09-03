package com.sbsuen.fitfam.exercise;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "exercises")
public class Exercise {
    @Id
    private String id;
    private String name;
    private String primaryMuscle;
    private List<String> otherMuscles;
    private ExerciseType type;
    private String equipment;
    private ExerciseDifficulty difficulty;
    private String description;
    private List<Instruction> instructions;
    private List<Instruction> tips;

    public Exercise(String name,
                    String primaryMuscle,
                    List<String> otherMuscles,
                    ExerciseType type,
                    String equipment,
                    ExerciseDifficulty difficulty,
                    String description) {
        this.name = name;
        this.primaryMuscle = primaryMuscle;
        this.otherMuscles = otherMuscles;
        this.type = type;
        this.equipment = equipment;
        this.difficulty = difficulty;
        this.description = description;
    }
}
