package exercicio03;

import java.util.Scanner;

public class UmPossivelDoador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		String nome;
		Integer idade;
		Boolean jaDoou, apto;
		
		System.out.println("Digite o Nome do doador:");
		nome = input.nextLine();
		System.out.println("Digite a Idade do doador:");
		idade = input.nextInt();
		System.out.println("Primeira doação de sangue?");
		jaDoou = input.nextBoolean();

		if (idade >= 18 && idade < 60) {
			System.out.printf("%s está apto para doar sangue!", nome);
		} else if (idade >= 60 && idade <= 69 && !jaDoou) {
			System.out.printf("%s está apto para doar sangue!", nome);
		} else {
			System.out.printf("%s não está apto para doar sangue!", nome);
		}

	}
}
