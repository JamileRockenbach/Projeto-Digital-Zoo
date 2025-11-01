package br.edu.atitus.jamile_ferreira.zoo_digital.animais;

import br.edu.atitus.jamile_ferreira.zoo_digital.comportamentos.Predador;

public class Camaleao extends Reptil implements Predador{

    public Camaleao(String nome, int idade) {
        super(nome, idade, true);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está grunindo baixinho.");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo insetos.");
    }
    
    @Override
    public void cacar() {
        System.out.println(getNome() + " está caçando lentamente insetinhos.");
    }
}