package br.com.ferraz.threads.bathroom;

public class Bathroom {

	public void doNumber1() {
		String guestName = Thread.currentThread().getName();
		
		System.out.println(guestName + " is knocking in the door");
		
		synchronized(this) {
			System.out.println(guestName + " is doing number 1");
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println(guestName + " is leaving bathroom");	
		}
	}
	
	public void doNumber2() {
		String guestName = Thread.currentThread().getName();
		
		System.out.println(guestName + " is knocking in the door");

		synchronized(this) {
			System.out.println(guestName + " is doing number 2");
			
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(guestName + " is leaving bathroom");	
		}
	}
	
}
