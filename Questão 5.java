import java.util.Scanner;

public class Questão5 {
/* 5) Cópia de vetor: Sua função deverá receber um vetor e retornar uma cópia
exata desse vetor. */
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Escreva o tamanho do vetor que será copiado: ");
		int tamanho= leitor.nextInt();
		int[] vetor = new int[tamanho];
		for(int i=0;i<tamanho;i++) {
			System.out.println("Insira o elemento "+i+" do vetor");
			vetor[i]=leitor.nextInt();
		}
		leitor.close();
		System.out.println("O Vetor Idêntico: ");
		for(int i=0;i<vetor.length;i++) {
			System.out.print("["+copiadovetor(vetor)[i]+"]");
		}

	}
	public static int[] copiadovetor(int[] vetor) {
		int[] copia = new int[vetor.length];
		for(int i=0;i<vetor.length;i++) {
			copia[i]=vetor[i];
		}
		return copia;
	}

}
