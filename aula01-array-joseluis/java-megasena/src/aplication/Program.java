package aplication;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;



//import java.util.Scanner;

public class Program {

	//private static final char[] Number = null;

	public static void main(String[] args) {
		
	final SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
	Date date = new Date();
//	df.setTimeZone(TimeZone.getDefault());
	
		//Scanner tc = new Scanner(System.in);
		//Number number = new Number();
		List<Number> list = new ArrayList<>();
		
		for (int i = 1; i < 60; i++) {
			list.add(i);
		}
		Collections.shuffle(list);
		
		System.out.println("--- RESULTADO DA MEGASENA ---\n");
		System.out.println("--- Data/Hora do sorteio--- \n    " + df.format(date)+"\n");
	    System.out.println("--- NÚMEROS SORTEADOS ---");
		for (int i = 0; i < 6; i++) {
		System.out.print("   " + list.get(i));
			
		}
	}

}
