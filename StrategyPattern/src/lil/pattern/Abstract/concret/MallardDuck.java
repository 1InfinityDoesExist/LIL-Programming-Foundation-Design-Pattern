package lil.pattern.Abstract.concret;

import lil.pattern.Abstract.Duck;
import lil.pattern.strategy.impl.FlyWithWings;
import lil.pattern.strategy.impl.Quack;

public class MallardDuck extends Duck {

	public MallardDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}

	@Override
	public String display() {
		return "I am mallardDuck and i am red in color.";
	}

}
