package exercicio_poo06;

public class Teste {
    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria("Jé", 123, 1000f);
        ContaBancaria c2 = new ContaBancaria("Doug", 122, 1500f);
        
        c1.sacar(1200f);
        c2.sacar(1200f);
        c1.depositar(1500f);
        c2.depositar(1500f);
        c1.calcularNovoSaldo(4.35f);
        c2.calcularNovoSaldo(4.35f);
        
        c1.mostrarDados();
        c2.mostrarDados();
    }
}
