package com.msrm.designpattern.behavioural.observer;

public class ObserverPatternApp {

	public static void main(String[] args) {

		MobileView mv = new MobileView();
		TabletView tv = new TabletView();
		WebView wv = new WebView();

		StockDataProvider sdp = new StockDataProvider();
		sdp.attach(mv);
		sdp.attach(tv);
		sdp.attach(wv);

		System.out.println("Current price : " + sdp.getMarketPrice());

		// There is sudden hike in price, which notified to its all subscribers
		sdp.setMarketPrice("21,100.25");

	}

}
