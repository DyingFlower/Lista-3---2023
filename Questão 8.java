import java.util.Scanner;

public class Questão8 {
/* 8) K-ésimo maior valor: Sua função deverá receber um vetor e um K e retornar
o K-ésimo maior valor presente no vetor. */
	public static void main(String[] args) { 
		Scanner leitor = new Scanner(System.in);
		System.out.println("Escreva o tamanho de seu vetor: ");
		int tamanho = leitor.nextInt();
		int[] vetor= new int[tamanho];
		for(int i=0;i<tamanho;i++) {
			System.out.println("Escreva o elemento "+i+" do vetor:");
			vetor[i]=leitor.nextInt();
		}
		System.out.println("Escreva o K que será usado na função: ");
		int k=leitor.nextInt();
		if(kesimomaior(vetor,k)==0) {
			System.out.println("Escreva  um K válido ou um vetor com no mínimo k elementos.");
		}
		else {
			System.out.println("O K-esimo maior valor é: "+ kesimomaior(vetor,k));
		}
		leitor.close();
	}
	public static int kesimomaior(int[] vetor,int k) {
		int trocador;
		int kesimo=0;
		int contador=0;
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
		for(int i=0;i<vetor.length;i++) {
			contador++;
			if(contador==k) {
				kesimo=vetor[i];
			}
		}
		return kesimo;
	}

}
