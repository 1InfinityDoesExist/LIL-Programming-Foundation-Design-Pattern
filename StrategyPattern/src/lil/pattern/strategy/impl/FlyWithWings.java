package lil.pattern.strategy.impl;

import lil.pattern.strategy.FlyBehavior;

public class FlyWithWings implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("I can fly with my wings high up in the sky");
	}

}
