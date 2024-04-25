package classes;

public class Pessoa {

    private String nome;
    private String sobrenome;
    private int idade;
    private double altura;
    private float peso;
    private String apelido;
    private boolean estaCadastrado;

    //Construtor
    public Pessoa(String nome, int idade, float altura, float peso, String apelido, boolean estaCadastrado){
        System.out.println("Uma pessoa  foi criada!");
        System.out.println("Parabéns!");
        this.nome = nome;
        this.altura = altura;
        this.idade = idade;
        this.peso = peso;
        this.apelido = apelido;
        this.estaCadastrado = estaCadastrado;
    }

    public void imprimirDados(){
        System.out.format("Nome: %s, idade = %d e %.2f\n", nome, idade, altura);

    }

    //Modificador de acesso <retorno nomeDoMetodo();

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
        
    }
    public int getIdade(){
        return  idade;
    }
    public double getAltura(){
        return altura;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }

}
