package com.aurionpro.test;

import com.aurionpro.model.Runnablethread;

public class ThreadTest {

	public static void main(String[] args) {
			
		
		Runnablethread thread1 = new Runnablethread("thread1");
		Runnablethread thread2 = new Runnablethread("thread2");
		 
		 
		try {
			thread1.getThread().join();
			thread2.getThread().join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		 for(int i = 0; i<=5 ; i++ ) {
				
				System.out.println(Thread.currentThread()+":"+ i);
			}
		
		
		

	}

}
