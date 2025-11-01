package br.edu.atitus.jamile_ferreira.zoo_digital.animais;

import br.edu.atitus.jamile_ferreira.zoo_digital.comportamentos.Corredor;
import br.edu.atitus.jamile_ferreira.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.jamile_ferreira.zoo_digital.comportamentos.Predador;

public class Leao extends Mamifero implements Nadador, Corredor, Predador{
    public Leao(String nome, int idade) {
        super(nome, idade, true);
    }

    
    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está rugindo.");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está se alimentando de algum animal.");
    }

    @Override
    public void correr() {
        System.out.println(getNome() + " está correndo pelo safari.");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando no rio.");
    }
    
    @Override
    public void cacar() {
        System.out.println(getNome() + " está caçando alguma presa.");
    }

}
