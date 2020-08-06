package vetor1main;

import java.util.Scanner;

public class Vetor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner tc = new Scanner(System.in);
		
		int[] vet = new int[15];
		for(int i = 0; i <= 15; i++) {
	    
			System.out.println("Informe o " + (i+1) + "º número: ");
			vet[i] = tc.nextInt();
			
		}
		for(int i = 0; i < vet.length; i++) {
//		int num = vet[i];
//		if(num < )
		for (int j = 0; j < vet.length; j++) {
			if(vet[j] > vet[j + 1]) {
			int aux = vet[j + 1];
			vet[j + 1] = vet[j];
			}
		}	
		}

	}

}
