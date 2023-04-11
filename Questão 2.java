import java.util.Scanner;

public class Questão2 {
/* 2) Média: Sua função deverá receber dois vetores como entrada e retornar a
média dos valores presentes nos vetores. */
	public static void main(String[] args) {
		// não entendi direito o que é pedido na questão, vou fazer uma média simples.
		Scanner leitor = new Scanner(System.in);
		System.out.println("Insira o tamanho do vetor 1");
		int tamanho1= leitor.nextInt();
		System.out.println("Insira o tamanho do vetor 2");
		int tamanho2= leitor.nextInt();
		double vetor1[]= new double[tamanho1];
		double vetor2[]= new double[tamanho2];
		for(int i=0;i<vetor1.length;i++) {
			System.out.println("Insira o elemento "+i + " do vetor 1 ");
			vetor1[i]=leitor.nextDouble();
		}
		for(int i=0;i<vetor2.length;i++) {
			System.out.println("Insira o elemento "+i + " do vetor 2 ");
			vetor2[i]=leitor.nextDouble();
		}
		media(vetor1,vetor2);
		leitor.close();
	}
	public static void media(double vetor1[], double vetor2[]) {
		double soma;
		double soma1=0;
		double soma2=0;
		for(int i=0;i<vetor1.length;i++) {
			soma1=soma1+vetor1[i];
		}
		for(int i=0;i<vetor2.length;i++) {
			soma2=soma2+vetor2[i];
		}
		soma=soma1+soma2;
		double media = soma/(vetor1.length+vetor2.length);
		System.out.println("A media da soma dos elementos dos vetores é: "+ media);
	}

}
