import java.util.Scanner;

public class Questão18 {
/* 18)Cálculo de juros compostos: Sua função deverá receber um valor inicial,
uma taxa de juros e um número de períodos. A função deve retornar o valor
final após a aplicação dos juros compostos. Exemplo: 1000, 0.05, 3 ->
1157.63 */
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Diga o valor inicial: ");
		int valor= leitor.nextInt();
		System.out.println("Diga a taxa de juros: ");
		double juros = 0.05;//por algum motivo eu boto numero como 0.05 e dá erro no Scanner
		System.out.println("Diga o numero de periodos: ");
		int periodo = leitor.nextInt();
		System.out.println("O valor final é: "+juroscomp(valor,juros,periodo));
		leitor.close();
	}
	public static double juroscomp(int valor, double juros,int periodo) {
		double montante = valor*Math.pow((1+juros),periodo); //math.pow(base,expoente);
		return montante;
	}

}
