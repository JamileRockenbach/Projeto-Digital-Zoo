package br.edu.atitus.jamile_ferreira.zoo_digital.animais;

import br.edu.atitus.jamile_ferreira.zoo_digital.comportamentos.Corredor;
import br.edu.atitus.jamile_ferreira.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.jamile_ferreira.zoo_digital.comportamentos.Predador;

public class Jacare extends Reptil implements Nadador, Predador, Corredor{

    public Jacare(String nome, int idade) {
        super(nome, idade, false);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está grunindo para os outros.");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo suas presas.");
    }
    
    @Override
    public void correr() {
        System.out.println(getNome() + " está correndo pela terra.");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando no rio.");
    }
    
    @Override
    public void cacar() {
        System.out.println(getNome() + " está caçando outros animais.");
    }
}