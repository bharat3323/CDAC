package com.task.service;

import com.task.core.TaskManger;
import com.task.exception.taskException;

public interface TaskService {
	public TaskManger AddTask(String taskName, String description, String taskDate)throws taskException;

	public String deleteTask(int id)throws taskException;

	public void updateTaskStatus(int id,String Status) throws taskException;

	public void displayTask();

	public void displayPendingTask();

	public void sortByDate();


}
