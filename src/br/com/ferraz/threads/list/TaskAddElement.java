package br.com.ferraz.threads.list;

public class TaskAddElement implements Runnable {

	private List list;
	private int threadNumber;

	
	public TaskAddElement(List list, int threadNumber) {
		this.list = list;
		this.threadNumber = threadNumber;
	}
	

	@Override
	public void run() {
		for(int i = 0 ; i < 100 ; i++) {
			try {
				list.add("Thread " + threadNumber + " - " + i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
