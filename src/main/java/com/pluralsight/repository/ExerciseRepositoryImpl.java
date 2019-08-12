package com.pluralsight.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.pluralsight.model.Exercise;

@Repository("exerciseRepository")
public class ExerciseRepositoryImpl implements ExerciseRepository {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public Exercise save(Exercise exercise) {
		entityManager.persist(exercise);
		entityManager.flush();
		return exercise;
	}

}
