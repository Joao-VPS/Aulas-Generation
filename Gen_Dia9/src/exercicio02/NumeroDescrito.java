package exercicio02;

import java.util.Scanner;

public class NumeroDescrito {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int numero = input.nextInt();
		
		System.out.printf("O núermo %d é ", numero);
		
		if (numero % 2 == 0) {
			System.out.print("par e ");
		} else {
			System.out.print("impar e ");
		}
		
		if (numero >= 0) {
			System.out.println("positivo!");
		} else {
			System.out.println("negativo!");
		}
	}
}
