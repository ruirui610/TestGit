package com.rui.example;

import java.util.ArrayList;
import java.util.List;

public class WeatherSubject {
	//观察者列表
	private List<Observer> observers=new ArrayList<Observer>();
	
	//添加观察者
	public void attch(Observer observer){
		observers.add(observer);
	}
	
	//移除观察者
	public void detach(Observer observer){
		observers.remove(observer);
	}
	
	//遍历观察者列表，然后通知他们
	public void notifyObserver(){
		for(Observer observer:observers){
			//采用拉模式
			observer.update(this);
		}
	}
}
