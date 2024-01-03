package starbuzz;

public class Mocha extends CondimentDecorator{
	
	public Mocha(Beverage beverage) {
		this.beverage = beverage;        //매개변수로 받은 beverage 객체를 condimentDecorator에서 상속받은 beverage 객체에 덮어씌움
	}
	
	public String getDescription() {
		return beverage.getDescription() + ", 모카";
	}
	
	public double cost() {
		return beverage.cost() + 0.20;
	}

}
