package br.com.ferraz.threads.bathroom;

public class Number1 implements Runnable {

	private Bathroom bathroom;

	public Number1(Bathroom bathroom) {
		this.bathroom = bathroom;
	}
	
	@Override
	public void run() {
		bathroom.doNumber1();
	}

}
