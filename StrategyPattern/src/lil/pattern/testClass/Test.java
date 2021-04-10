package lil.pattern.testClass;

import lil.pattern.Abstract.Duck;
import lil.pattern.Abstract.concret.DecoyDuck;
import lil.pattern.Abstract.concret.MallardDuck;
import lil.pattern.Abstract.concret.RedheadDuck;
import lil.pattern.Abstract.concret.RubberDuck;
import lil.pattern.strategy.impl.FlyNoWay;
import lil.pattern.strategy.impl.Quack;

public class Test {

	public static void main(String[] args) {

		Duck duck1 = new RubberDuck();
//		duck1.setFlyBehavior(new FlyNoWay());
//		duck1.setQuackBehavior(new Quack());

		System.out.println(duck1.display());
		duck1.flyBehavior.fly();
		duck1.quackBehavior.quack();
		System.out.println(duck1.swim());
	}

}
