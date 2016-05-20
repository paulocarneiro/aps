package principal;

import java.util.Arrays;
import java.util.Scanner;


public class Main {

	static int op = 0;
	
	public static void main(String[] args) {

		principal.GerarVetor gvetor = new GerarVetor();
		principal.BubbleSort bsort = new BubbleSort();
		principal.InsertionSort insort = new InsertionSort();
		principal.SelectionSort selsort = new SelectionSort();
		principal.MergeSort mergsort = new MergeSort();
		principal.LerArquivo larq = new LerArquivo();

		do{

			Menu.menuTam();

			switch(Menu.escolhaTam){

			case 1:
				gvetor.gerar(1000);
				break;

			case 2:
				gvetor.gerar(10000);
				break;

			case 3:
				gvetor.gerar(100000);
				break;

			case 4:
				gvetor.gerar(200000);
				break;

			case 5:
				gvetor.gerar(300000);
				break;

			case 6:
				gvetor.gerar(400000);
				break;

			case 7:
				gvetor.gerar(10000000);
				break;

			case 8:
				System.out.println("Digite Seu Valor:");
				Scanner sc = new Scanner(System.in);
				int num = sc.nextInt();
				gvetor.gerar(num);
				break;
			case 9:
				larq.lerArquivo();
				op++;
				break;

			}				

			int[] vbubble;
			int[] vinsertion;
			int[] vselection;
			int[] vquick;
			int[] vquickThread;
			int[] vmerge;
			int[] vheap;
			
			if (op == 0){
				
				vbubble = Arrays.copyOf(gvetor.vetor , gvetor.vetor.length);
				vinsertion = Arrays.copyOf(gvetor.vetor , gvetor.vetor.length);
				vselection = Arrays.copyOf(gvetor.vetor , gvetor.vetor.length);
				vquick = Arrays.copyOf(gvetor.vetor , gvetor.vetor.length);
				vquickThread = Arrays.copyOf(gvetor.vetor , gvetor.vetor.length);
				vmerge = Arrays.copyOf(gvetor.vetor , gvetor.vetor.length);
				vheap = Arrays.copyOf(gvetor.vetor , gvetor.vetor.length);
				
			}else{
				
				vbubble = Arrays.copyOf(larq.vetor , larq.vetor.length);
				vinsertion = Arrays.copyOf(larq.vetor , larq.vetor.length);
				vselection = Arrays.copyOf(larq.vetor , larq.vetor.length);
				vquick = Arrays.copyOf(larq.vetor , larq.vetor.length);
				vquickThread = Arrays.copyOf(larq.vetor , larq.vetor.length);
				vmerge = Arrays.copyOf(larq.vetor , larq.vetor.length);
				vheap = Arrays.copyOf(larq.vetor , larq.vetor.length);
			
			}
			
			do{

				Menu.menuSort();

				switch(Menu.escolhaMet){

				case 1:
					//System.out.println("1 - Método MultiThreaded");
					//System.out.println("2 - Método UniThreaded");
					bsort.bubble(vbubble, vbubble.length);
					//BubbleSortThreaded.bubble(vbubble);

					break;

				case 2:
					insort.insert(vinsertion, vinsertion.length);
					break;

				case 3:
					selsort.select(vselection, vselection.length);
					break;
				
				case 4:
					ThreadedQuick quick = new ThreadedQuick((vquickThread.length / ThreadedQuick.MAX_THREADS), vquickThread, 0, vquickThread.length - 1);
					long antes = System.currentTimeMillis();
					quick.run();
					long tempo = System.currentTimeMillis() - antes;
					System.out.printf("O programa executou em %d milissegundos.%n", tempo);
					ImprimeVetor.imprimir(vquickThread);
					//Scanner sc = new Scanner(System.in);
					//System.out.println("1 para Multi / 2 para Uni");
					//int teste = sc.nextInt();
					/*System.out.println("Iniciando Multi");
					long antes = System.currentTimeMillis();
					ThreadedQuick.reset();
					CountDownLatch completionSignal = new CountDownLatch(1);
					new ThreadedQuick(completionSignal, vquickThread, 0, vquickThread.length-1).start();
					try {
					    completionSignal.await(1000, TimeUnit.SECONDS);
					} catch(Exception ex){
					    ex.printStackTrace();
					}
					long tempo = System.currentTimeMillis() - antes;
		    		System.out.printf("O programa executou em %d milissegundos.\n", tempo);
					ImprimeVetor.imprimir(gvetor.vetor);
					*/
					/*if (teste == 1){
						System.out.println("Iniciando Multi");
						long antes = System.currentTimeMillis();
						ThreadedQuick.reset();
						CountDownLatch completionSignal = new CountDownLatch(1);
						new ThreadedQuick(completionSignal, gvetor.vetor, 0, gvetor.vetor.length-1).start();
						try {
						    completionSignal.await(1000, TimeUnit.SECONDS);
						} catch(Exception ex){
						    ex.printStackTrace();
						}
						long tempo = System.currentTimeMillis() - antes;
			    		System.out.printf("O programa executou em %d milissegundos.\n", tempo);
						ImprimeVetor.imprimir(gvetor.vetor);
						
					}
					else {
						System.out.println("Iniciando Uni");
						QuickSort.ordenar(vquick, vquick.length);
					}
					*/
					break;
					 
				case 5:
					System.out.println(vquick.length);
					QuickSort.ordenar(vquick, vquick.length);
					//mergsort.mSort(vmerge, vmerge.length);
					break;

				case 6:
					HeapSort.heapsort(vheap);
					break;

				}
			}while(Menu.escolhaMet != 0);

		}while(Menu.escolhaTam != 0);
	}
}
