import java.util.ArrayList;
import java.util.Scanner;

public class Questão14 {
/* 14)Remoção de elemento do vetor: Sua função deverá receber um vetor e um
elemento a ser removido. A função deve remover todas as ocorrências desse
elemento no vetor. Um novo vetor, apenas com elementos mantindos, deve
ser retornado: Exemplo: [1, 2, 3, 2, 4], 2 -> [1, 3, 4] */
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Escreva o tamanho do vetor: ");
		int tamanho = leitor.nextInt();
		int[] vetor= new int[tamanho];
		for(int i=0;i<tamanho;i++) {
			System.out.println("Escreva o elemento "+i+" do vetor:");
			vetor[i]=leitor.nextInt();
		}
		System.out.println("Escreva o elemento a ser retidado: ");
		int elemento = leitor.nextInt();
		remover(vetor,elemento);
		leitor.close();
	}
	public static void remover(int[] vetor,int elemento) {
		int contador=0;
		ArrayList<Integer> lista = new ArrayList<>(); // otimo para coletar coisas que você não sabe quantas serão em um vetor
		for(int i=0;i<vetor.length;i++) {
			if(vetor[i]==elemento) {
				contador++;
			}
		}
		if((vetor.length-contador)==0) {
			System.out.println("Você removeu todos os elementos do vetor.");
		}
		else {
			int[] resposta = new int[vetor.length-contador];
			for(int i=0;i<vetor.length;i++) {
				if(vetor[i]!=elemento) {
					lista.add(vetor[i]);
				}
			}
			for(int i=0;i<resposta.length;i++) {
				resposta[i]=lista.get(i);
			}
			System.out.println("Vetor adquirido: ");
			for(int i=0;i<resposta.length;i++) {
				System.out.print("["+resposta[i]+"] ");
			}
		}
		
	}

}
