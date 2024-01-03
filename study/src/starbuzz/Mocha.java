package starbuzz;

public class Mocha extends CondimentDecorator{
	
	public Mocha(Beverage beverage) {
		this.beverage = beverage;        //�Ű������� ���� beverage ��ü�� condimentDecorator���� ��ӹ��� beverage ��ü�� �����
	}
	
	public String getDescription() {
		return beverage.getDescription() + ", ��ī";
	}
	
	public double cost() {
		return beverage.cost() + 0.20;
	}

}
