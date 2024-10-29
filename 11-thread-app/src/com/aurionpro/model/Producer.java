package com.aurionpro.model;

public class Producer implements Runnable {
	Q q;

	public Producer(Q q) {
		super();
		this.q = q;
		new Thread(this, "Producer").start();
	}

	@Override
	public void run() {
		int i = 0;
		while (i < 100) {
			q.put(i++);
		}

	}

}
