import java.util.Arrays;
import java.util.Scanner;

public class Questão20 {
/* 20)Diminuição do vetor: sua função deverá receber um número qualquer que
represente e criar um vetor com o tamanho informado. Este vetor deverá ter
sucessivas diminuições do seu tamanho em um unidade até que seu
tamanho seja igual a 1. */
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe o número que será o tamanho do vetor: ");
		int numero= leitor.nextInt();
		diminuirvetor(numero);
		leitor.close();
	}
	public static int[] diminuirvetor(int numero) {
	    int[] vetor = new int[numero];
	    for (int i = 0; i < numero; i++) {
	        vetor[i] = i + 1;
	    }
	    for (int i = numero; i > 1; i--) {
	        int[] temp = new int[i-1];
	        for (int j = 0; j < i-1; j++) {
	            temp[j] = vetor[j];
	        }
	        vetor = temp;
	        System.out.println(Arrays.toString(vetor));// tranforma o vetor em uma string para não precisar usar for.
	    }
	    return vetor;
	}

}
