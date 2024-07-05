package com.javaThreading;

public class Producer extends Thread {

	private final SharedResource resource;

	public Producer(SharedResource resource) {
		this.resource = resource;
	}

	public void run() {
		try {
			resource.produce();
			Thread.sleep(700);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}

}
