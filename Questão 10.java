import java.util.Scanner;

public class Questão10 {
/* 10) Verificação de igualdade: Sua função deverá receber dois vetores e verificar
se eles são iguais, ou seja, se possuem os mesmos elementos na mesma
ordem. */
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Escreva o tamanho do vetor 1: ");
		int tamanho1 = leitor.nextInt();
		int[] vetor1= new int[tamanho1];
		for(int i=0;i<tamanho1;i++) {
			System.out.println("Escreva o elemento "+i+" do vetor 1:");
			vetor1[i]=leitor.nextInt();
		}
		System.out.println("Escreva o tamanho do vetor 2: ");
		int tamanho2 = leitor.nextInt();
		int[] vetor2= new int[tamanho1];
		for(int i=0;i<tamanho2;i++) {
			System.out.println("Escreva o elemento "+i+" do vetor 2:");
			vetor2[i]=leitor.nextInt();
		}
		System.out.println("A resposta para a pergunta é: "+igualdade(vetor1,vetor2));
		leitor.close();
	}
	public static boolean igualdade(int[] vetor1,int[] vetor2) {
		boolean igualdade= false;
		int cont=0;
		if(vetor1.length==vetor2.length) {
			for(int i=0;i<vetor1.length;i++) {
				if(vetor1[i]==vetor2[i]) {
					igualdade= true;
				}
				else {
					igualdade= false;
					cont++;
				}
			}
		}
		if(cont!=0) {
			igualdade= false;
		}
		return igualdade;
	}

}
