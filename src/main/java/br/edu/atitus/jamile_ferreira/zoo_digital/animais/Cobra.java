package br.edu.atitus.jamile_ferreira.zoo_digital.animais;

import br.edu.atitus.jamile_ferreira.zoo_digital.comportamentos.Corredor;
import br.edu.atitus.jamile_ferreira.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.jamile_ferreira.zoo_digital.comportamentos.Predador;

public class Cobra extends Reptil implements Nadador, Predador, Corredor{

    public Cobra(String nome, int idade) {
        super(nome, idade, true);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está chocalhando.");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo suas presas.");
    }
    
    @Override
    public void correr() {
        System.out.println(getNome() + " está rastejando rapidamente pela terra.");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando no rio baixo.");
    }
    
    @Override
    public void cacar() {
        System.out.println(getNome() + " está caçando outros animais para dar o bote.");
    }
}
