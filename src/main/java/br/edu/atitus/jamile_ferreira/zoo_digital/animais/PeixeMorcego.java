package br.edu.atitus.jamile_ferreira.zoo_digital.animais;

import br.edu.atitus.jamile_ferreira.zoo_digital.comportamentos.Corredor;
import br.edu.atitus.jamile_ferreira.zoo_digital.comportamentos.Predador;

public class PeixeMorcego extends Peixe implements Corredor, Predador {

    public PeixeMorcego(String nome, int idade) {
        super(nome, idade, "Salgada");
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está borbulhando");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo pesquenas algas");
    }
    
    @Override
    public void correr() {
        System.out.println(getNome() + " está correndinho no fundo do mar");
    }
    
    @Override
    public void cacar() {
        System.out.println(getNome() + " está caçando moluscos.");
    }
}