import java.util.Scanner;

public class Questão12 {
/* 12)Primo: Sua função deverá receber um número inteiro e verificar se ele é
primo, ou seja, se é divisível apenas por 1 e por ele mesmo. */
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Escreva o numero para verificar: ");
		int num=leitor.nextInt();
		System.out.println("Resposta: "+ primo(num));
		leitor.close();
	}
	public static boolean primo(int num) {
		boolean primo=true;
	    if (num <= 1) { 
	        primo=false;
	    }
	    else {
	    	 for (int i = 2; i <= Math.sqrt(num); i++) {
	 	        if (num % i == 0) { 
	 	            primo=false;
	 	        }
	 	     }
	    }
	    return primo;
	}
}
