package com.aurionpro.test;

import com.aurionpro.exception.AgeNotValidException;
import com.aurionpro.model.Voter;

public class VoterApp {

	public static void main(String[] args) {
		
		
		try {
			Voter voter1 = new Voter("Abby", 12);
			
		}catch(AgeNotValidException exception) {
			System.out.println(exception.getMessage());
		}

	}

}
