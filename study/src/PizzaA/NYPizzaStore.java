package PizzaA;

public class NYPizzaStore extends PizzaStore{
	protected Pizza createPizza(String item) {
		if(item.equals("cheese")) {
			return new NYCheesePizza();
		}else if(item.equals("pepperoni")) {
			return new NYPepperoniPizza();
		}else if(item.equals("clam")) {
			return new NYClamPizza();
		}else if(item.equals("veggie")) {
			return new NYVeggiePizza();
		}else return null; 
	}

}
