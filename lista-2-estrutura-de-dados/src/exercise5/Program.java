package exercise5;

public class Program {
	
	public static void main(String args[]) {
		
		int min = 10, max = 101;
		int vet[] = new int[5];
		
		for (int i = 0; i < vet.length; i++) {
			
			vet[i] = (min - (int)(Math.random() * max - min)* -1);
			System.out.println("O "+(i+1)+"º número: "+ vet[i]);
			
		}
	}

}
