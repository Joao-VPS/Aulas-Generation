package exercicio02;

import java.util.Scanner;

public class EncontreONumero {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[] vector = new int[10];
		int size = 0;
		int userNumber = 0;
		boolean hasNumber = false;
		
		while (size < 10) {
			System.out.print("Adicione um número à lista (digite -1 para sair): ");
			
			userNumber = entrada.nextInt();
			hasNumber = false;
			
			for (int i = 0; i < vector.length; i++) {
				if (userNumber == vector[i]) hasNumber = true;
			}
			
			if (!hasNumber && userNumber != -1) {
				vector[size] = userNumber;
				System.out.printf("O número %d foi adicionado à lista.\n", userNumber);
				size++;
			} else if (userNumber != -1) System.out.println("Este número já está na lista, digite outro!");
			else {
				System.out.println("Você escolheu sair. Encerrando aplicação...");
				System.out.println("\u001B[31mAplicativo encerrado pelo usuário");
				System.exit(0);
			}
		}

		userNumber = 0;
		System.out.println("\n==========");

		while (userNumber != -1) {
			System.out.print("\nDigite um número e veja se ele está na lista (digite -1 para sair): ");
			userNumber = entrada.nextInt();

			size = 0;
			hasNumber = false;

			for (int i = 0; i < vector.length; i++) {
				if (userNumber == vector[i]) {
					hasNumber = true;
					size = i;
					continue;
				}
			}
			
			if (hasNumber) System.out.printf("O número %d está na posição: %d\n", userNumber, size);
			else if (userNumber != -1) System.out.printf("O número %d não foi encontrado!\n", userNumber);
			else {
				System.out.println("Você escolheu sair. Encerrando aplicação...");
			}
		}
		
		entrada.close();
	}
}
