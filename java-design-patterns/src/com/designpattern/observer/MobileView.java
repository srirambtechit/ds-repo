package com.designpattern.observer;

public class MobileView implements Observer {

	@Override
	public void update(String data) {
		System.out.println("MobileView : " + data);
	}

}
