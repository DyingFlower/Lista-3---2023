
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Questão13 {
/* 13) Busca por ocorrências: Sua função deverá receber dois vetores e deverá
retornar um novo vetor com todos os elementos que aparecem em ambos os
vetores. */
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
		int[] vetor2= new int[tamanho2];
		for(int i=0;i<tamanho2;i++) {
			System.out.println("Escreva o elemento "+i+" do vetor 2:");
			vetor2[i]=leitor.nextInt();
		}
		System.out.println("Vetor de elementos iguais entre os dois: ");
		for(int i=0;i<corre(vetor1,vetor2).length;i++) {
			System.out.print("["+corre(vetor1,vetor2)[i]+"] ");
		}
		leitor.close();
	}
	public static int[] corre(int[] vetor1,int[] vetor2) {
		HashSet<Integer> lista = new HashSet<Integer>();// tipo um ArrayList mas sem elementos repetidos.
		if(vetor1.length>vetor2.length || vetor1.length==vetor2.length) {
			for(int i=0;i<vetor1.length;i++) {
				for(int j=0;j<vetor2.length;j++) {
					if(vetor1[i]==vetor2[j]) {
						lista.add(vetor1[i]);
					}
				}
			}
		}
		else if(vetor2.length>vetor1.length) {
			for(int i=0;i<vetor2.length;i++) {
				for(int j=0;j<vetor1.length;j++) {
					if(vetor2[i]==vetor1[j]) {
						lista.add(vetor2[i]);
					}
				}
			}
		}
		int[] resposta = new int[lista.size()];
		ArrayList<Integer> passador = new ArrayList<Integer>(lista);// não entendo como passar do hashset direto pro vetor.
		for(int i=0;i<resposta.length;i++) {
			resposta[i]=passador.get(i);
		}
		return resposta;
	}

}
