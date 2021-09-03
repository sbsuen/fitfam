package com.sbsuen.fitfam;

import com.sbsuen.fitfam.exercise.Exercise;
import com.sbsuen.fitfam.exercise.ExerciseDifficulty;
import com.sbsuen.fitfam.exercise.ExerciseRepository;
import com.sbsuen.fitfam.exercise.ExerciseType;
import com.sbsuen.fitfam.user.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class FitfamApplication {

	public static void main(String[] args) {
		SpringApplication.run(FitfamApplication.class, args);
	}
}
