package com.aurionpro.model;

public class Runnablethread  implements Runnable{
    private Thread thread;
    String name;
    
	public Runnablethread(String threadName) {
	super();
	name = threadName;
	this.thread = new Thread(this,  name);
	thread.start();
}
	@Override
	public void run() {
		for(int i = 0; i<=5 ; i++ ) {

			System.out.println(thread.getName()+":"+ i);
		}
		
	}
	public Thread getThread() {
		return thread;
	}
	public void setThread(Thread thread) {
		this.thread = thread;
	}

	
	
}
