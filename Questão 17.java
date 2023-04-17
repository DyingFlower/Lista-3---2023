import java.util.Scanner;

public class Questão17 {
/* 17)Inversão de string: Sua função deverá receber uma string e retornar a
mesma string invertida. Exemplo: "hello" -> "olleh". */
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Escreva a String: ");
		String string = leitor.next();
		System.out.println("Resposta: "+inversao(string));;
		leitor.close();
	}
	public static String inversao(String string) {
		char[] vetor = string.toCharArray();
		char[] newvetor = new char[vetor.length];
		int aux=vetor.length-1;
		for(int i=0;i<vetor.length;i++) {
			newvetor[aux]=vetor[i];
			aux--;
		}
		String resposta = new String(newvetor);
		return resposta;
	}

}
