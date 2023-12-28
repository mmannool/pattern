package weather;
import java.util.*;


public class WeatherData implements Subject {
	private List<Observer> observers;  //observer 객체 저장 리스트
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		observers = new ArrayList<Observer>(); //생성자를 통하여 observer 객체 생성
	}
	
	//Subject 상속
	public void registerObserver(Observer o) { //옵저버 등록
		observers.add(o); //옵저버 리스트 마지막에 추가
	}
	public void removeObserver(Observer o) { //옵저버 탈퇴
		observers.remove(o); //옵저버 리스트에서 제거
	}
	public void notifyObservers() {
		for(Observer observer:observers) { //for(A:B) = B에서 차례대로 객체를 꺼내 A에 할당(B가 존재할 때 까지)
			observer.update(temperature, humidity, pressure);
		}
	}
	
	public void measurementsChanged() {
		/*
		float temp = getTemperature();
		float humidity = getHumidity();
		float pressure = getPressure();
		
		currentConditionsDisplay.update(temp, humidity, pressure);
		statisticsDisplay.update(temp, humidity, pressure);
		forecastDisplay.update(temp, humidity, pressure);
		*/
		notifyObservers();
	}
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
	
	
	public float getTemperature() {
		return temperature;
	}
	public float getHumidity() {
		return humidity;
	}
	public float getPressure() {
		return pressure;
	}
	
	
}
