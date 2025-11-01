package br.edu.atitus.jamile_ferreira.zoo_digital.animais;

import br.edu.atitus.jamile_ferreira.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.jamile_ferreira.zoo_digital.comportamentos.Predador;

public class Salmao extends Peixe implements Nadador, Predador{

    public Salmao(String nome, int idade) {
        super(nome, idade, "Salgada");
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está borbulhando.");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo.");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando.");
    }
    
    @Override
    public void cacar() {
        System.out.println(getNome() + " está caçando outros peixinhos menores.");
    }
}