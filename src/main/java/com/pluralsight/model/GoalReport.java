package com.pluralsight.model;

public class GoalReport {
	private int goalMinutes;
	private int exerciseMinutes;
	private String exerciseActivity;
	
	public GoalReport(int goalMinutes, int exerciseSetMinutes, String exerciseActivity) {
		this.goalMinutes = goalMinutes;
		this.exerciseMinutes = exerciseSetMinutes;
		this.exerciseActivity = exerciseActivity;
	}
	
	public String getExerciseActivity() {
		return exerciseActivity;
	}
	public int getExerciseMinutes() {
		return exerciseMinutes;
	}
	public int getGoalMinutes() {
		return goalMinutes;
	}
	public void setExerciseActivity(String exerciseActivity) {
		this.exerciseActivity = exerciseActivity;
	}
	public void setExerciseMinutes(int exerciseMinutes) {
		this.exerciseMinutes = exerciseMinutes;
	}
	public void setGoalMinutes(int goalMinutes) {
		this.goalMinutes = goalMinutes;
	}
}
