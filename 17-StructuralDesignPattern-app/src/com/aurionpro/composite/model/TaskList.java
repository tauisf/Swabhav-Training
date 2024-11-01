package com.aurionpro.composite.model;

import java.util.ArrayList;
import java.util.List;

public class TaskList implements ITask  {
	 private String title;
	    private List<ITask> Tasks;

	    public TaskList(String title) {
	        this.title = title;
	        this.Tasks = new ArrayList<>();
	    }

	    @Override
	    public String getTitle() {
	        return title;
	    }

	    @Override
	    public void setTitle(String title) {
	        this.title = title;
	    }

	    public void addTask(ITask Task) {
	        Tasks.add(Task);
	    }

	    public void removeTask(ITask Task) {
	        Tasks.remove(Task);
	    }

	    @Override
	    public void display() {
	        System.out.println("Task List: " + title);
	        for (ITask Task : Tasks) {
	            Task.display();
	        }
	    }
}
