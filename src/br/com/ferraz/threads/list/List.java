package br.com.ferraz.threads.list;

public class List {
	
	private String[] elements = new String[1000];
	private int index = 0;
	
	
	public synchronized void add(String element) {
		this.elements[index] = element;
		this.index++;
	}
	
	public String get(int position) {
		return this.elements[position];
	}
	
	public int size() {
		return this.elements.length;
	}

}
