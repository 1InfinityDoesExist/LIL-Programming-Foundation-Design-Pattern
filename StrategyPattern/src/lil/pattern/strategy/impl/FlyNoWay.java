package lil.pattern.strategy.impl;

import lil.pattern.strategy.FlyBehavior;

public class FlyNoWay implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("Kacchua bhaiya tortoise hey wood nahi payengay");
	}

}
