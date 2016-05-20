package principal;

public class SelectionSort {
	
	int j ,i ,min ,max ,aux;
	
	public void select(int[] vetor, int k){

		long antes = System.currentTimeMillis();
		selection(vetor, k);
		long tempo = System.currentTimeMillis() - antes;
		System.out.printf("O programa executou em %d milissegundos.%n", tempo);
		ImprimeVetor.imprimir(vetor);
	}
	
	private void selection(int[] vetor, int k){
		
		long antes = System.currentTimeMillis();
		System.out.println("Ordenando"); 

		for(i = 0; i < (k - 1); i++){
			min = i;
			for(j = (i+1); j < k; j++){

				if(vetor[j] < vetor[min]){
					min = j;
				}
			}

			if(i != min){
				aux = vetor[i];
				vetor[i] = vetor[min];
				vetor[min] = aux;
			}
		}
		long tempo = System.currentTimeMillis() - antes;
		System.out.println("Printando Vetor Ordenado:");
		for(i = 0; i < k; i++){
			System.out.print(" " +vetor[i]);
			if( i%10 == 0){
				System.out.println();
			}
		}
		System.out.printf("O programa executou em %d milissegundos.%n", tempo);	}
}