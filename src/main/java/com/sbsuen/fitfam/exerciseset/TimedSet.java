package com.sbsuen.fitfam.exerciseset;

import com.sbsuen.fitfam.exerciseset.ExerciseSet;
import lombok.Data;

@Data
public class TimedSet extends ExerciseSet {
    private long exerciseTime;
    private long restTime;

    public long getTotalTime(){
        return exerciseTime + getTotalTime();
    }
}
