package com.aurionpro.test;

import com.aurionpro.model.Callerr;
import com.aurionpro.model.Callme;

public class Synch {

	public static void main(String[] args) {
		Callme target = new Callme();
		 Callerr ob1 = new Callerr(target, "Hello");
		 Callerr ob2 = new Callerr(target, "Synchronized");
		 Callerr ob3 = new Callerr(target, "World");
		 // wait for threads to end
		 try {
		 ob1.getT().join();
		 ob2.getT().join();
		 ob3.getT().join();
		 } catch(InterruptedException e) {
		 System.out.println("Interrupted");
		 }
		 }
		
	}


