package exercicio05;

import java.util.Scanner;

public class SomaPositivo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int soma = 0, numero = 0;

		do {
			System.out.print("Digite um número: ");
			numero = input.nextInt();
			
			if (numero > 0) soma += numero;
		} while (numero != 0);

		System.out.println("A soma dos números positivos é: " + soma);
		
		input.close();
	}
}
