package exercicio04;

import java.util.Scanner;

public class CaracteristicasAnimais {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String classe, genero, alimentacao;
		
		System.out.println("A o animal é um Vertebrado ou Invertebrado?");
		classe = input.nextLine();

		if (classe.equalsIgnoreCase("vertebrado")) {
			System.out.println("O animal é uma Ave ou Mamífero?");
		} else {
			System.out.println("O animal é um Inseto ou Anelídeo");
		}
		genero = input.nextLine().toLowerCase();
		
		switch (genero) {
		case "ave":
			System.out.println("O animal é Carnívoro ou Onívoro?");
			break;
		case "mamífero":
			System.out.println("O animal é Onívoro ou Herbívoro?");
			break;
		case "inseto":
			System.out.println("O animal é Hematófago ou Herbívoro?");
			break;
		case "anelideo":
			System.out.println("O animal é Hematófago ou Onívoro?");
			break;
		default:
			System.out.println("Escreva uma opção válida!");
			break;
		}
		alimentacao = input.nextLine();
		
		if (classe.equalsIgnoreCase("vertebrado")) {
			if (genero.equalsIgnoreCase("ave")) {
				if (alimentacao.equalsIgnoreCase("carnívoro")) System.out.println("Águia");
				else System.out.println("Pomba");
			} else {
				if (alimentacao.equalsIgnoreCase("onívoro")) System.out.println("Homem");
				else System.out.println("Vaca");
			}
		} else {
			if (genero.equalsIgnoreCase("inseto")) {
				if (alimentacao.equalsIgnoreCase("hematófago")) System.out.println("Pulga");
				else System.out.println("Lagarta");
			} else {
				if (alimentacao.equalsIgnoreCase("hematófago")) System.out.println("Sanguessuga");
				else System.out.println("Minhoca");
			}
		}
	}
}
