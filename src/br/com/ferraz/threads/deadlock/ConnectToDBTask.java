package br.com.ferraz.threads.deadlock;

public class ConnectToDBTask implements Runnable {

	private ConnectionPool pool;
	private TransactionManager tm;

	
	public ConnectToDBTask(ConnectionPool pool, TransactionManager tm) {
		this.pool = pool;
		this.tm = tm;
	}

	@Override
	public void run() {
		synchronized (pool) {
			System.out.println("Got pool");
			
			pool.getConnection();
			
			synchronized (tm) {
				System.out.println("Starting to manage the transaction");
				
				tm.begin();
			}
		}
	}

}
