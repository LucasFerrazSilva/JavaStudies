package br.com.ferraz.threads.printNumbers;

public class Main {

	public static void main(String[] args) {
		new Thread(new PrintNumbers()).start();
		new Thread(new PrintNumbers()).start();
	}

}

class PrintNumbers implements Runnable {

	@Override
	public void run() {
		for (int i = 0 ; i < 1000 ; i++) {
			System.out.println(Thread.currentThread().getId() + " - " + i);
		}
	}
	
}
