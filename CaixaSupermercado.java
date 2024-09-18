import java.util.Scanner;

public class CaixaSupermercado {
	public static void main(String[] args){
		
	Scanner in = new Scanner(System.in);
	
	System.out.println("Cód.      Preço "+
	"\n 1   ---  R$0.50"+
	"\n 2   ---  R$1,00"+
	"\n 3   ---  R$4,00"+
	"\n 5   ---  R$7,00"+
	"\n 9   ---  R$8,00");
	
	System.out.print("Código: ");
	int codigo = in.nextInt();
	double preco_final = 0;
	
	while (codigo != 0) {
		
	System.out.print("Quantidade: ");
	int quant = in.nextInt();
		
	if(codigo == 1){
		preco_final += quant*0.50;
	}
	else if(codigo == 2){
		preco_final += quant*1;
	}
	else if(codigo == 3){
		preco_final += quant*4;
	}
	else if(codigo == 5){
		preco_final += quant*7;
	}
	else if(codigo == 9){
		preco_final += quant*8;
	}
	else{
	    System.out.println("Código inválido! Tente novamente.");
	}
	System.out.print("Código: ");
	codigo = in.nextInt();
	}
	
	System.out.print("Valor a ser pago: R$" + preco_final);
	}
}
