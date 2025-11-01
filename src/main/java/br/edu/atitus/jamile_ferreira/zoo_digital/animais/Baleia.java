package br.edu.atitus.jamile_ferreira.zoo_digital.animais;

import br.edu.atitus.jamile_ferreira.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.jamile_ferreira.zoo_digital.comportamentos.Predador;

public class Baleia extends Mamifero implements Nadador, Predador{

    public Baleia(String nome, int idade) {
        super(nome, idade, false);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() +  " está assoviando e fazendo 'clicks clicks'...");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo peixes e seus derivados.");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando lindamente no mar.");
    }
    
    @Override
    public void cacar() {
        System.out.println(getNome() + " está caçando suas presas no mar.");
    }
    
}