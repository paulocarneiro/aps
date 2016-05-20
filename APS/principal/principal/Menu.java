package principal;

import java.util.Scanner;

public class Menu{

	static int escolhaTam;
	static int escolhaMet;

	public static int menuTam(){

		System.out.println("Menu");
		System.out.println("1 - Criar Vetor com 10");
		System.out.println("2 - Criar Vetor com 10000");
		System.out.println("3 - Criar Vetor com 100000");
		System.out.println("4 - Criar Vetor com 200000");
		System.out.println("5 - Criar Vetor com 300000");
		System.out.println("6 - Criar Vetor com 400000");
		System.out.println("7 - Criar Vetor com 500000");
		System.out.println("8 - Definir Tamanho do Vetor Manualmente");
		System.out.println("9 - Importar Vetor de um Arquivo");
		System.out.println("0 - Sair");

		Scanner sc = new Scanner(System.in);
		escolhaTam = sc.nextInt();
		return escolhaTam;			
	}
	
	public static int menuSort(){

		System.out.println("Menu");
		System.out.println("1 - BubbleSort");
		System.out.println("2 - InsertionSort");
		System.out.println("3 - SelectionSort");
		System.out.println("4 - QuickSort");
		System.out.println("5 - MergeSort");
		System.out.println("6 - HeapSort");
		System.out.println("0 - Gerar Novo Vetor");


		Scanner sc = new Scanner(System.in);
		escolhaMet = sc.nextInt();
		return escolhaMet;

	}
	
}
