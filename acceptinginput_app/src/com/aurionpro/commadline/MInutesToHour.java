package com.aurionpro.commadline;

public class MInutesToHour {

	public static void main(String[] args) {
		int time = Integer.parseInt(args[0]);
		
		int hours = time / 60;
		int minutes = time % 60;
		
		System.out.println("Hours: " + hours + " Minutes: "+minutes );

	}

}
