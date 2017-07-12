package com.msrm.designpattern.behavioural.observer.java.api;

public class ObserverPatternApp {

	public static void main(String[] args) {
		StockProvider sp = new StockProvider();
		System.out.println("Current price is " + sp.getPrice() + " at Application");

		MobileView mv = new MobileView();
		WebView wv = new WebView();
		TabletView tv = new TabletView();

		sp.addObserver(mv);
		sp.addObserver(wv);
		sp.addObserver(tv);

		sp.setPrice(3004.23f);
		System.out.println("Current price is " + sp.getPrice() + " at Application");
	}

}
