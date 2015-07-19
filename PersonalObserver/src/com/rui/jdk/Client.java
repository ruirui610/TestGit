package com.rui.jdk;

public class Client {
	public static void main(String[] args){
		//创建目标
		ConcreteSubject subject=new ConcreteSubject();
		
		//创建观察者
		ConcreteObserver observerGirl=new ConcreteObserver();
		observerGirl.setObserverName("女朋友");
		observerGirl.setRemindThings("我们约会吧～～");
		
		ConcreteObserver observerMum=new ConcreteObserver();
		observerMum.setObserverName("Mum");
		observerMum.setRemindThings("出去shopping吧");
		
		//注册观察者
		subject.addObserver(observerMum);
		subject.addObserver(observerGirl);
		
		//目标事件
		subject.setContent("今天天气不错哦,");
	}
}
