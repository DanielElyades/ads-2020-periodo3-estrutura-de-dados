package vetor1main;

import java.util.Scanner;

public class Vetor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner tc = new Scanner(System.in);
		
		int[] vet = new int[15];
		
		
			System.out.println("Digite números distintos:");
			for (int j = 0; j < vet.length; j++) {
				
			System.out.print("Informe o " + (j + 1) + "º número: ");
			vet[j] = tc.nextInt();
			
			for (int i = j-1; i >= 0; i--) {
				if(vet[i] == vet[j]) {
					System.out.println("Informe o número novamente: ");
					vet[j] = tc.nextInt();
				}
				
			}
			}
			
		
		tc.close();
	}

}
