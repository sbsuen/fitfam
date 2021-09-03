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

	/*
	@Bean
	CommandLineRunner runner(ExerciseRepository exerciseRepository){
		return args -> {
			Exercise pushups = new Exercise(
					"Standard Push-Up",
					"Chest",
					List.of("Shoulders", "Abs", "Triceps"),
					ExerciseType.STRENGTH,
					"Bodyweight",
					ExerciseDifficulty.BEGINNER,
					"Description goes here....."
					);
			Exercise squats = new Exercise(
					"Bodyweight Squats",
					"Glutes",
					List.of("Quads","Hamstrings","Abdominals","Calves"),
					ExerciseType.STRENGTH,
					"Bodyweight",
					ExerciseDifficulty.BEGINNER,
					"Description goes here....."
			);
			Exercise benchPress = new Exercise(
					"Barbell Bench Press",
					"Chest",
					List.of("Shoulders","Triceps"),
					ExerciseType.STRENGTH,
					"Barbell Weights",
					ExerciseDifficulty.INTERMEDIATE,
					"Description goes here....."
			);
			if (exerciseRepository.count() > 0) exerciseRepository.deleteAll();
			exerciseRepository.insert(pushups);
			exerciseRepository.insert(squats);
			exerciseRepository.insert(benchPress);
		};
	}
	*/
}
