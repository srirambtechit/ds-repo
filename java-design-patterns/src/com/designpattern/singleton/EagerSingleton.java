package com.designpattern.singleton;

// eager initialization of Singleton object
public final class EagerSingleton {

    private static volatile EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
	return instance;
    }
}
