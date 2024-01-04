package PizzaA;
 import java.util.*;

abstract public class Pizza {
	String name;
	String dough;
	String sauce;
	List<String> toppings = new ArrayList<String>();
	
	void prepare() {
		System.out.println("�غ� ��: "+name);
		System.out.println("���츦 ������ ��...");
		System.out.println("�ҽ��� �Ѹ��� ��...");
		System.out.println("������ �ø��� ��: ");
		for(String topping:toppings)
		{
			System.out.println(" "+topping);
		}
	}
	
	public String getName() {
		return name;
	}

	void bake() {
		System.out.println("175������ 25�� �� ����");
	}

	void cut() {
		System.out.println("���ڸ� �缱���� ������");
	}

	public void box() {
		System.out.println("���ڿ� ���� ���");
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