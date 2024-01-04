package PizzaA;

public class PizzaTestDrive {
	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();               
		PizzaStore chicagoStore = new ChicagoPizzaStore();
		
		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("������ �ֹ��� "+pizza.getName()+"\n");
		
		pizza = chicagoStore.orderPizza("cheese");
		System.out.println("������ �ֹ��� "+pizza.getName()+"\n");
	}
}

/*
�غ� ��: NY Style Sauce and Cheese Pizza
���츦 ������ ��...
�ҽ��� �Ѹ��� ��...
������ �ø��� ��:                                 //Pizza prepare()
 Grated Reggiano Cheese                      //NYCheesePizza toppings.add() 
175������ 25�� �� ����                           //Pizza bake()
���ڸ� �缱���� ������                             //Pizza cut()
���ڿ� ���� ���                                 //Pizza box()
������ �ֹ��� NY Style Sauce and Cheese Pizza

�غ� ��: Chicago Style Deep Dish Cheese Pizza
���츦 ������ ��...
�ҽ��� �Ѹ��� ��...
������ �ø��� ��: 
 Shredded Mozzarella Cheese                  //ChicagoCheesePizza toppings.add()
175������ 25�� �� ����
Cutting the pizza into square slices         //ChicagoCheesePizza cut() overide
���ڿ� ���� ���
������ �ֹ��� Chicago Style Deep Dish Cheese Pizza
*/
