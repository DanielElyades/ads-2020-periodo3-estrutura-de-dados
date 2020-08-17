package exercio1;

public class Program {
	
	public static void main(String args[]) {
		
		int vet[] = new int[20];
		int min = 0;
		int max = 100;
		int one = 0, two = 0, three = 0, four = 0,
				five = 0, six=0, seven=0, eight=0,
				nine=0, ninenine=0, aHundred=0;
		for (int i = 0; i < 20; i++) {
			
			vet[i] = min + (int)( Math.random() * (max - min));
			
		System.out.println((i + 1) + "ª nota: " + vet[i]);
		
		if(vet[i] >= 0 && vet[i] <= 9) {
			one++;
		}
		if(vet[i] >= 10 && vet[i] <= 19) {
			two++;
		}
		if(vet[i] >= 20 && vet[i] <= 29) {
			three++;
		}
		if(vet[i] >= 30 && vet[i] <= 39) {
			four++;
		}
		if(vet[i] >= 40 && vet[i] <= 49) {
			five++;
		}
		if(vet[i] >= 50 && vet[i] <= 59) {
			six++;
		}
		if(vet[i] >= 60 && vet[i] <= 69) {
			seven++;
		}
		if(vet[i] >= 70 && vet[i] <= 79) {
			eight++;
		}
		if(vet[i] >= 80 && vet[i] <= 89) {
			nine++;
		}
		if(vet[i] >= 90 && vet[i] <= 99) {
			ninenine++;
		}
		if(vet[i] == 100 ) {
			aHundred++;
		}
		}
		System.out.println("Quantidades de notas nos intervalos:");
		System.out.printf("00-09: %d\n10-19: %d\n20-29: %d\n30-39: %d\n40-49: %d\n50-59: %d\n60-69: %d\n70-79: %d\n80-89: %d\n90-99: %d\n100: %d\n", one, two,
				three, four, five, six, seven, eight, nine, ninenine, aHundred);
	}

}
