package com.msrm.designpattern.behavioural.observer.java.api;

import java.util.Observable;
import java.util.Observer;

public class TabletView implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		StockProvider stockProvider = (StockProvider) o;
		System.out.println("Current price is " + stockProvider.getPrice() + " at Tablet");
	}

}
