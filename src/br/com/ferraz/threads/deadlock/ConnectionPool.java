package br.com.ferraz.threads.deadlock;

public class ConnectionPool {
	
	public String getConnection() {
        System.out.println("Giving connection");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return "connection";
    }

}
