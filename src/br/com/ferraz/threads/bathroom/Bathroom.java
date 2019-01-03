package br.com.ferraz.threads.bathroom;

public class Bathroom {
	
	private boolean clean = false;

	public void doNumber1() {
		String guestName = Thread.currentThread().getName();
		
		System.out.println(guestName + " is knocking in the door");
		
		synchronized(this) {
			while(!clean) {
				waitUntilSomeoneClean(guestName);
			}
			
			System.out.println(guestName + " is doing number 1");
			
			this.clean = false;
			
			wait(1000);
			
			System.out.println(guestName + " is leaving bathroom");	
		}
	}
	
	public void doNumber2() {
		String guestName = Thread.currentThread().getName();
		
		System.out.println(guestName + " is knocking in the door");

		synchronized(this) {
			while(!clean) {
				waitUntilSomeoneClean(guestName);
			}
			
			System.out.println(guestName + " is doing number 2");
			
			this.clean = false;
			
			wait(1000);
			
			System.out.println(guestName + " is leaving bathroom");	
		}
	}
	
	public void clean() {
		String guestName = Thread.currentThread().getName();
		
		System.out.println(guestName + " is knocking in the door");

		synchronized(this) {
			if(clean) {
				System.out.println("Bathroom is already clean");
				return;
			}
			
			this.clean = true;

			System.out.println(guestName + " is cleaning the bathroom");
			
			wait(1000);
			
			this.notifyAll();
			
			System.out.println(guestName + " is leaving bathroom");	
		}
	}
	

	private void waitUntilSomeoneClean(String guestName) {
		System.out.println(guestName + " is not going to use the bathroom while it remains dirt..");
		
		try {
			this.wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private void wait(int millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
