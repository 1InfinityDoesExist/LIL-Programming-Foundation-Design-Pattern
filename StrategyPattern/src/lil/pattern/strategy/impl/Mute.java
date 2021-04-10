package lil.pattern.strategy.impl;

import lil.pattern.strategy.QuackBehavior;

public class Mute implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("I can't quack....!!!!!");
	}

}
