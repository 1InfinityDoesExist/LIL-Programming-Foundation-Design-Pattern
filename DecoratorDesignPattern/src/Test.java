
public class Test {
	public static void main(String[] args) {

		Beverage beverage = new DarkRoast();
		beverage = new Milk(beverage);
		System.out.println(beverage.getDescription() + " $" + beverage.cost());

	}

}
