package principal;


public class HeapSort 
{    
	private static int N;
	
	public static void heapsort(int vetor[])
	{       
		long antes = System.currentTimeMillis();
		heapify(vetor);        
		for (int i = N; i > 0; i--)
		{
			swap(vetor,0, i);
			N = N-1;
			maxheap(vetor, 0);
		}
		long tempo = System.currentTimeMillis() - antes;
		System.out.printf("O programa executou em %d milissegundos.%n", tempo);
		ImprimeVetor.imprimir(vetor);
		
	}     
	
	private static void heapify(int vetor[])
	{
		N = vetor.length-1;
		for (int i = N/2; i >= 0; i--)
			maxheap(vetor, i);        
	}
	
	private static void maxheap(int vetor[], int i)
	{ 
		int left = 2*i ;
		int right = 2*i + 1;
		int max = i;
		if (left <= N && vetor[left] > vetor[i])
			max = left;
		if (right <= N && vetor[right] > vetor[max])        
			max = right;

		if (max != i)
		{
			swap(vetor, i, max);
			maxheap(vetor, max);
		}
	}    

	private static void swap(int vetor[], int i, int j)
	{
		int tmp = vetor[i];
		vetor[i] = vetor[j];
		vetor[j] = tmp; 
	}           
}    