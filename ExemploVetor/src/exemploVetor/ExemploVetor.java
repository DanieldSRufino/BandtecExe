package exemploVetor;

import java.util.Scanner;

public class ExemploVetor {

	public static void exibeVetor(int[] v) {
		for (int i = 0; i < v.length; i++) {
		System.out.println(v[i]);
		}
		
		System.out.println();
	}

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		
//		int[] vetor = new int[10];
//		int[] vet1 = {100, 200, 300, 400};
//		String[] mes = {"janeiro", "fevereiro", "março", "abril", "maio", "junho", 
//				"julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};
//		
//		for (int i = 0; i < vetor.length; i++) {
//		System.out.println("Digite um número");
//		vetor[i] = leitor.nextInt();
//		}
//
//		exibeVetor(vetor);
//		exibeVetor(vet1);
//		
//		System.out.println("Digite o número do mês: ");
//		int numMes = leitor.nextInt();
//		
//		if (numMes <=0 || numMes >=12) {
//			System.out.println("Número errado");
//		}
//		
//		else {
//			System.out.println("mes: " + mes[numMes - 1]);
//		}
//		
//		
//		System.out.println("Defina o tamanho do vetor: ");
//		int tam = leitor.nextInt();
//		
//		while (tam < 10);{
//			System.out.println("Tamanho inválido, digite novamente: ");
//			tam = leitor.nextInt();
//		}
//		
//		int[] vet2 = new int[tam];
		
		
		System.out.println("       Exercício 1");
		System.out.println("---------------------------");
		System.out.println(" ");
		
		int[] vet3 = new int[7];
		for (int i = 0 ; i < vet3.length ; i++) {
			System.out.println("Digite 7 números");
			vet3[i] = leitor.nextInt();
		}
		
		System.out.println(" ");
		exibeVetor(vet3);
		System.out.println(" ");
		System.out.println(" ");
		
		
		System.out.println("       Exercício 2");
		System.out.println("---------------------------");
		System.out.println(" ");
		
		String[] VetorString = new String[10];
	
		
	}

}
