package com.aurionpro.model;

public class Callerr implements Runnable {
	 String msg;
	 Callme target;
	 Thread t;
 
	 public Callerr(Callme targ, String s) {
		 target = targ;
		 msg = s;
		 t = new Thread(this);
		 t.start();
		 }
	
	public void run() {
	 target.call(msg);
	 }

	public Thread getT() {
		return t;
	}

	public void setT(Thread t) {
		this.t = t;
	}
	
	
	
	}
	
