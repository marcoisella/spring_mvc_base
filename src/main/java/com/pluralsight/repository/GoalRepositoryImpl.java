package com.pluralsight.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.pluralsight.model.Goal;

@Repository("goalRepository")
public class GoalRepositoryImpl implements GoalRepository {

	@PersistenceContext
	private EntityManager entityManager;

	public Goal save(Goal goal) {
		entityManager.persist(goal);
		
		entityManager.flush();
		
		return goal;
	}

}
