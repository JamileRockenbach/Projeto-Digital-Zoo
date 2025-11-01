package br.edu.atitus.jamile_ferreira.zoo_digital.animais;

public abstract class Mamifero extends Animal {
    private Boolean temPelo;

    public Mamifero(String nome, int idade, Boolean temPelo) {
        super(nome, idade, "Mamifero");
        this.temPelo = temPelo;
    }

    public Boolean getTemPelo() {
        return temPelo;
    }

    public void setTemPelo(Boolean temPelo) {
        this.temPelo = temPelo;
    }

    public void Amamentar() {
        System.out.println(this.getNome() + " está amamentando seu filhotinho...");
    }
}