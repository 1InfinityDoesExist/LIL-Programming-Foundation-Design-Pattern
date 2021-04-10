package lil.pattern.Abstract.concret;

import lil.pattern.Abstract.Duck;
import lil.pattern.strategy.impl.FlyNoWay;
import lil.pattern.strategy.impl.Mute;

public class RubberDuck extends Duck {

	public RubberDuck() {
		this.flyBehavior = new FlyNoWay();
		this.quackBehavior = new Mute();
	}

	@Override
	public String display() {

		return "I am rubber duck...!!!";
	}

}
