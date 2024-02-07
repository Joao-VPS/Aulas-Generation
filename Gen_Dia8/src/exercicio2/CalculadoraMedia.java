package exercicio2;

import java.util.Scanner;

public class CalculadoraMedia {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		Float nota1, nota2, nota3, nota4;
		String aluno;

		System.out.println("Qual o nome do aluno?");
		aluno = leia.nextLine();
		System.out.println("Escreva o valor da 1ª nota:");
		nota1 = leia.nextFloat();
		System.out.println("Escreva o valor da 2ª nota:");
		nota2 = leia.nextFloat();
		System.out.println("Escreva o valor da 3ª nota:");
		nota3 = leia.nextFloat();
		System.out.println("Escreva o valor da 4ª nota:");
		nota4 = leia.nextFloat();

		Float media = nota1 + nota2 + nota3 + nota4;
		media = media / 4;
		System.out.printf("O valor da média de %s é igual a %.2f", aluno, media);
	}

}
