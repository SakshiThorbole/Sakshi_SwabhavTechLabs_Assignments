package com.aurionpro.creational.builder.model;

public class House {
	private String foundation;
	private String structure;
	
	private final boolean hasGarden;
    private final boolean hasSwimmingPool;
	
	House(HouseBuilder builder) {
		this.foundation = builder.foundation;
		this.structure = builder.structure;
		this.hasGarden = builder.hasGarden;
		this.hasSwimmingPool = builder.hasSwimmingPool;
	}

	@Override
	public String toString() {
		return "House [foundation = " + foundation + ", structure = " + structure + ", hasGarden = " + hasGarden
				+ ", hasSwimmingPool = " + hasSwimmingPool + "]";
	}
}
