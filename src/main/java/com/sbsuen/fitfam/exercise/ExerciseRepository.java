package com.sbsuen.fitfam.exercise;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ExerciseRepository extends MongoRepository<Exercise,String> {
}
