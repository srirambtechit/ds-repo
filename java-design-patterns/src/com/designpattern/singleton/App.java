package com.designpattern.singleton;

public class App {

    public static void main(String[] args) {

	Thread t1 = new Thread(new Runnable() {
	    public void run() {
		EagerSingleton o = EagerSingleton.getInstance();
		System.out.println(o.hashCode());

		LazySingleton instance = LazySingleton.getInstance();
		System.out.println("instance : " + instance.hashCode());
	    }
	});

	Thread t2 = new Thread(new Runnable() {
	    public void run() {
		EagerSingleton o = EagerSingleton.getInstance();
		System.out.println(o.hashCode());

		LazySingleton instance = LazySingleton.getInstance();
		System.out.println("instance : " + instance.hashCode());
	    }
	});

	t1.start();
	t2.start();

	Runtime.getRuntime();
    }

}
