package com.pluralsight.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pluralsight.model.Goal;
import com.pluralsight.repository.GoalRepository;

@Service("goalService")
public class GoalServiceImpl implements GoalService {
	
	@Autowired
	private GoalRepository goalRepository;
	
	@Transactional
	public Goal save(Goal goal) {
		// BL: raggiunto max goal del giorno?
		// BL: devo fare controlli con un WS?
		// Andrebbe qui
		return goalRepository.save(goal);
	}

}
