import java.util.Scanner;

public class SituacaoAluno {
	public static void main(String[] args){
	Scanner in = new Scanner(System.in);
	
	System.out.print("Primeira nota: ");
	double n1 = in.nextDouble();
	
	System.out.print("Segunda nota: ");
	double n2 = in.nextDouble();
	
	double media = (n1+n2)/2;
	
	if (media >= 7){
	    System.out.print("Aprovado!");
	}
	else if (media >= 4){
	    System.out.print("Final!");
	}
	else{
	    System.out.print("Reprovado!");
	}
	}
}