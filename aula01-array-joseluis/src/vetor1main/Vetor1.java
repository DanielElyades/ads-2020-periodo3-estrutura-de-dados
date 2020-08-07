package vetor1main;

import java.util.Scanner;

public class Vetor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner tc = new Scanner(System.in);
		
		int num = 0;
		
		int[] vet = new int[5];
		for(int i = 0; i <= 5; i++) {
	    
			System.out.println("Informe o " + (i+1) + "º número: ");
			vet[i] = tc.nextInt();
			
//			for (int j = 0; j < vet.length; j++) {
//				if(num == vet[j]) {
//					System.out.println("Informe o "+(j)+"º número novamente" );
//					vet[j] = tc.nextInt();
//				}
//				
//			 num = vet[i];
//			
//			}
//			
		}
		//for(int i = 0; i < vet.length; i++) {
			
		//}
		for (int j = 0; j < vet.length; j++) {
			
		System.out.printf("Números: %d", vet[j]);
		}
		tc.close();
	}

}
