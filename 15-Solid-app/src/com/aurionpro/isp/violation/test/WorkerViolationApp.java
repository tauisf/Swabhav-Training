package com.aurionpro.isp.violation.test;

import com.aurionpro.isp.violation.model.Human;
import com.aurionpro.isp.violation.model.IWorker;
import com.aurionpro.isp.violation.model.Robot;

public class WorkerViolationApp {

	public static void main(String[] args) {
		IWorker human =  new Human();
		IWorker robot =  new Robot();
		
		
		human.startWork();
		human.eat();
		human.drink();
		human.stopWork();
		
		robot.startWork();
		robot.eat(); //  this should not there for robot 
		robot.drink();// this should not there for robot 
		robot.stopWork();

	}

}
