package study.SimDuck;

public class MiniDuckSimulator {
	public static void main(String[] args) {
		//mallard
		Duck mallard = new MallardDuck();
		mallard.performFly();
		mallard.performQuack();

		//rocket
		Duck model = new ModelDuck(); 
		model.performFly();                              //NoFlyWay
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();                              //FlyRocketPw
		
	}
}
