package starbuzz;

public abstract class CondimentDecorator extends Beverage{    //추상 데코레이터
	public Beverage beverage;
	public abstract String getDescription(); //추상 메소드 => 첨가물 데코레이터에서 설명 추가
	
	public Size getSize() {
		return beverage.getSize();
	}
}
