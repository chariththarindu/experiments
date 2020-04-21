package com.exp.hilti;

public interface IExercise {
	void start() throws Exception;
    void execute();
    void markNegativePoints();
    void end();
}
