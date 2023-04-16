import java.util.Scanner;

public class Questão15 {
/* 15)Verificação de palíndromo: Sua função deverá receber uma string e
verificar se ela é um palíndromo, ou seja, se pode ser lida da mesma forma
de trás para frente. Exemplo: "ana" -> True. */
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Escreva a String: ");
		String string = leitor.next();
		System.out.println("Resposta: "+palindromo(string));
		leitor.close();
	}
	public static boolean palindromo(String string) {
		boolean resposta=false;
		char[] vetor = string.toCharArray(); // tranforma string em vetor de char.
		int aux=vetor.length-1;
		int contador=0;
		for(int i=0;i<vetor.length;i++) {
			if(vetor[i]!=vetor[aux]) {
				contador++;
			}
			aux--;
		}
		if(contador!=0) {
			return resposta;
		}
		else {
			resposta=true;
			return resposta;
		}
	}

}
