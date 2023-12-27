package study.SimDuck;



public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public Duck() {}
	public abstract void display();
	public void swim() {
		System.out.println("모든 오리는 물에 뜹니다. 가짜 오리드 뜨죠.");
	}
	
	//인터페이스 호출
	public void performFly() {
		flyBehavior.fly();
	}
	public void performQuack() {
		quackBehavior.quack();
	}
	
	
	//세터 메소드
	public void setFlyBehavior(FlyBehavior fb) {
		flyBehavior = fb;
	}
	public void setQuackBehavior(QuackBehavior qb) {
		quackBehavior = qb;
	}
}
