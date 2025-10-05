package com.task.core;

import java.time.LocalDate;

public class TaskManger {
	
	private int taskId;
	private String taskName;
	private String description;
	private LocalDate taskdate;
	private Status status;
	private boolean active;
	
	public static int autoid;

	//para const
	public TaskManger(String taskName, String description, LocalDate taskdate) {
		super();
		this.taskId=++autoid;
		this.taskName = taskName;
		this.description = description;
		this.taskdate = taskdate;
		this.status = status.PENDING;
		this.active = true;
	}
	
	//getter and setter

	public int getTaskId() {
		return taskId;
	}

	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	

	public LocalDate getTaskdate() {
		return taskdate;
	}

	public void setTaskdate(LocalDate taskdate) {
		this.taskdate = taskdate;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
	
	@Override
	public String toString() {
		return "TaskManger [taskId=" + taskId + ", taskName=" + taskName + ", description=" + description
				+ ", taskdate=" + taskdate + ", status=" + status + ", active=" + active + "]";
	}
	
	
	
	
	

}
