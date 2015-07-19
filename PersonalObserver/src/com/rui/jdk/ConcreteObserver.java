package com.rui.jdk;

import java.util.Observable;

import com.rui.example.Observer;
import com.rui.example.WeatherSubject;

public class ConcreteObserver implements Observer, java.util.Observer {
	
	private String observerName;
	
	private String remindThings;

	@Override
	public void update(Observable o, Object arg) {
		System.out.println(observerName+"接受到。。"+arg+remindThings);
		//如果采用拉的方式
		//System.out.println(observerName+"接受到。。"+((ConcreteSubject)o).getContent());
	}

	public String getObserverName() {
		return observerName;
	}

	public void setObserverName(String observerName) {
		this.observerName = observerName;
	}

	public String getRemindThings() {
		return remindThings;
	}

	public void setRemindThings(String remindThings) {
		this.remindThings = remindThings;
	}

	@Override
	public void update(WeatherSubject subject) {
		// TODO Auto-generated method stub

	}

}
