package starbuzz;

public class Espresso extends Beverage{
	public Espresso() {                //생성자 - 설명 변수값 설정
		description = "에스프레소";  
		}
	
	public double cost() {             //추상 클래스 구현, 가격 설정
		return 1.99;
	}
}
