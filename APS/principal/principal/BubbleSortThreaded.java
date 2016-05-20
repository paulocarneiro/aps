package principal;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class BubbleSortThreaded {

	public static void bubble(int[] vetor) {

		long antes = System.currentTimeMillis(); 
		sort(vetor);
		long tempo = System.currentTimeMillis() - antes;
		System.out.printf("O programa executou em %d milissegundos.%n", tempo);
		ImprimeVetor.imprimir(vetor);
		
	}
	
	private static void sort(final int[]vetor){
		int n = vetor.length; //length of the array to sort
		ExecutorService executor = Executors.newFixedThreadPool(8);

		for(int i = 0; i<n-1;i++){
			if( i%1000 == 0)
				System.out.println("Progresso");
			if(i % 2 == 0){ // i even

				for(int j = 0; j<n/2; j++){
					final int tmp = j;
					executor.submit(new Runnable(){ 
						public void run(){
							if (vetor[2*tmp]>vetor[2*tmp+1]) 
								swap(2*tmp,2*tmp+1);}

						private void swap(int i, int j) {
							int temp = vetor[i];
							vetor[i] = vetor[j];
							vetor[j] = temp;

						}
					});}
			}   

			else{ // i odd
				for(int k = 0; k<n/2-1;k++){
					final int tmp = k;
					executor.submit(new Runnable(){
						public void run(){
							if (vetor[2*tmp+1]>vetor[2*tmp+2])
								swap(2*tmp+1,2*tmp+2);}

						private void swap(int i, int j) {
							int temp = vetor[i];
							vetor[i] = vetor[j];
							vetor[j] = temp;
						}

					}
							);
				}
			}       
		}
		executor.shutdown();
		try {
			executor.awaitTermination(1, TimeUnit.DAYS);
		} catch (InterruptedException e) {
			e.printStackTrace();}
	}

}
