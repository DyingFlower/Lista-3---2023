import java.util.Scanner;
/* 19)Verificação de número perfeito: Sua função deverá receber um número
inteiro e verificar se ele é um número perfeito, ou seja, se a soma dos seus
divisores próprios é igual a ele mesmo. Exemplo: 6 -> True */
public class Questão19 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Escreva um numero: ");
		int entrada = leitor.nextInt();
		System.out.println("Resposta: "+perfeito(entrada));
	    leitor.close();       
	}
	public static boolean perfeito(int entrada) {
		boolean resposta=true;
		int controle = 1;
	    int somador= 0;
	    while (controle<entrada){
	        if (entrada%controle==0){
	            somador+=controle;
	            controle+=1;
	        }
	        else{
	            controle+=1;
	        }
	    }
	    if (somador == entrada){
	    	return resposta;
	    }
	    else{
	    	resposta = false;
	    	return resposta;
	    }
	}
}
