//import java.util.ArrayList;
//import java.util.List;
import java.util.Random;

public class Exercicio1DrawHighestLower {

	public static void main(String[] args) {
		
		//List<Number> list = new ArrayList<>();
		int value[] = new int[16];
		int highestValue = value[0];
		int highestValue2 = value[0];
		
		
		for (int i = 0; i < value.length; i++) {
			int number = new Random().nextInt();
			value[i] = number;
			System.out.println((i+1)+"º  "+value[i]);
			
			if(value[i] > highestValue) {
				highestValue = value[i];
				}
			if((value[i] > highestValue2) && (value[i] != highestValue)) {
					highestValue2 = value[i];
				}
		}	
		
		System.out.println();
		System.out.println("Maior valor: " + highestValue);
		System.out.println("Segundo maior valor: " + highestValue2);
		
}
}

