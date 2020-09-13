package view;

import java.util.Arrays;

import controller.ThreadVetor;

public class Principal {
	public static void main(String[] args) {
		int [] vetor = new int[1000];
		
		for (int i = 0; i<1000; i++) {
			vetor[i] = (int) (Math.random() * (101 - 0))+1;
		}
		System.out.println("Vetor criado: " + Arrays.toString(vetor) + "\n");
		
		Thread arrayFor = new ThreadVetor(2, vetor);
		arrayFor.start();
		
		Thread arrayForEach = new ThreadVetor(1, vetor);
		arrayForEach.start();
	}

}
