package principal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class LerArquivo {

	int[] vetor;
	
	public int[] lerArquivo() {

		File file = new File("/home/vdarakjian/teste.txt");
		
		int i = 0;
		
		try {
			long antes = System.currentTimeMillis(); 
			FileReader reader1 = new FileReader(file);
			BufferedReader input1 = new BufferedReader(reader1);
			String linha;
			while ((linha = input1.readLine()) != null) {
				i++;
			}
			vetor = new int[i];
			i = 0;
			
			FileReader reader2 = new FileReader(file);
			BufferedReader input2 = new BufferedReader(reader2);
			while ((linha = input2.readLine()) != null){
				vetor[i] = Integer.parseInt(linha);
				i++;
			}

			long tempo = System.currentTimeMillis() - antes;
			System.out.printf("O programa executou em %d milissegundos.%n",tempo);
			input1.close();
			input2.close();
			
		}
		catch (IOException ioe) {
			
			System.out.println(ioe);
			
		}
		return vetor;
	}
}

