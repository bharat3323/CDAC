package com.task.service;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

import com.task.core.Status;
import com.task.core.TaskManger;
import com.task.exception.taskException;



public class TaskServiceImpl implements TaskService {
	Map<Integer,TaskManger>taskmanger=new HashMap<>();

	@Override
	public TaskManger AddTask(String taskName, String description, String taskDate)
			throws taskException  {
		TaskManger o=new TaskManger(taskName,description,LocalDate.parse(taskDate));
		taskmanger.put(o.getTaskId(),o);
		System.out.println("Added successfully!!!!!!");
		return o;	
	}

	@Override
	public String deleteTask(int id) throws taskException {
		if(!taskmanger.containsKey(id)){
			throw new taskException("ID not found");
		}
		TaskManger o=taskmanger.get(id);
		o.setActive(false);
		return "Removed succesfully";
	}

	@Override
	public void updateTaskStatus(int id,String status) throws taskException {
		Status ustatus=Status.valueOf(status.toUpperCase());
		if(!taskmanger.containsKey(id)) {
			throw new taskException("Id not found");
		}
		TaskManger o=taskmanger.get(id);
		o.setStatus(ustatus);
		System.out.println(o);
		}

	@Override
	public void displayTask() {
	for(TaskManger c: taskmanger.values()) {
		if(c.getStatus().equals(Status.PENDING)) {
			System.out.println(c);
		}
	}
	}

	@Override
	public void displayPendingTask() {
		LocalDate	today=LocalDate.now();
	for(TaskManger c: taskmanger.values()) {
		if((c.getTaskdate()).equals(today)) {
			System.out.println(c);
		}
	}
		
	}

	@Override
	public void sortByDate() {
		
		Comparator<TaskManger>comdate=(o1,o2)->(o1.getTaskdate().compareTo(o2.getTaskdate()));
		taskmanger.values()
		.stream()
		.sorted(comdate)
		.forEach(c->System.out.println(c) );
	}
}
