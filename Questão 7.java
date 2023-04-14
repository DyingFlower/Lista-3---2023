import java.util.Scanner;

public class questão7 {
/* 7) Verificação de ordenação: Sua função deverá receber um vetor e verificar
se ele está ordenado em ordem crescente. Se sim retornar true. */
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Escreva o tamanho de seu vetor: ");
		int tamanho = leitor.nextInt();
		int[] vetor= new int[tamanho];
		for(int i=0;i<tamanho;i++) {
			System.out.println("Escreva o elemento "+i+" do vetor:");
			vetor[i]=leitor.nextInt();
		}
		System.out.println("A resposta para saber se a ordem é crescente é: "+verificacao(vetor));
		leitor.close();
	}
	public static boolean verificacao(int[]vetor) {
		boolean verificar= true;
		for(int i=0;i<vetor.length;i++) {
			int j=i+1;
			if(j<vetor.length) {
				if(vetor[i]>vetor[j]) {
					verificar=false;
				}
			}
		}
		return verificar;
	}

}
