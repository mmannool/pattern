package weather;

public class WeatherStation {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData); //현재 상태
		//StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);            //통계
		//ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);                  //예보 
		HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);
		
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 30.4f); //새로운 가상 특정값이 들어왔다고 가정
		weatherData.setMeasurements(78, 90, 29.2f);
	}
}
