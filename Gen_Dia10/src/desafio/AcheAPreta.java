package desafio;

import java.util.Random;
public class AcheAPreta {

	public static void main(String[] args) {
		Random aleatorio = new Random();
		
		int preta = aleatorio.nextInt(1, 10);
		
		switch (preta) {
		case 1:
			System.out.printf("1 é a bolinha preta");
			break;
		case 2:
			System.out.printf("2 é a bolinha preta");
			break;
		case 3:
			System.out.printf("3 é a bolinha preta");
			break;
		case 4:
			System.out.printf("4 é a bolinha preta");
			break;
		case 5:
			System.out.printf("5 é a bolinha preta");
			break;
		case 6:
			System.out.printf("6 é a bolinha preta");
			break;
		case 7:
			System.out.printf("7 é a bolinha preta");
			break;
		case 8:
			System.out.printf("8 é a bolinha preta");
			break;
		case 9:
			System.out.printf("9 é a bolinha preta");
			break;
		case 10:
			System.out.printf("10 é a bolinha preta");
			break;
		default:
			System.out.println("Não foram encontradas bolinhas pretas.");
			break;
		}
	}
}
