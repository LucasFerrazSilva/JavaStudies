package br.com.ferraz.threads.deadlock;

public class Main {

    public static void main(String[] args) {
        TransactionManager tm = new TransactionManager();
        ConnectionPool pool = new ConnectionPool();

        new Thread(new ConnectToDBTask(pool, tm)).start();
        new Thread(new ConnectToDBProcedureTask(pool, tm)).start();
    }
	
}
