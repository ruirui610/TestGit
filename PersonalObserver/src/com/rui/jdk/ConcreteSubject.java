package com.rui.jdk;

import java.util.Observable;

public class ConcreteSubject extends Observable {
	private String content;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
		//目標內容有變化
		this.setChanged();
		//采用拉模
		//this.notifyObservers();
		//采用推模式
		this.notifyObservers(content);
	}
}
