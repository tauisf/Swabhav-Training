package com.aurionpro.isp.solution.test;

import com.aurionpro.isp.solution.model.Human;
import com.aurionpro.isp.solution.model.IHuman;
import com.aurionpro.isp.solution.model.IWorkerSolution;
import com.aurionpro.isp.solution.model.Robot;

public class WorkerSolutionApp {

	public static void main(String[] args) {
		IHuman human =  new Human();
		IWorkerSolution robot =  new Robot();
		human.drink();
		

	}

}
