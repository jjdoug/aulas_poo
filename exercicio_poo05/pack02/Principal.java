package exercicio_poo05.pack02;

import exercicio_poo05.pack01.Pessoa;

public class Principal {
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa("Jefferson", 2001, 1.77f);
        p1.imprimirDados();
        p1.calcularIdade();
        
        Pessoa p2 = new Pessoa("Ricson Santana", 1982, 1.77f);
        p2.imprimirDados();
        p2.calcularIdade();
        
        System.out.println("*Dados do maior*");
        if (p1.getAltura() > p2.getAltura()){
            p1.imprimirDados();
        }
        else {
            p2.imprimirDados();
        }
        
        System.out.println("*Dados do mais velho*");
        if (p1.getAno_nasc() < p2.getAno_nasc()){
            p1.imprimirDados();
        }
        else {
            p2.imprimirDados();
        }
    }
}
