package com.aurionpro.model;

import java.util.List;

public class GuitarStoreFacade {
	 private Inventory inventory;

	    public GuitarStoreFacade() {
	        inventory = new Inventory();
	        initializeInventory();
	    }

	  
	    private void initializeInventory() {
	    	 inventory.addGuitar("12345", 1500.00,
	    	            new GuitarSpec(Builder.MARTIN, "D-28", Type.ACOUSTIC, Wood.INDIAN_ROSEWOOD, Wood.SITKA));
	    	    inventory.addGuitar("54321", 1200.00,
	    	            new GuitarSpec(Builder.GIBSON, "J-45", Type.ACOUSTIC, Wood.MAHOGANY, Wood.ADIRONDACK));
	    	    inventory.addGuitar("67890", 1600.00,
	    	            new GuitarSpec(Builder.FENDER, "Stratocaster", Type.ELECTRIC, Wood.ALDER, Wood.ALDER));
	    	    inventory.addGuitar("13579", 1800.00,
	    	            new GuitarSpec(Builder.PRS, "Custom 24", Type.ELECTRIC, Wood.MAHOGANY, Wood.MAPLE));
	    	    inventory.addGuitar("24680", 1400.00,
	    	            new GuitarSpec(Builder.OLSON, "SJ", Type.ACOUSTIC, Wood.COCOBOLO, Wood.CEDAR));
	    	    inventory.addGuitar("65733", 1400.00,
	    	            new GuitarSpec(Builder.OLSON, "SJ", Type.ELECTRIC, Wood.ALDER, Wood.BRAZILIAN_ROSEWOOD));
	    }
	    

	   
	    public List<Guitar> findGuitars(Builder builder, String model, Type type, Wood backWood, Wood topWood) {
	        GuitarSpec searchSpec = new GuitarSpecBuilder()  
	        		.setBuilder(builder)
	                .setModel(model)
	                .setType(type)
	                .setBackWood(backWood)
	                .setTopWood(topWood)
	                .build();
	        return inventory.search(searchSpec);
	    }

	  
	    public Guitar getGuitarBySerialNumber(String serialNumber) {
	        return inventory.getGuitar(serialNumber);
	    }
	}

