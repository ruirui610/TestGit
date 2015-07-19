package com.rui.example;

public class Client {

	public static void main(String[] args) {
		//創建目標
		ConcreteWeatherSubject subject=new ConcreteWeatherSubject();
		//创建观察者
		ConcreteObserver observerGirl=new ConcreteObserver();
		observerGirl.setObserverName("女朋友");
		observerGirl.setRemindThings("，约会去吧");
		
		ConcreteObserver observerMum=new ConcreteObserver();
		observerMum.setObserverName("Mum");
		observerMum.setRemindThings("，去shopping吧");
		
		//注册观察者
		subject.attch(observerMum);
		subject.attch(observerGirl);
		
		//发布具体消息
		subject.setWeatherContent("今天天气很好");
	}

}
