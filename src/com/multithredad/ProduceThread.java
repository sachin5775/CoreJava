package com.multithredad;

public class ProduceThread extends Thread {
	Companey c;

	public ProduceThread(Companey c) {
		this.c = c;
	}

	@Override
	public void run() {
		int i=1;
		while (true) {
			c.producer_item(i);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			i++;
		}
	}
}
