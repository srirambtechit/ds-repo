package com.msrm.designpattern.behavioural.observer.java.api;

import java.util.Observable;

public class StockProvider extends Observable {

	private float price = 2139.31f;

	public StockProvider() {
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
		setChanged();
		notifyObservers(this);
	}

}
