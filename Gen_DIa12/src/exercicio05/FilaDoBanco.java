package exercicio05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FilaDoBanco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		Queue<String> clientes = new LinkedList<String>();
		String userInput = "";
		
		while (!userInput.equals("0")) {
			System.out.println("\n******************************\n");
			System.out.println("1 - Adicionar cliente na fila");
			System.out.println("2 - Listar todos os clientes");
			System.out.println("3 - Retirar cliente da fila");
			System.out.println("\n******************************");
			System.out.print("Entre com a opção desejada: ");
			
			userInput = input.nextLine();
			
			switch (userInput) {
			case "0":
				System.err.println("Programa Finalizado!");
				break;
			case "1":
				System.out.print("Digite o nome: ");
				clientes.add(input.nextLine());
				
				System.out.println("\nFila:");
				for (String name : clientes) {
					System.out.println(name);
				}
				System.out.println("Cliente adicionado!");
				break;
			case "2":
				if (clientes.size() == 0) {
					System.err.println("A fila está vazia!");
				} else {
					System.out.println("\nLista de clientes na fila:");
					for (String name : clientes) {
						System.out.println(name);
					}
				}
				break;
			case "3":
				
				if (clientes.size() == 0) {
					System.err.println("A fila está vazia!");
				} else {
					clientes.poll();
					System.out.println("\nLista de clientes na fila:");
					
					for (String i : clientes) {
						System.out.println(i);
					}
					
					System.out.println("O cliente foi chamado!");
				}
				break;
			default:
				System.err.println("Opção inválida!");
				break;
			}
		}
		
		input.close();
	}
}
