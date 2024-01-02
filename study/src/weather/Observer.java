package weather;


//옵저버 인터페이스 - 모든 옵저버 클래스들이 구현해야함
public interface Observer {
	//public void update(float temp, float humidity, float pressure); //상태 업데이트
	public void update();
}
