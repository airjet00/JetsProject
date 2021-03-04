package com.skilldistillery.jets;

public class FighterJet extends Jet{
	boolean isFighter;
	public FighterJet(String model, double speed, int range, long price, boolean isFighter) {
		super(model, speed, range, price);
		this.isFighter = isFighter;
	}

	public void dogFight() {
		System.out.println("Engaging the enemy in air to air combat!");
	}

	

}
