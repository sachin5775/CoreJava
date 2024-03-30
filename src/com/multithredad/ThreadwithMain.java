package com.multithredad;

public class ThreadwithMain {
public static void main(String[] args) {
	MyThread myThread = new MyThread();
	Thread thread = new Thread(myThread);
	thread.start();
	MyThread2 myThread2 = new MyThread2();
	myThread2.start();
}
}
