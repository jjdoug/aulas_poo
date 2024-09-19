import java.util.Scanner;

public class CaixaSupermercadoDo {
	public static void main(String[] args){
		
	Scanner in = new Scanner(System.in);
	
	System.out.println("Cód.      Preço "+
	"\n 1   ---  R$0.50"+
	"\n 2   ---  R$1,00"+
	"\n 3   ---  R$4,00"+
	"\n 5   ---  R$7,00"+
	"\n 9   ---  R$8,00");
	
	int codigo = -1;
	int quant = 0;
	double preco_final = 0;
	
	do {
	System.out.print("Código: ");
	codigo = in.nextInt();
	System.out.print("Quantidade: ");
	quant = in.nextInt();

	if(codigo == 0){
		System.out.print("Fim do programa");
	}
	else if(codigo == 1){
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
	} while(codigo!=0);
	
	System.out.print("Valor a ser pago: R$" + preco_final);
	   
	}
}
