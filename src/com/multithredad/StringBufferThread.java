package com.multithredad;

public class StringBufferThread {
 

public static void main(String[] args) {
	StringBuffer sb = new StringBuffer();
	Runnable r = ()->{
		 for (int i = 0; i < 10000; i++) {
			 sb.append("B");
         }
	};
	
	Thread t1 = new Thread(r);
	Thread t2 = new Thread(r);
	
	t1.start();
	t2.start();
	try {
		t1.join();
		t1.wait(3);
		t2.join();
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
	
	System.out.println("Expected Lengh should be 20000 but we get "+ sb.length());
}
}
