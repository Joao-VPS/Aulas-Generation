package exercicio01;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaCores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		ArrayList<String> cores = new ArrayList<String>();
		
		while (cores.size() < 5) {
			System.out.println("Escreva uma cor para adicionar à lista:");
			cores.add(entrada.nextLine());
		}
		
		System.out.println("\nListar todas as cores:");
		
		for (String cor : cores) System.out.println(cor);
		
		System.out.println("\033[0m\nOrdenar as cores:");
		cores.sort(null);
		
		for (String cor : cores) System.out.println(cor);
		
		entrada.close();
	}
}
