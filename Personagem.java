public class Personagem {
    //Atributos da Classe
    private String nome;
    private int nivel;
    private int forca;
    private int vida;
    private String classe;

    //Metodo Construtor
    public Personagem(String nome, int nivel, int forca, int vida) {
        
        this.nome = nome;
        this.nivel = nivel;
        this.forca = forca;
        this.vida = vida;
        nivel = 1;
        vida = nivel * 100;

        if(classe.equals("Guerreiro")){
            forca = nivel * 2;
        }else{
            forca = nivel;
        }
    }

    public void mostrarStatus(){
        System.out.format("Personagem:  %s\nNivel: %d\nVida: %d\nClasse: %s\nForça: %d", nome, nivel,vida, classe, forca);
    }

public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public int getNivel() {
    return nivel;
}

public void setNivel(int nivel) {
    this.nivel = nivel;
}

public int getForca() {
    return forca;
}

public void setForca(int forca) {
    this.forca = forca;
}

public int getVida() {
    return vida;
}

public void setVida(int vida) {
    this.vida = vida;
}

    }
