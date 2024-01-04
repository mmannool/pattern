package PizzaA;

public class PizzaTestDrive {
	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();               
		PizzaStore chicagoStore = new ChicagoPizzaStore();
		
		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("에단이 주문한 "+pizza.getName()+"\n");
		
		pizza = chicagoStore.orderPizza("cheese");
		System.out.println("조엘이 주문한 "+pizza.getName()+"\n");
	}
}

/*
준비 중: NY Style Sauce and Cheese Pizza
도우를 돌리는 중...
소스를 뿌리는 중...
토핑을 올리는 중:                                 //Pizza prepare()
 Grated Reggiano Cheese                      //NYCheesePizza toppings.add() 
175도에서 25분 간 굽기                           //Pizza bake()
피자를 사선으로 가르기                             //Pizza cut()
상자에 피자 담기                                 //Pizza box()
에단이 주문한 NY Style Sauce and Cheese Pizza

준비 중: Chicago Style Deep Dish Cheese Pizza
도우를 돌리는 중...
소스를 뿌리는 중...
토핑을 올리는 중: 
 Shredded Mozzarella Cheese                  //ChicagoCheesePizza toppings.add()
175도에서 25분 간 굽기
Cutting the pizza into square slices         //ChicagoCheesePizza cut() overide
상자에 피자 담기
조엘이 주문한 Chicago Style Deep Dish Cheese Pizza
*/
