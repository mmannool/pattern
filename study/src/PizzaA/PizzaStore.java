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
	
	//���丮 �޼ҵ� -> ��ü ������ ����Ŭ������ ĸ��ȭ
	//abstract Product factoryMethod(String type)
	//abstract �߻� �޼ҵ� ���� -> ����Ŭ������ ��ü ������ å��������
	//product Ư�� ��ü ���� 
	//factoryMethod Ŭ���̾�Ʈ(����Ŭ������ orderPizza())���� ������ �����Ǵ� ���� ��ü�� �������� �� �� ���� ����
	protected abstract Pizza createPizza(String item);
}
