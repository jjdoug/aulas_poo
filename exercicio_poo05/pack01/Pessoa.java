package exercicio_poo05.pack01;

public class Pessoa {
    private String nome;
    private int ano_nasc;
    private float altura;
    
    public void imprimirDados(String nome, int ano_nasc, float altura){
        this.nome = nome;
        this.ano_nasc = ano_nasc;
        this.altura = altura;
        System.out.println("Nome: "+ this.nome);
        System.out.println("Ano de nascimento: "+this.ano_nasc);
        System.out.println("Altura: "+this.altura);
    }
    public void calcularIdade(){
        int idade = 2024-ano_nasc;
        System.out.println("Idade: "+idade);
    }
}
