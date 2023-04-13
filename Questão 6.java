import java.util.Scanner;

public class Questão6 {
/* 6) Ordenação crescente: Sua função deverá receber um vetor e retornar o
vetor ordenado em ordem crescente. Exemplo: [5, 2, 9, 1, 7] -> [1, 2, 5, 7, 9] */
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Escreva o tamanho de seu vetor: ");
		int tamanho = leitor.nextInt();
		int[] vetor= new int[tamanho];
		for(int i=0;i<tamanho;i++) {
			System.out.println("Escreva o elemento "+i+" do vetor:");
			vetor[i]=leitor.nextInt();
		}
		System.out.println("O vetor em ordem Crescente: ");
		for(int i=tamanho-1;i>=0;i--) {
			System.out.print("["+ordemcrescente(vetor)[i]+"]");//não sei como foi so sei que foi assim.
		}
		leitor.close();
	}
	public static int[] ordemcrescente(int[] vetor) {
		int trocador;
		for(int i=0;i<vetor.length;i++) {
			for(int j=0;j<vetor.length;j++) {
				if(j!=vetor.length-1) {
					if(vetor[i]>vetor[j]) {
						trocador=vetor[j];
						vetor[j]=vetor[i];
						vetor[i]=trocador;
					}
				}
			}
		}
	return vetor;	
	}

}
