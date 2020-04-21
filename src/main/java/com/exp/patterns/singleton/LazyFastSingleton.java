package com.exp.patterns.singleton;

public class LazyFastSingleton {

	private static volatile LazyFastSingleton instance;

	private LazyFastSingleton() {
	}

	public static LazyFastSingleton instance() {

		if (instance == null) {

			synchronized (LazyFastSingleton.class) {

				if (instance == null) {
					instance = new LazyFastSingleton();
				}
			}

		}

		return instance;
	}

}
