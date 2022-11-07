package atividade07_11;

import java.util.Scanner;

public class questao3 {

	public static void main(String[] args) {
		
		int quantiaNumeros, verificadorNumerosOrdem = 1, numerosVerificados = 1, contagemNumerosOrdem = 0;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Insira a quantia de numeros: ");
		quantiaNumeros = teclado.nextInt();
		
		int[] numero = new int [quantiaNumeros];
		int[] numerosOrdemCrescente = new int [quantiaNumeros];
		
		for (int contador = 0;contador < quantiaNumeros; contador++) {
			
			System.out.print("Insira o valor para o número #" + contador + ": ");
			numero[contador] = teclado.nextInt();
		}
		
		for (;contagemNumerosOrdem < quantiaNumeros;contagemNumerosOrdem++) {
			
			for (int contador = 0; contador< quantiaNumeros - numerosVerificados;contador++) {
				
				if (numero[contador] < numero[contador + verificadorNumerosOrdem]) {
					numerosOrdemCrescente[contagemNumerosOrdem] = numero[contador];
				}
				verificadorNumerosOrdem++;
			}
		}
		System.out.print("\nOs números em ordem crescente são: ");
		
		for (int contador = 0;contador < quantiaNumeros;contador++) {
			
			System.out.print(numerosOrdemCrescente[contador] + " ");
		}
	}

}
