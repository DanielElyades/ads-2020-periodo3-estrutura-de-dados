package exercise3;

public class Program {

	public static void main(String[] args) {
		
		int min = 1, max = 6;
		int array[] = new int[20];
		int nota1 = 0, nota2 = 0, nota3 = 0,
			nota4 = 0, nota5 = 0, nota4e5 = 0;
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random()*(max-min))+min;
			
			System.out.println((i + 1) + "ª nota: " + array[i]);
			
			if(array[i] == 1) {
			nota1++;
		}
			if(array[i] == 2) {
				nota2++;
			}
			if(array[i] == 3) {
				nota3++;
			}
			if(array[i] == 4) {
				nota4++;
			}
			if(array[i] == 5) {
				nota5++;
			}
			nota4e5 = nota4 + nota5;
		}
		System.out.println("A quantidade de notas 1: " + nota1);
		System.out.println("A quantidade de notas 2: " + nota2);
		System.out.println("A quantidade de notas 3: " + nota3);
		System.out.println("A quantidade de notas 4: " + nota4);
		System.out.println("A quantidade de notas 5: " + nota5);
		System.out.println("A quantidade de notas 4 e 5: " + nota4e5);

	}

}
