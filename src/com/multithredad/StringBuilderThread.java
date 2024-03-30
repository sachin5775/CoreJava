package com.multithredad;

public class StringBuilderThread {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		Runnable r = () -> {
			for (int i = 0; i < 1000; i++) {
				sb.append("B");
			}
		};

		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);

		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println("Expected Lengh should be 2000 but we get " + sb.length());
	}

}
