package br.com.ferraz.threads.bathroom;

public class Main {

	public static void main(String[] args) {
		Bathroom bathroom = new Bathroom();
		
		Thread guest1 = new Thread(new Number1(bathroom), "Joao");
		Thread guest2 = new Thread(new Number2(bathroom), "Pedro");
		
		guest1.start();
		guest2.start();
	}
	
}
