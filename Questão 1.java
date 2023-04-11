import java.util.Scanner;

public class Questão1 {
/* 1) Somatório: Sua função deverá receber um vetor como parâmetro e retornar
a soma de todos elementos do vetor, sendo que as primeiras duas e as
últimas posições do vetor de entrada não devem ser consideradas; */
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);	
		System.out.println("Diga quantos elementos terá o seu vetor: ");
		int tamanho = leitor.nextInt();
		double vetor[]= new double[tamanho];
		for(int i =0; i<tamanho;i++) {
			System.out.println("Diga o elemento " + (i+1) + " do vetor.");
			vetor[i]=leitor.nextFloat();
		}
		somatorio(vetor);
		leitor.close();
	}
	public static void somatorio (double vetor[]) {
		System.out.println("Tenha em mente que os dois primeiros e dois ultimos elementos não serão somados.");
		double soma=0;
		for(int i=0;i<vetor.length;i++) {
			if(i>1 && i<vetor.length-2) {
				soma=soma+vetor[i];
			}
		}
		if(soma==0) {
			System.out.println("A Soma deu 0, tenha em mente a condição do programa, pode ter a ver com isso.");
		}
		else
			System.out.println("A Soma é: "+ soma + " lembrando que 0s 2 primeiros e 2 ultimos elementos não são considerados.");
	}

}
