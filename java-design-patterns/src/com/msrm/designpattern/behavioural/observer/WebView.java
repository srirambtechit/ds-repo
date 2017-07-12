package com.msrm.designpattern.behavioural.observer;

public class WebView implements Observer {

	@Override
	public void update(String data) {
		System.out.println("WebView : " + data);
	}

}
