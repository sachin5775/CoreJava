package com.multithredad;

public class Companey {
	int n;
	boolean flag = false;

	synchronized public void producer_item(int n) {
		if (flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.n = n;
		System.out.println("Procuce " + this.n);
		flag = true;
		notify();
	}

	synchronized public int consume_item() {
		if (!flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Consume " + this.n);
		flag = false;
		notify();
		return this.n;
	}

	public static void main(String[] args) {
		Companey c = new Companey();
		ProduceThread pt = new ProduceThread(c);
		ConsumerThread ct = new ConsumerThread(c);
		pt.start();
		ct.start();
	}
}
