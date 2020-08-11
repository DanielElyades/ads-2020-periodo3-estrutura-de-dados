package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner tc = new Scanner(System.in);
		Pessoa pessoa = new Pessoa();
		List<Pessoa> list = new ArrayList<>();
		
		System.out.println("Quantas pessoas serão cadastradas?");
		int num = tc.nextInt();
		
		for (int i = 0; i < num; i++) {
			System.out.println("Informações da " + (i+1) +"º pessoa:");
			System.out.print("Nome: ");
			tc.nextLine();
			String name = tc.nextLine();
			System.out.print("Número do telefone: ");
			int telefone = tc.nextInt();
			System.out.print("Email: ");
			tc.nextLine();
			String email = tc.nextLine();
			
			list.add(pessoa);
		}
		System.out.print("Digite o nome: ");
		String consulta = tc.nextLine();
		boolean inesistente = true;
		for (int i = 0; i < num; i++) {
			if(consulta.equals(list));
			System.out.println(pessoa);
			inesistente = false;
		}
		if(inesistente) {
			System.out.println("Nome inesistente");
		}

	}

}
