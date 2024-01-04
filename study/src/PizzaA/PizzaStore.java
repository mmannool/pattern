package PizzaA;

public abstract class PizzaStore {
	/*
	SimplePizzaFactory factory;
	 
	
	public PizzaStore(SimplePizzaFactory factory) {
		this.factory = factory;
	}
	*/
	public Pizza orderPizza(String type) {
		Pizza pizza;
		
		//pizza = factory.createPizza(type);
		pizza = createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
	
	//팩토리 메소드 -> 객체 생성을 서브클래스에 캡슐화
	//abstract Product factoryMethod(String type)
	//abstract 추상 메소드 선언 -> 서브클래스가 객체 생성을 책임지도록
	//product 특정 객체 리턴 
	//factoryMethod 클라이언트(슈퍼클래스의 orderPizza())에서 실제로 생성되는 구상 객체가 무엇인지 알 수 없게 만듦
	protected abstract Pizza createPizza(String item);
}
