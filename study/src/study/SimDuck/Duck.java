package study.SimDuck;



public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public Duck() {}
	public abstract void display();
	public void swim() {
		System.out.println("��� ������ ���� ��ϴ�. ��¥ ������ ����.");
	}
	
	//�������̽� ȣ��
	public void performFly() {
		flyBehavior.fly();
	}
	public void performQuack() {
		quackBehavior.quack();
	}
	
	
	//���� �޼ҵ�
	public void setFlyBehavior(FlyBehavior fb) {
		flyBehavior = fb;
	}
	public void setQuackBehavior(QuackBehavior qb) {
		quackBehavior = qb;
	}
}
