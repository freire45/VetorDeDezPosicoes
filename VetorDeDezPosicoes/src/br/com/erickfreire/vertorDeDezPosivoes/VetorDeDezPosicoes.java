package br.com.erickfreire.vertorDeDezPosivoes;


/**
 * Programa em Java que cria e exibe um vetor de 10 posições
 * @author Erick Freire
 * @version 1 - Criado em 19-05-21 as 16:08
 */

public class VetorDeDezPosicoes {

	public static void main(String[] args) {
		
		int[] vetor = new int[10];
		
		System.out.printf("%s%8s%n", "Index", "Valor");
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.printf("%5d%8d%n", i, vetor[i]);
		}

	}

}
