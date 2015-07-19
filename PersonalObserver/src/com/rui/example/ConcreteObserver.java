package com.rui.example;

public class ConcreteObserver implements Observer {

	private String ObserverName;

	private String weatherContent;

	private String RemindThings;

	public String getObserverName() {
		return ObserverName;
	}

	public void setObserverName(String observerName) {
		ObserverName = observerName;
	}

	public String getRemindThings() {
		return RemindThings;
	}

	public void setRemindThings(String remindThings) {
		RemindThings = remindThings;
	}

	@Override
	public void update(WeatherSubject subject) {
		weatherContent = ((ConcreteWeatherSubject) subject).getWeatherContent();
		System.out.println(ObserverName + "收到了。。" + weatherContent + RemindThings);
	}

}
