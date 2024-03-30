package com.multithredad;

public class ConsumerThread extends Thread {
	Companey c;

	public ConsumerThread(Companey c) {
		this.c = c;
	}

	@Override
	public void run() {
		while (true) {
			c.consume_item();
			try {
				sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
