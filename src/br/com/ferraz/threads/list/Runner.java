package br.com.ferraz.threads.list;

public class Runner {
	
	public static void main(String[] args) throws InterruptedException {
		List list = new List();
		
		for (int i = 0 ; i < 10 ; i++) {
			new Thread(new TaskAddElement(list, i)).start();
		}
		
		Thread.sleep(1000);
		
		for(int i = 0 ; i < list.size() ; i++) {
			System.out.println(list.get(i));
		}
	}

}
