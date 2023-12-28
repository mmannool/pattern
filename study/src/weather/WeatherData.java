package weather;
import java.util.*;


public class WeatherData implements Subject {
	private List<Observer> observers;  //observer ��ü ���� ����Ʈ
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		observers = new ArrayList<Observer>(); //�����ڸ� ���Ͽ� observer ��ü ����
	}
	
	//Subject ���
	public void registerObserver(Observer o) { //������ ���
		observers.add(o); //������ ����Ʈ �������� �߰�
	}
	public void removeObserver(Observer o) { //������ Ż��
		observers.remove(o); //������ ����Ʈ���� ����
	}
	public void notifyObservers() {
		for(Observer observer:observers) { //for(A:B) = B���� ���ʴ�� ��ü�� ���� A�� �Ҵ�(B�� ������ �� ����)
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
