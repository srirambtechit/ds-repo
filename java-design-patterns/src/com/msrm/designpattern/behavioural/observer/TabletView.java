package com.msrm.designpattern.behavioural.observer;

public class TabletView implements Observer {

	@Override
	public void update(String data) {
		System.out.println("TabletView : " + data);
	}

}
