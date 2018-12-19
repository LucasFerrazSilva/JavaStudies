package br.com.ferraz.threads.searchText;

public class Runner {

	public static void main(String[] args) {
		String name = "da";
		
		Thread threadSignatures1 = new Thread(new SearchTextTask("assinaturas1.txt", name));
		Thread threadSignatures2 = new Thread(new SearchTextTask("assinaturas2.txt", name));
		Thread threadAuthors = new Thread(new SearchTextTask("autores.txt", name));
		
		threadSignatures1.start();
		threadSignatures2.start();
		threadAuthors.start();
	}

}
