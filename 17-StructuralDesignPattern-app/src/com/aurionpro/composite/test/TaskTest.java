package com.aurionpro.composite.test;

import com.aurionpro.composite.model.ITask;
import com.aurionpro.composite.model.SimpleTask;
import com.aurionpro.composite.model.TaskList;

public class TaskTest {

	public static void main(String[] args) {
		ITask simpleTask1 = new SimpleTask("Complete Coding");
		ITask simpleTask2 = new SimpleTask("Write Documentation");

		TaskList projectTasks = new TaskList("Project Tasks");
		projectTasks.addTask(simpleTask1);
		projectTasks.addTask(simpleTask2);

		TaskList phase1Tasks = new TaskList("Phase 1 Tasks");
		phase1Tasks.addTask(new SimpleTask("Design"));
		phase1Tasks.addTask(new SimpleTask("Implementation"));

		projectTasks.addTask(phase1Tasks);

		projectTasks.display();

	}

}
