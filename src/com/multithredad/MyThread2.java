package com.multithredad;

public class MyThread2 extends Thread{
@Override
public void run() {
for (int i= 20;i>=1;i--) {
	System.out.println("The current value of myThread2 is"+ i);
	try {
		sleep(1000);
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
	
}
}
}
