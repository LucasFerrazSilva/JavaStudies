package br.com.ferraz.threads.bathroom;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Bathroom bathroom = new Bathroom();
		
		Thread guest1 = new Thread(new Number1(bathroom), "Joao");
		Thread guest2 = new Thread(new Number2(bathroom), "Pedro");
		Thread cleaning = new Thread(new Cleaning(bathroom), "Cleaning");
		cleaning.setDaemon(true);
		
		guest1.start();
		guest2.start();
		
		Thread.sleep(1000);
		
		cleaning.start();
	}
	
}
