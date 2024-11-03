package exercicio_poo06;

public class ContaBancaria {
    //Atributos
    private String nomeCliente;
    private int numConta;
    private float saldo;
    
    //Métodos especiais
    public ContaBancaria(String nome, int num, float saldo){
        this.nomeCliente = nome;
        this.numConta = num;
        this.saldo = saldo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    //Métodos
    
    public void sacar(float valor){
        if (valor <= getSaldo()){
            setSaldo(getSaldo() - valor);
            System.out.println("Saque realizado com sucesso!");
        }
        else {
            System.out.println("Saldo insuficiente.");
        }
        
    }
    
    public void depositar(float valor){
        setSaldo(getSaldo() + valor);
        System.out.println("Depósito realizado com sucesso!");
    }
    
    public void calcularNovoSaldo(float taxa){
        setSaldo(getSaldo() + taxa*getSaldo()/100);
    }
    
    public void mostrarDados(){
        System.out.println("Nome: " + getNomeCliente());
        System.out.println("Número: " + getNumConta());
        System.out.println("Saldo: " + getSaldo());
    }
}
