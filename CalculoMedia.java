import java.util.Scanner;

public class CalculoMedia {
	public static void main(String[] args){
	Scanner in = new Scanner(System.in);
	
	int c = 0;
	double soma = 0;
	while (c < 4){
	System.out.print("Digite um número: ");
	double n = in.nextDouble();
	soma += n;
	c += 1;
	}
	double media = soma/c;
	System.out.print("Soma: " + soma);
	System.out.print("Média: " + media);
	}
}