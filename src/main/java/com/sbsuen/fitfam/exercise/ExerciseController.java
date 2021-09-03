package com.sbsuen.fitfam.exercise;

import com.sbsuen.fitfam.user.User;
import com.sbsuen.fitfam.user.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("fitfam/api/v1/exercises")
@AllArgsConstructor
public class ExerciseController {

    private final ExerciseService exerciseService;

    @GetMapping
    public List<Exercise> fetchAllExercises(){
        return exerciseService.getAllExercises();
    }
}
