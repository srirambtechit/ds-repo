package com.msrm.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public class StockDataProvider implements Subject {

	List<Observer> observers;

	// Assuming at present marketPrice of XYZ Inc, company stock price
	private String marketPrice = "21,200.78";

	public StockDataProvider() {
		observers = new ArrayList<>();
	}

	public void setMarketPrice(String marketPrice) {
		this.marketPrice = marketPrice;
		notifyChange();
	}

	public String getMarketPrice() {
		return marketPrice;
	}

	@Override
	public void attach(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void detach(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyChange() {
		observers.forEach(o -> {
			o.update(marketPrice);
		});
	}

}
