package com.msrm.designpattern.observer;

public class TabletView implements Observer {

	@Override
	public void update(String data) {
		System.out.println("TabletView : " + data);
	}

}
