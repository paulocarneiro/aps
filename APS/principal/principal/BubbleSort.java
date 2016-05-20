package principal;

public class BubbleSort {

	int i;
	int j;
	int aux;
	
	public void bubble(int[] vetor, int k) {
		
		long antes = System.currentTimeMillis(); 
		bsort(vetor, k);
		long tempo = System.currentTimeMillis() - antes;
		System.out.printf("O programa executou em %d milissegundos.%n", tempo);
		ImprimeVetor.imprimir(vetor);
	}

	private void bsort(int[] vetor, int k){


		for(i = k - 1 ; i >= 1; i--){  

			for(j=0; j < i ; j++){
				//C++;
				if(vetor[j] > vetor[j+1]){

					aux = vetor[j];
					vetor[j] = vetor[j+1];
					vetor[j+1] = aux;
					//M++;
				}
			}
		}
	}
}