package com.aurionpro.structural.composite.model;

import java.util.ArrayList;
import java.util.List;

public class TaskList implements ITask {
	private String title;
	private List<ITask> tasks;
	
	
	public TaskList(String title) {
		this.title = title;
		this.tasks = new ArrayList<>();
	}

	@Override
	public String getTitle() {
		return title;
	}
	
	@Override
	public void setTitle() {
		this.title = title;
		
	}
	
	public void addTask(ITask task) {
		tasks.add(task);
	}
	
	public void removeTask(ITask task) {
        tasks.remove(task);
    }
	
	@Override
	public void display() {
		System.out.println("Task List: " + title);
		for(ITask task: tasks) {
			task.display();
		}
		
	}

}
