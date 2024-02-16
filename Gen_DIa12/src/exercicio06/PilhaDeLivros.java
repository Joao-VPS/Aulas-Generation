package exercicio06;

import java.util.Scanner;
import java.util.Stack;

public class PilhaDeLivros {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Stack<String> books = new Stack<String>();
		String userInput = "";
		
		while (!userInput.equals("0")) {
			System.out.println("******************************");
			System.out.println("1 - Adicionar livro na pilha");
			System.out.println("2 - Listar todos os livros");
			System.out.println("3 - Retirar livro da pilha");
			System.out.println("0 - Sair");
			System.out.println("******************************");
			System.out.print("Entre com a opção desejada: ");
			userInput = input.nextLine();
			
			switch (userInput) {
			case "0":
				System.err.println("Programa finalizado!");
				break;
			case "1":
				System.out.print("Digite o nome: ");
				books.push(input.nextLine());
				System.out.println();
				
				System.out.println("Pilha:");
				for (String name : books) {
					System.out.println("* " + name);
				}
				System.out.println("Livro adicionado!");
				
				break;
			case "2":
				if (books.size() == 0) {
					System.err.println("A pilha está vazia!");
				} else {
					System.out.println("\nLista de livros na pilha:");
					for (String name : books) {
						System.out.println("* " + name);
					}
				}
				break;
			case "3":
				if (books.size() == 0) {
					System.err.println("A pilha está vazia!");
				} else {
					books.pop();
					System.out.println("\nPilha:");
					for (String name : books) {
						System.out.println("* " + name);
					}
					System.out.println("Um livro foi retirado da pilha!");
				}
				break;
			default:
				System.err.println("Opção inválida!");
			}
			System.out.println();
		}
		input.close();
	}
}
