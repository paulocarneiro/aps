package principal;
import java.util.Random;
import java.util.Scanner;

public class GerarVetor {

	int[] vetor;

	Scanner sc = new Scanner(System.in);

	public void gerar(int n){

		gvetor(n);

	}

	private void gvetor(int n){

		int i;

		vetor = new int[n];

		Random gerador = new Random();

		for(i = 0; i < n; i++){

			vetor[i] = gerador.nextInt(5000001);
			//System.out.println(vetor[i]);

		}
	}


}
