package PizzaA;
 import java.util.*;

abstract public class Pizza {
	String name;
	String dough;
	String sauce;
	List<String> toppings = new ArrayList<String>();
	
	void prepare() {
		System.out.println("준비 중: "+name);
		System.out.println("도우를 돌리는 중...");
		System.out.println("소스를 뿌리는 중...");
		System.out.println("토핑을 올리는 중: ");
		for(String topping:toppings)
		{
			System.out.println(" "+topping);
		}
	}
	
	public String getName() {
		return name;
	}

	void bake() {
		System.out.println("175도에서 25분 간 굽기");
	}

	void cut() {
		System.out.println("피자를 사선으로 가르기");
	}

	public void box() {
		System.out.println("상자에 피자 담기");
	}

	/*
	public String toString() {
		// code to display pizza name and ingredients
		StringBuffer display = new StringBuffer();
		display.append("---- " + name + " ----\n");
		display.append(dough + "\n");
		display.append(sauce + "\n");
		for (String topping : toppings) {
			display.append(topping + "\n");
		}
		return display.toString();
	}
	*/
}