package br.edu.atitus.jamile_ferreira.zoo_digital.animais;

public abstract class Peixe extends Animal {
    private String tipoAgua;

    public Peixe(String nome, int idade, String tipoAgua) {
        super(nome, idade, "Peixe");
        this.tipoAgua = tipoAgua;
    }

    public String getTipoAgua() {
        return tipoAgua;
    }

    public void setTipoAgua(String tipoAgua) {
        this.tipoAgua = tipoAgua;
    }

    public void nadar() {
        System.out.println(this.getNome() + " está nadando no mar.");
    }

}
