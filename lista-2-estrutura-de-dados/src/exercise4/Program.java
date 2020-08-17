package exercise4;

public class Program {
	public static void main(String args[]) {
		
		String a = "", b = "*",
				c = "***********", d = "";
		String vet[] = new String[10];
		String vetC[] = new String[10];
		String invertVet[] = new String[vet.length];
		String invertB[] = new String[invertVet.length];
		
		
		System.out.println("(a)            (b)"
				+"                      (c)"
				+"            (d)");
		
		for (int i = 0; i < 10; i++) {
			a += "*"; b += "*"; c += " "; d +="*";
			vet[i] = a;
			vetC[i] = c;
			
			//System.out.println(vet[i]);
			//System.out.println(vetC[i]);
		}
		for (int i = 0; i < 10; i++) {
			invertVet[i] = vet[(vet.length - i) -1];
			
			//System.out.println(invertVet[i]);
		}
		for (int i = 0; i < 10; i++) {
			//invertB[i] = invertVet[(invertVet.length - i) - 1];
			
			System.out.println(vet[i] + "           "
					+ "                     "+ invertVet[i]);
		}
		
	}

}
