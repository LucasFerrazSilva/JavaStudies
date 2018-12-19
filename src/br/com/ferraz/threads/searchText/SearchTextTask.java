package br.com.ferraz.threads.searchText;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SearchTextTask implements Runnable {
	
	private String FILE_PATH = "src/br/com/ferraz/threads/searchText/";
	private String fileName;
	private String name;

	
	public SearchTextTask(String fileName, String name) {
		this.fileName = fileName;
		this.name = name;
	}
	

	@Override
	public void run() {
		try {
			Scanner scanner = new Scanner(new File(FILE_PATH + fileName));
			
			int lineNumber = 1;
			
			while(scanner.hasNextLine()) {
				String line = scanner.nextLine();
				
				if(line.toLowerCase().contains(name.toLowerCase())) {
					System.out.println("Text '" + name + "' found in file '" + fileName + "' on line " + lineNumber + ": " + line);
				}
				
				lineNumber++;
			}
			
			scanner.close();			
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}
	}

}
