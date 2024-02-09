package exercicio03;

import java.util.ArrayList;
import java.util.Scanner;

public class VerificaIdade {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite uma idade: ");
		int idade = input.nextInt();
		
		ArrayList<Integer> menores = new ArrayList<>();
		ArrayList<Integer> maiores = new ArrayList<>();
		
		while (idade > 0) {
			if (idade < 21) menores.add(idade);
			if (idade > 50) maiores.add(idade);
			
			System.out.print("Digite uma idade: ");
			idade = input.nextInt();
		}
		
		System.out.println("Total de pessoas menores de 21 anos: " + menores.size());
		System.out.println("Total de pessoas maiores de 50 anos: " + maiores.size());
		
		input.close();
	}
}
