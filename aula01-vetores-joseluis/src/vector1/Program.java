package vector1;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner tc = new Scanner(System.in);
		Vector[] vector = new Vector[17];
		for (int i = 1; i < vector.length; i++ ) {
			System.out.println("Informe o "+(i)+"º número: ");
			int num = tc.nextInt();
		}
tc.close();
	}

}
