package com.aurionpro.test;

import java.util.List;

import com.aurionpro.model.Builder;
import com.aurionpro.model.Guitar;
import com.aurionpro.model.GuitarSpec;
import com.aurionpro.model.GuitarStoreFacade;

import com.aurionpro.model.Type;
import com.aurionpro.model.Wood;

public class GuitarApp {

	
		 public static void main(String[] args) {
		        GuitarStoreFacade storeFacade = new GuitarStoreFacade();

		        // Customer's desired guitar specifications
		        Builder builder =null;// Builder.MARTIN
		        String model ="D-28";//"D-28"
		        Type type = Type.ACOUSTIC;
		        Wood backWood =null;// Wood.INDIAN_ROSEWOOD
		        Wood topWood = null;//Wood.SITKA;

		        
		        List<Guitar> matchingGuitars = storeFacade.findGuitars(builder, model, type, backWood, topWood);

		        if (!matchingGuitars.isEmpty()) {
		            System.out.println("You might like these guitars:");
		            for (Guitar guitar : matchingGuitars) {
		                GuitarSpec spec = guitar.getSpec();
		                System.out.println("We have a " + spec.getBuilder() + " " + spec.getModel() +
		                        " " + spec.getType() + " guitar:\n   Back and sides: " +
		                        spec.getBackWood() + "\n   Top: " + spec.getTopWood() +
		                        "\nYou can have it for only $" + guitar.getPrice() + "!\n---");
		            }
		        } else {
		            System.out.println("Sorry, we have nothing matching your preferences.");
		        }
		    }
}
