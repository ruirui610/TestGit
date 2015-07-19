package com.rui.example;

public class ConcreteWeatherSubject extends WeatherSubject {
	private String weatherContent;

	public String getWeatherContent() {
		return weatherContent;
	}

	public void setWeatherContent(String weatherContent) {
		this.weatherContent = weatherContent;
		//有更新，通知观察者们
		this.notifyObserver();
	}
	
	
}
