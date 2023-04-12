import java.util.Scanner;

public class Questão4 {
/* 4) Contagem de elementos: Sua função deverá receber dois vetores e um
elemento a ser contado. A função deve retornar a quantidade de vezes que
esse elemento aparece nos vetores. Exemplo: [1,3, 3, 2, 5],[1, 2, 3, 2, 4],
2 -> 3 */
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Insira o tamanho do vetor 1: ");
		int tamanho1=leitor.nextInt();
		System.out.println("Insira o tamanho do vetor 2: ");
		int tamanho2=leitor.nextInt();
		int[] vetor1= new int[tamanho1];
		int[] vetor2= new int[tamanho2];
		for(int i=0;i<tamanho1;i++) {
			System.out.println("Insira o elemento "+ i+ " do vetor 1");
			vetor1[i]=leitor.nextInt();
		}
		for(int i=0;i<tamanho2;i++) {
			System.out.println("Insira o elemento "+ i+ " do vetor 2");
			vetor2[i]=leitor.nextInt();
		}
		System.out.println("Qual elemento deve ser contado nos vetores? ");
		int elemento= leitor.nextInt();
		System.out.println("o elemento "+elemento+ " aparece "+ contagem(vetor1,vetor2,elemento)+ " vezes nos vetores.");
		leitor.close();
	}
	public static int contagem(int[] vetor1,int[] vetor2,int elemento) {
		int comparar=0;
		for(int i=0;i<vetor1.length;i++) {
			if(vetor1[i]==elemento) {
				comparar++;
			}
		}
		for(int i=0;i<vetor2.length;i++) {
			if(vetor2[i]==elemento) {
				comparar++;
			}
		}
		return comparar;
		
	}

}
