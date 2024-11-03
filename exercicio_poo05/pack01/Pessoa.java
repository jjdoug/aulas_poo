package exercicio_poo05.pack01;

public class Pessoa {
    //Atributos
    private String nome;
    private float altura;
    private int ano_nasc;
    
    //Métodos especiais
    public Pessoa(String nome, int ano_nasc, float altura){
        this.nome = nome;
        this.ano_nasc = ano_nasc;
        this.altura = altura;
    }
    
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }

    public int getAno_nasc() {
        return ano_nasc;
    }
    public void setAno_nasc(int ano_nasc) {
        this.ano_nasc = ano_nasc;
    }
    
    //Métodos
    public void imprimirDados(){
        System.out.println("Nome: " + getNome());
        System.out.println("Ano de nascimento: " + getAno_nasc());
        System.out.println("Altura: " + getAltura());
    }
    
    public void calcularIdade(){
        int idade = 2024-getAno_nasc();
        System.out.println("Idade: " + idade);
    }
}
