package com.aurionpro.structural.composite.test;

import com.aurionpro.structural.composite.model.ITask;
import com.aurionpro.structural.composite.model.SimpleTask;
import com.aurionpro.structural.composite.model.TaskList;

public class TaskTest {

	public static void main(String[] args) {
		 
		ITask simpleTask1 = new SimpleTask("Complete Coding");          // Creating simple tasks
		ITask simpleTask2 = new SimpleTask("Write Documentation");
		
		
		TaskList projectTasks = new TaskList("Project Tasks");         // Creating a task list
		projectTasks.addTask(simpleTask1);
		projectTasks.addTask(simpleTask2);
		
		TaskList phase1Tasks = new TaskList("Phase1 Tasks");            // Nested task list
		phase1Tasks.addTask(new SimpleTask("Design"));
		phase1Tasks.addTask(new SimpleTask("Implementation"));
		
		
		projectTasks.display();
		phase1Tasks.display();
		
//		projectTasks.removeTask(simpleTask1);
//		projectTasks.display();

	}

}
