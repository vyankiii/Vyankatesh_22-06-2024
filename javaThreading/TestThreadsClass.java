package com.javaThreading;

public class TestThreadsClass {

	public static void main(String[] args) {

		SharedResource resource = new SharedResource();

		Producer producer = new Producer(resource);
		Consumer consumer = new Consumer(resource);

		producer.setName("Producer");
		producer.start();

		consumer.setName("Consumer");
		consumer.start();

	}

}
