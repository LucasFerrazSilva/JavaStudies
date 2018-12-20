package br.com.ferraz.threads.bathroom;

public class Number2 implements Runnable {

	private Bathroom bathroom;

	public Number2(Bathroom bathroom) {
		this.bathroom = bathroom;
	}
	
	@Override
	public void run() {
		bathroom.doNumber2();
	}
}
