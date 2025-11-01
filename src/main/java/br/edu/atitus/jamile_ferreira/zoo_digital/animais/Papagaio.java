package br.edu.atitus.jamile_ferreira.zoo_digital.animais;

import br.edu.atitus.jamile_ferreira.zoo_digital.comportamentos.Voador;

public class Papagaio extends Ave implements Voador {

    public Papagaio(String nome, int idade, String corPenas) {
        super(nome, idade, corPenas);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está cantando.");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo sementinhas");
    }

    @Override
    public void voar() {
        System.out.println(getNome() + " está voando pelo céu.");
    }
    
    
}