package br.com.ferraz.threads.calculator.main;

public class Teste {

	public static void main(String[] args) {
		Thread imprimeString = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Gravando no console......");
				
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				System.out.println("Pronto!");
			}
		});
		
		imprimeString.start();
	}
	
}
