package exercicio01;

import java.util.Random;
import java.util.Scanner;

public class AdivinheONumero {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int sorteado = new Random().nextInt(0, 100);
		int numeroDigitado = -2;
		int tentativas = 0;
		boolean jogadorUm = true;

		System.out.println("---==={ ADIVINHE O NÚMERO }===---\n");
		System.out.println("Digite o nome do jogador 1");
		String usuario1 = entrada.nextLine();
		System.out.println("Digite o nome do jogador 2\n(digite \"PC\" para jogar contra a máquina ou \"solo\" para jogar sozinho)");
		String usuario2 = entrada.nextLine();

		if (usuario2.equalsIgnoreCase("pc")) usuario2 = "Máquina";
		System.out.println("\n★ INICIANDO PARTIDA ★");
		System.out.println("=================");

		System.out.println("Tente adivinhar o número sorteado");
		do {
			if (jogadorUm) {
				System.out.printf("%s, digite um número de 0 a 100:\n", usuario1);
				numeroDigitado = entrada.nextInt();
				tentativas++;
				if (!usuario2.equalsIgnoreCase("solo")) jogadorUm = !jogadorUm;
			} else {
				System.out.printf("%s, digite um número de 0 a 100:\n", usuario2);
				if (usuario2.equalsIgnoreCase("Máquina")) {
					numeroDigitado = new Random().nextInt(0, 100);
					System.out.println(numeroDigitado);
				} else {
					numeroDigitado = entrada.nextInt();
				}

				jogadorUm = !jogadorUm;
			}
			
			if (numeroDigitado == -1) {
				System.out.println("Você escolheu sair!");
				break;
			}
			
			if (sorteado != numeroDigitado) {
				if (sorteado > numeroDigitado) {
					System.out.printf("\033[0;33mO número sorteado é maior do que %d\033[0m\n", numeroDigitado);
				} else {
					System.out.printf("\033[0;33mO número sorteado é menor do que %d\033[0m\n", numeroDigitado);
				}
			}
			
			System.out.println("");
		} while (sorteado != numeroDigitado && tentativas <= 10);

		if (sorteado != numeroDigitado && numeroDigitado != -1) {
			System.out.println("Sinto muito, você não conseguiu descobrir o número.");
		} else if (numeroDigitado != -1){
			System.out.printf("\033[0;32mParabéns! %d é o número certo!\n", sorteado);
		}
		
		if (numeroDigitado != -1 && tentativas <= 10) {
			if (!jogadorUm) System.out.print(usuario1);
			else System.out.print(usuario2);
			System.out.println(" é o vencedor!");
		} else if (numeroDigitado == -1) {
			if (jogadorUm) System.out.println(usuario1);
			else System.out.print(usuario2);
			System.out.println(" é o vencedor por W.O.");
		} else {
			System.out.println("Não houve vencedores. Mais sorte da próxima vez.");
		}
		
		entrada.close();
	}
}