package com.task.test;

import java.util.Scanner;

import com.task.service.TaskServiceImpl;
import com.task.service.TaskService;

public class Tester {
	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)) {
			TaskService service =new TaskServiceImpl();
			boolean exit=false;
			while(!exit) {
				System.out.println("===================Task Manager===================");
				System.out.println("1.Add new Task");
				System.out.println("2.Delete Task");
				System.out.println("3.Update task status");
				System.out.println("4.Display all pending task");
				System.out.println("5.Display all pending task for today");
				System.out.println("6.Display all tasks sorted by tasksDate");
				System.out.println("7.exit");
				
				try {
					switch(sc.nextInt()){
					case 1:
						System.out.println("Add new Task: Enter taskName,Description,taskDate");
						System.out.println("status: "+ service.AddTask(sc.next(),sc.next(),sc.next()));
						break;
					case 2:
						System.out.println("Enter Id: ");
						System.out.println(service.deleteTask(sc.nextInt()));
						break;
					case 3:
						System.out.println("Enter id and status");
						service.updateTaskStatus(sc.nextInt(),sc.next());
						break;
					case 4:
						System.out.println("Display all pending tasks!!!");
						service.displayTask();
						break;
					case 5:
						System.out.println("Display all Pending task");
						service.displayPendingTask();
						break;
					case 6:
						System.out.println("Display all task sortrd by date");
						service.sortByDate();
						break;
					case 7:
						break;
						default:
							System.out.println("Enter valid Input!!!!");
						
					}
					
				}catch(Exception e) {
					sc.next();
					System.out.println(e);
				}
			}
		}
	}

}
