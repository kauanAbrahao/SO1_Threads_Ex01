package controller;

public class ThreadVetor extends Thread {
	private int num;
	private int[] vetor = new int[1000];
	
	public ThreadVetor(int num, int[] vetor) {
		this.num = num;
		this.vetor = vetor;
	}
	
	
	public void run () {
		if (num % 2 == 0) {
			percorreFor();
		}
		else {
			percorreForEach();
		}
	}
	private void percorreForEach() {
		double ti = System.nanoTime();
		for (int r : vetor){
			r = r + r;
		}
		double tf = System.nanoTime();
		double te = (tf - ti)/Math.pow(10, 9);
		System.out.println("A duração com laço FOREACH foi: " + te + " segundos.");
	}


	private void percorreFor() {
		int r = 0;
		double ti = System.nanoTime();
		for (int i = 0; i < vetor.length; i++) {
			r = r + vetor[i];
		}
		double tf = System.nanoTime();
		double te = (tf - ti)/Math.pow(10, 9);
		System.out.println("A duração com laço FOR foi: " + te + " segundos.");
		
	}
	
	

}
