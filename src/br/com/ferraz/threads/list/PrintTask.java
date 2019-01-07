package br.com.ferraz.threads.list;

public class PrintTask implements Runnable {

	private List list;

	public PrintTask(List list) {
		this.list = list;
	}

	@Override
	public void run() {
		synchronized(list) {
			if (!list.isFull()) {
				try {
					System.out.println("Waiting list to be filled");
					list.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			for(int i = 0 ; i < list.size() ; i++) {
				System.out.println(list.get(i));
			}
		}
	}

}
