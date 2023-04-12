import java.util.Scanner;

public class Questão3 {
/* 3) Média ponderada: Sua função deverá receber um vetor de notas e um vetor
de pesos correspondentes. A função deve retornar a média ponderada das
notas. Exemplo: [7, 8, 6], [2, 3, 1] -> 7.33 */
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Insira o tamanho do Vetor de Notas: ");
		int tamanho=leitor.nextInt();
		double[] vetornotas= new double[tamanho];
		for(int i=0;i<tamanho;i++) {
			System.out.println("Escreva o elemento "+i+" do vetor de notas.");
			vetornotas[i]=leitor.nextDouble();	
		}
		double[] vetorpesos = new double[tamanho];
		System.out.println("Escreva os pesos, um para cada elemento do vetor de notas.");
		for(int i=0;i<tamanho;i++) {
			System.out.println("Escreva o peso para o elemento "+i);
			vetorpesos[i]=leitor.nextDouble();
		}
		System.out.println("A media ponderada do vetor de notas é "+ mediaponderada(vetornotas,vetorpesos));
		leitor.close();
	}
	public static double mediaponderada(double[] vetornotas,double[] vetorpesos) {
		double mediaponderada;
		double soma=0;
		double somapesos=0;
		for(int i=0;i<vetornotas.length;i++) {
			soma=soma+vetornotas[i]*vetorpesos[i];
			somapesos=somapesos+vetorpesos[i];
		}
		mediaponderada=soma/somapesos;
		return mediaponderada;
	}

}
