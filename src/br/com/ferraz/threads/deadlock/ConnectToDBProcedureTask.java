package br.com.ferraz.threads.deadlock;

public class ConnectToDBProcedureTask implements Runnable {

	private ConnectionPool pool;
	private TransactionManager tm;

	
	public ConnectToDBProcedureTask(ConnectionPool pool, TransactionManager tm) {
		this.pool = pool;
		this.tm = tm;
	}
	

	@Override
	public void run() {
		synchronized (tm) {
			System.out.println("Starting to manage the transaction");
			
			tm.begin();
			
			synchronized (pool) {
				System.out.println("Getting connection");
				
				pool.getConnection();
			}
		}
	}

}
