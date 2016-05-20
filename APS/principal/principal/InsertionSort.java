package principal;

public class InsertionSort {

	int j, i, key;
		
	public void insert(int[] vetor, int k){

		long antes = System.currentTimeMillis();
		insertion(vetor, k);
		long tempo = System.currentTimeMillis() - antes;
		System.out.printf("O programa executou em %d milissegundos.%n", tempo);
		ImprimeVetor.imprimir(vetor);
	}
	
	private void insertion(int[] vetor, int k){
		

		for(j = 1; j < k; j++){
			key = vetor[j];
			i = j - 1;
	      
			while(i >= 0 && vetor[i] > key){
				vetor[i + 1] = vetor[i];
				i = i - 1;
	      }
			
	      vetor[i + 1] = key;
		}
	}
}
