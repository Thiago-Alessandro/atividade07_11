package atividade07_11;

import java.util.Scanner;

public class questao1 {

	public static void main(String[] args) {
		
		int A[] = new int[10], B[] = new int[10], C[] = new int[10];
		
		Scanner teclado = new Scanner(System.in);
		
		for (int contador = 0; contador < C.length;contador++) {
			
			System.out.print("\nInsira um numero inteiro para A" + contador + ": ");
			A[contador] = teclado.nextInt();
			
			System.out.print("Insira um número inteiro para B" + contador + ": ");
			B[contador] = teclado.nextInt();
		}
		for(int contador = 0;contador < C.length;contador++) {
			
			C[contador] = A[contador] - B[contador];
			
			System.out.print("\nO valor de C" + contador + " é: " + C[contador]);
		}
	}

}
