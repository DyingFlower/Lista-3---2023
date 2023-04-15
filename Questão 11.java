import java.util.Scanner;

public class Questão11 {
/* 11)Potenciação: Sua função deverá receber dois números, a base e o
expoente, e retornar a potência da base elevada ao expoente. */
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Escreva a base: ");
		int base=leitor.nextInt();
		System.out.println("Escreva o expoente: ");
		int expoente=leitor.nextInt();
		leitor.close();
		System.out.println("Potência: "+potenciacao(base,expoente));
	}
	public static int potenciacao(int base,int expoente) {
		int potencia=1;
		for(int i=0;i<expoente;i++) {
			potencia=potencia*base;
		}
		return potencia;
	}

}
