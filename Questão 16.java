import java.util.Scanner;

public class Questão16 {
	/*16)Verificação de número primo: Sua função deverá receber um número
	inteiro e verificar se ele é um número primo. Exemplo: 7 -> True. */
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Escreva um numero: ");
		int entrada = leitor.nextInt();
		System.out.println("Resposta: "+primo(entrada));
	    leitor.close();       
	}
	public static boolean primo(int entrada) {
		boolean resposta=false;
		int controle = 1;
	    int somador= 0;
	    while (controle<=entrada){
	        if (entrada%controle==0 && controle!=1 && controle!=entrada){
	        	somador++;
	        }
	        controle+=1;
	       
	    }
	    if (somador != 0){
	    	return resposta;
	    }
	    else{
	    	resposta = true;
	    	return resposta;
	    }
	}
}
