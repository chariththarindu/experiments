package com.exp.hilti;

public class DriverExam {
	public static void executeExercise(IExercise exercise) {
		try {
			exercise.start();
			exercise.execute();
			exercise.end();
		} catch (Exception e) {
			exercise.markNegativePoints();

		} finally {
			exercise.end();
		}

	}

	public static void main(String[] args) {
		DriverExam.executeExercise(new Exercise());
	}
}
