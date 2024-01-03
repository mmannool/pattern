package starbuzz;

public class Soy extends CondimentDecorator{
	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}
	
	public String getDescription() {
		return beverage.getDescription() + ", µŒ¿Ø";
	}
	
	public double cost() {
		return beverage.cost() + 0.15 ;
	}
}
