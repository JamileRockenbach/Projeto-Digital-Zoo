package br.edu.atitus.jamile_ferreira.zoo_digital.animais;

import br.edu.atitus.jamile_ferreira.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.jamile_ferreira.zoo_digital.comportamentos.Predador;

public class Pirarucu extends Peixe implements Nadador, Predador{

    public Pirarucu(String nome, int idade) {
        super(nome, idade, "Doce");
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
        System.out.println(getNome() + " está caçando outros peixes.");
    }
}