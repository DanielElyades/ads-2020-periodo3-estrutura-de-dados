import java.util.Random;

public class Exercicio4IntCresecente {

	public static void main(String[] args) {
		
		int highest=-999999999 , 
				medium=0, 
				lower = 999999999 ;
		
		System.out.println("      Números sorteados ");
		for (int i = 0; i < 3; i++) {
		
		int number = new Random().nextInt();
		System.out.print(number + " ");
		
		if(number > highest) {
			highest = number;
			
		}
		if(number < lower) {
			lower = number;
		}
		if(number < highest && number > lower ){
		
			medium = number;	
		}
		
		}
		System.out.println();
		System.out.println("Menor número: " + lower
				+"\nNúmero médio: "+medium
				+"\nMaior número: "+highest);
		
	}

}
