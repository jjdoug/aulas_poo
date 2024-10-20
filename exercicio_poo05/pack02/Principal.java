package exercicio_poo05.pack02;

import exercicio_poo05.pack01.Pessoa;

public class Principal {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.imprimirDados("Jefferson", 2001, 1.77f);
        p1.calcularIdade();
        
        Pessoa p2 = new Pessoa();
        p2.imprimirDados("Ricson Santana", 1982, 1.77f);
        p2.calcularIdade();
    }
}
