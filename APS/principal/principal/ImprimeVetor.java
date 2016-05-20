package principal;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ImprimeVetor {

	static int i;
	
	public static void imprimir(int[] vetor){
		
		System.out.println("Deseja Imprimir o Vetor Ordenado?");
		System.out.println("(S para SIM   N para NãO");
		Scanner scanner = new Scanner(System.in);
		String op = scanner.next();
		
		if( op.equals("s") || op.equals("S")){
			
			System.out.println("Em um Arquivo ou na Tela?");
			System.out.println("(A para Arquivo   T para Tela");
			op = scanner.next();
			if( op.equals("t") || op.equals("T")){
				printVet(vetor);
			}
			else{
				try {
					salvar(op, vetor);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	private static void printVet(int[] vetor){

		System.out.println("Printando Vetor Ordenado:");
		for(i = 0; i < vetor.length; i++){
			System.out.print(" " +vetor[i]);
			if( i%10 == 0){
				System.out.println();
			}
		}
		System.out.println();

	}
	
	public static void salvar (String file , int[] vetor) throws IOException{
		
		long antes = System.currentTimeMillis(); 
	    BufferedWriter outputWriter = null;
	    outputWriter = new BufferedWriter(new FileWriter("/home/vdarakjian/teste.txt"));
	   
	    for (int i = 0; i < vetor.length; i++ ){

	    	outputWriter.write(vetor[i]+ " ");
		    outputWriter.newLine();
		    
	    }
	    long tempo = System.currentTimeMillis() - antes;
		System.out.printf("O programa executou em %d milissegundos.%n",tempo);
	    outputWriter.flush();  
	    outputWriter.close();
	}
	
}
