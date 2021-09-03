package com.sbsuen.fitfam.workout;

public class TimeBasedWorkout extends Workout{
    private long totalTime;

    /*
    * TODO: Implement calcTotalTime() method
    *  This method shall:
    * - Calculate the total time each time a set is added or removed
    * - If a rest period follows a set, ignore that set's rest interval
    * */

    private void calcTotalTime(){
        //Iterate through setList
        //If the current set is determined to be a "rest", subtract the previous set's rest interval
    }
}
