package br.edu.atitus.jamile_ferreira.zoo_digital.animais;

import br.edu.atitus.jamile_ferreira.zoo_digital.comportamentos.Corredor;
import br.edu.atitus.jamile_ferreira.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.jamile_ferreira.zoo_digital.comportamentos.Predador;

public class Lagarto extends Reptil implements Nadador, Predador, Corredor{

    public Lagarto(String nome, int idade) {
        super(nome, idade, true);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está runindo para os outros.");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo outras presas.");
    }
    
    @Override
    public void correr() {
        System.out.println(getNome() + " está correndo rapidamente pela terra.");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando no ralo do riozinho.");
    }
    
    @Override
    public void cacar() {
        System.out.println(getNome() + " está caçando outras presas.");
    }
}