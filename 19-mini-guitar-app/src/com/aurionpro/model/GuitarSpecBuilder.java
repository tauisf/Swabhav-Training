package com.aurionpro.model;

public class GuitarSpecBuilder {
	 private Builder builder;
	    private String model;
	    private Type type;
	    private Wood backWood;
	    private Wood topWood;

	    public GuitarSpecBuilder setBuilder(Builder builder) {
	        this.builder = builder;
	        return this;
	    }

	    public GuitarSpecBuilder setModel(String model) {
	        this.model = model;
	        return this;
	    }

	    public GuitarSpecBuilder setType(Type type) {
	        this.type = type;
	        return this;
	    }

	    public GuitarSpecBuilder setBackWood(Wood backWood) {
	        this.backWood = backWood;
	        return this;
	    }

	    public GuitarSpecBuilder setTopWood(Wood topWood) {
	        this.topWood = topWood;
	        return this;
	    }

	    public GuitarSpec build() {
	        return new GuitarSpec(builder, model, type, backWood, topWood);
	    }
}
