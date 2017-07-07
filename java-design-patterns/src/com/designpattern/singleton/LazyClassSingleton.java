package com.designpattern.singleton;

import java.io.Serializable;

public class LazyClassSingleton implements Serializable {

    private static final long serialVersionUID = 1L;

    private LazyClassSingleton() {
	if (FooInstance.instance != null) {
	    throw new IllegalArgumentException("Instance already created");
	}
    }

    private static class FooInstance {
	private static final LazyClassSingleton instance = new LazyClassSingleton();
    }

    public static LazyClassSingleton getInstance() {
	return FooInstance.instance;
    }

    @SuppressWarnings("unused")
    private LazyClassSingleton readResolve() {
	return FooInstance.instance;
    }

}
