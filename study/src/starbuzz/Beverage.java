package starbuzz;

public abstract class Beverage {
	public enum Size {TALL, GRANDE, VENTI}
	Size size = Size.TALL;
	String description = "제목 없음";     //음료 설명 
	
	public String getDescription() {   //음료 설명 게터
		return description;
	}
	public void setSize(Size size) {
		this.size = size;
	}
	public Size getSize() {
		return this.size;
	}
	
	public abstract double cost();     //가격 함수 => 추상 메소드=서브클래스에서 구현
	
}
