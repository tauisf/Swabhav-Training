package com.aurionpro.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.aurionpro.model.Task;

public class ExecutorTest {

	public static void main(String[] args) {
//		ExecutorService service = Executors.newFixedThreadPool(10/5);
//		
//		for(int i = 0 ; i< 10;i++) {
//			service.execute(new Task());
//		}
		int processor =Runtime.getRuntime().availableProcessors();
		System.out.println(processor);

		ExecutorService service1 = Executors.newScheduledThreadPool(processor);

		for(int i = 0 ; i< 10;i++) {
			service1.execute(new Task());
		}

		
//		Thread.currentThread().setName("Mythread");
//		for(int i = 0 ; i< 5;i++) {
//			
//			System.out.println(Thread.currentThread());;
//		}

	}

}
