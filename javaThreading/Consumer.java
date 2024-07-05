package com.javaThreading;

public class Consumer extends Thread {

	private final SharedResource resource;

	public Consumer(SharedResource resource) {
		this.resource = resource;
	}

	public void run() {
		try {
			resource.consume();
			Thread.sleep(700);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}

}
