package com.aurionpro.decorator.hat.model;

public class HatService {
	
	public IHat createStandradHat() {
		IHat hat =  new StandradHat();
		return hat;
	}

	public IHat createPremiumHat() {
		IHat hat =  new PremiumHat();
		return hat;
	}

	public IHat addGoldenRibbon(IHat hat) {
		IHat hat1 =  new GoldenRibbon(hat);
		return hat1;
		
	}
	public IHat addSilverRibbon(IHat hat) {
		IHat hat1 =  new SilverRibbon(hat);
		return hat1;
		
	}
}