import javax.swing.JOptionPane;

import classes.Conta;
import classes.Pessoa; 

public class Principal {
    public static void main(String[] args) throws Exception {
        Pessoa pessoa = new Pessoa("Helena ", "Santos", 52, 1.85f, "Heleninha", 55, true);
        String nome = JOptionPane.showMessageDialog(null, "Nome do Personagem: ");
        String classe = JOptionPane.showMessageDialog(null, "Classe do Personagem: ");
        //modificar = setNomeVariavel
        //pegar = getNomeVariavel

        pessoa.imprimirDados();
        
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
        System.out.println(pessoa.getAltura());

        Conta conta = new Conta();
        System.out.println(conta.getSaldo());
        conta.depositar(2000);
        System.out.println(conta.getSaldo());

        System.out.format("Nome: %s, idade = %d e %.2f", pessoa.getNome(), pessoa.getIdade(), pessoa.getAltura());

        Personagem warrior = new Personagem(nome, classe);
        warrior.mostrarStatus();

    }
}
