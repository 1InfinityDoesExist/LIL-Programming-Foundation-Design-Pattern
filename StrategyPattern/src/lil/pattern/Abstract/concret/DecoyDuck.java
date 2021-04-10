package lil.pattern.Abstract.concret;

import lil.pattern.Abstract.Duck;
import lil.pattern.strategy.impl.FlyNoWay;
import lil.pattern.strategy.impl.FlyWithWings;
import lil.pattern.strategy.impl.Mute;

public class DecoyDuck extends Duck {

	public DecoyDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Mute();
	}

	@Override
	public String display() {

		return "I am green in color";
	}

}
