package br.edu.atitus.jamile_ferreira.zoo_digital.animais;

public abstract class Reptil extends Animal {
    private Boolean trocaDePele;

    public Reptil(String nome, int idade, Boolean trocaDePele) {
        super(nome, idade, "Reptil");
        this.trocaDePele = trocaDePele;
    }

    public Boolean getTrocaDePele() {
        return trocaDePele;
    }

    public void setTrocaDePele(Boolean trocaDePele) {
        this.trocaDePele = trocaDePele;
    }

    public void rastejar() {
        System.out.println(this.getNome() + " está rastejando ou se arrastando.");
    }

}
