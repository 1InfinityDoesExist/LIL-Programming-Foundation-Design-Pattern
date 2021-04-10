package lil.pattern.Abstract;

import lil.pattern.strategy.FlyBehavior;
import lil.pattern.strategy.QuackBehavior;

public abstract class Duck {

	public String swim() {
		return "I can swim...!!!";
	}

	public abstract String display();

	public FlyBehavior flyBehavior;
	public QuackBehavior quackBehavior;

	public Duck() {

	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}

	public void performQuack() {
		quackBehavior.quack();
	}

	public void performFly() {
		flyBehavior.fly();
	}

}
