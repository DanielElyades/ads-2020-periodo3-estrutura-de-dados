package exercio2;

public class Program {

	public static void main(String[] args) {

		int n = 1, num = 0, cont = 0,
				rest = 0, position = 0;
		boolean primo = true;
		int v1[] = new int[51];
		int v2[] = new int[n];
		
		
		System.out.println("Números positivos entre"
				+ " 1-50:");
		
		for (int i = 1; i < v1.length; i++) {
			
			v1[i] = i;
			num = v1[i];
			cont=0;
			for (int j = 0; j < v1.length; j++) {
				rest = j % num;
				if(rest == 0) cont++;				
			}
	
			if(cont == 2)v2[position] = i;
			
			
			System.out.println(v1[i]);
		}
		for (int x = 0; x < v2.length; x++) {
			
			System.out.println("Números primos no intervalo"
					+ " 1-50:");
			System.out.println(v2[x]);
			
			
		}

	}

}
