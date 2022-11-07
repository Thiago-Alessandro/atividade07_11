package atividade07_11;

import java.util.Scanner;

public class questao4 {

	public static void main(String[] args) {
		
		int[] numeros = new int[10];
		int valorReferencia, vezesQueValorReferenciaAparece = 0, numerosMenoresValorReferencia = 0,
				numerosMaioresvalorReferenciaExtensao = 0, contagemNumerosMaioresValorreferencia = 0;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Insira um valor de referência inteiro: ");
		valorReferencia = teclado.nextInt();
		
		for (int contador = 0;contador < 10;contador++) {
			
			System.out.print("Insira o valor para o0 número #" + contador + ": ");
			numeros[contador] = teclado.nextInt();
			
			if (numeros[contador] < valorReferencia) {
				numerosMenoresValorReferencia++;
			}
		}
		
		numerosMaioresvalorReferenciaExtensao = valorReferencia - numerosMenoresValorReferencia;
		
		 int[] numerosMaioresValorReferencia = new int[numerosMaioresvalorReferenciaExtensao];
		 
		 for (int contador = 0; contador < numerosMaioresValorReferencia.length;contador++) {
			 
			 if (numeros[contador] > valorReferencia) {
				 
				 numerosMaioresValorReferencia[contagemNumerosMaioresValorreferencia] = numeros[contador];
			 }
		 }
		 System.out.print("Os números maiores que o valor referencial são: ");
	}

}
