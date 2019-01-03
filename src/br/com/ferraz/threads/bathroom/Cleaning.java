package br.com.ferraz.threads.bathroom;

public class Cleaning implements Runnable {

	private Bathroom bathroom;

	public Cleaning(Bathroom bathroom) {
		this.bathroom = bathroom;
	}

	@Override
	public void run() {
		while(true) {
			this.bathroom.clean();
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
