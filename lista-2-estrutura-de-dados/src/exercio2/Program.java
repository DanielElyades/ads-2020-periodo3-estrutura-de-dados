package exercio2;

public class Program {

	public static void main(String[] args) {

		int n = 1, num = 0;
		boolean primo = true;
		int v1[] = new int[51];
		int v2[] = new int[n];
		
		
		System.out.println("Números positivos entre"
				+ " 1-50:");
		
		for (int i = 1; i < v1.length; i++) {
			
			v1[i] = i;
			num = i;
	
			if(num % i == 0) {
				primo = false;
			}else {
				for (int j = 0; j < v2.length; j++) {
					v2[j] = v1[i];
					n++;
				}
				
			
			}
			
			System.out.println(v1[i]);
		}
		for (int i = 0; i < v2.length; i++) {
			
			System.out.println("Números primos no intervalo"
					+ " 1-50:");
			System.out.println(v2[i]);
			
			
		}

	}

}
