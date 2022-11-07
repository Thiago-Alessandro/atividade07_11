package atividade07_11;

import java.util.Scanner;

public class questao2 {

	public static void main(String[] args) {
		
		
		int quantiaNomes, opcao = 0,quantiaNomesValidos = 0, contagemPesquisa = 0;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Insira a quantia de nomes: ");
		quantiaNomes = teclado.nextInt();
		
		String nome [] = new String[quantiaNomes];
		String nomePesquisa = new String();
		
		long[] telefone = new long[quantiaNomes];
		
		for(int contador = 0; contador < quantiaNomes;contador++) {
			
			System.out.print("Insira o nome" + contador + ": ");
			nome[contador] = teclado.next();
			
			System.out.print("Insira o número de telefone" + contador + ": ");
			telefone[contador] = teclado.nextLong();
		}
		
		while(opcao != 2) {
				
			System.out.print("\n\tMENU\n\n1 - Pesquisar um número de telefone\n2 - Sair\n");
			opcao = teclado.nextInt();
			
			if (opcao == 1) {
				System.out.print("\nDigite o nome de quem você deseja encontrar o telefone: ");
				nomePesquisa = teclado.next();
				
				contagemPesquisa++;
				
				for(int contador = 0;contador < quantiaNomes;contador++) {
					
					if (nomePesquisa.equals(nome[contador])) {
						
						System.out.print("\nO número de " + nomePesquisa + " é: " + telefone[contador]);
						quantiaNomesValidos++;
					}
				}
				if (quantiaNomesValidos < contagemPesquisa) {
						System.out.print("\nNome inválido\n");
				}
			}
		}
		
	}

}
