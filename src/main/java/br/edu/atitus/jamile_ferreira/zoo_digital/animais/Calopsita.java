package br.edu.atitus.jamile_ferreira.zoo_digital.animais;

import br.edu.atitus.jamile_ferreira.zoo_digital.comportamentos.Voador;

public class Calopsita extends Ave implements Voador {

    public Calopsita(String nome, int idade, String corPenas) {
        super(nome, idade, corPenas);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está cantando pela manhã.");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo sementes.");
    }

    @Override
    public void voar() {
        System.out.println(getNome() + " está voando na sua gaiola.");
    }
    
    
}