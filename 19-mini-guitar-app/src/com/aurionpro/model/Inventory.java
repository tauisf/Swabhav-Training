package com.aurionpro.model;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;


public class Inventory {
	private static Inventory instance;
    private List<Guitar> guitars;

    public Inventory() {
        guitars = new ArrayList<>();
    }
    
    public static Inventory getInstance() {
        if (instance == null) {
            instance = new Inventory();
        }
        return instance;
    }

    public void addGuitar(String serialNumber, double price, GuitarSpec spec) {
        Guitar guitar = new Guitar(serialNumber, price, spec);
        guitars.add(guitar);
    }

    public Guitar getGuitar(String serialNumber) {
        for (Guitar guitar : guitars) {
            if (guitar.getSerialNumber().equals(serialNumber)) {
                return guitar;
            }
        }
        return null;
    }

    public List<Guitar> search(GuitarSpec searchSpec) {
    	  return guitars.stream()
                  .filter(guitar -> guitar.getSpec().matches(searchSpec))
                  .collect(Collectors.toList());
    	  
    	  
    }
}

